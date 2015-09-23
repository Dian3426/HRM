package service;

import domain.*;
import mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Jsz on 2015/9/20.
 */
@Service
public class EmpService extends BaseService{
    @Autowired
    private SkempMapper skempMapper;
    @Autowired
    private OccupationcareerMapper occupationcareerMapper;
    @Autowired
    private SocietyrelationMapper societyrelationMapper;
    @Autowired
    private TemporaryMapper temporaryMapper;
    @Autowired
    private TalentMapper talentMapper;

    /**
     * 四个参数的 emp_id必须一致
     * @param skemp
     * @param occupationcareer
     * @param societyrelation
     * @param talent
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public void createEmpTotally(Skemp skemp,Occupationcareer occupationcareer, Societyrelation societyrelation, Talent talent) throws Exception {
        String emp_id = skemp.getEmp_id();
        if(emp_id.equals(occupationcareer.getEmp_id())&&emp_id.equals(societyrelation.getEmp_id())&&emp_id.equals(talent.getEmp_id())){
            try {
            createEmp(skemp);
            createOccupationcareer(occupationcareer);
            creatSocietyrelation(societyrelation);
            createLegalTalent(talent);
            }catch (Exception e){
                throw new Exception("员工创建失败");
            }
        }
    }

    private  void createEmp(Skemp skemp){skempMapper.createEmp(skemp);
    }

    public List<String> getExistEmpid(){
        List<Skemp> empList = skempMapper.getAllEmps();
        List<String>  idList = new ArrayList<String>();
        for(Skemp emp:empList){
           idList.add(emp.getEmp_id());
        }
        return idList;
    }

    public boolean isEmpidExist(String emp_id){
        if(getExistEmpid().contains(emp_id))
            return true;
        return false;
    }


    public void createOccupationcareer(Occupationcareer occupationcareer){
        occupationcareerMapper.createOccupationcareer(occupationcareer);
    }

    /**
     * 不安全的方法，可能会破坏数据库完整性约束
     * @param talent
     */
    private  void createTalent(Talent talent){
        talentMapper.createTalent(talent);
    }


    public void creatSocietyrelation(Societyrelation societyrelation){
        societyrelationMapper.creatSocietyrelation(societyrelation);
    }

    /**
     * 有试用期的员工必须注册该表
     * @param temporary
     */
    public void createTemporary(Temporary temporary){
        temporaryMapper.createTemporary(temporary);
    }
    /**
     * 获取hashmap values的keys
     */
    public static String EMP_ID = "EMP_ID";
    public static String EMP_NAME = "EMPNAME";
    public static String DEPT_NAME = "DEPTNAME";
    public static String JOB_NAME = "JOBNAME";
    public static String STATUS = "STATUS";
    public static String BEGINTIME = "BEGINTIME";
    public static String ENDTIME = "ENDTIME";
    /**
     * 四个参数至少一个不为空，获取相应的搜索结果，keys储存在service中
     * @param emp_id
     * @param empName
     * @param begintime
     * @param endtime
     * @return
     */
    public List<HashMap<String,String>> getTemporaryEmpInfo(String emp_id,String empName,String begintime,String endtime){
        if(emp_id==null&&empName==null&&begintime==null&&endtime==null){
            System.out.println("请至少输入一个参数");
            return null;
        }
        return temporaryMapper.getTemporaryInfo(emp_id, empName, begintime, endtime);
    }

    /**
     * 获取输入公司员工信息表的总数
     * @return
     */
    public int getCount(){
        return skempMapper.getCount();
    }

    /**
     * 至少一个参数不为空
     * @param idcard
     * @return 返回带有三个对象的list<Object> ，分别实例化为 @class Skemp，Occupationcareer，Societyrelation
     */
    public List<Object> getTalentInfoByIdcard(String idcard){
        return getEmpInfoByEmpidOrIdcard(null,idcard);
    }

    /**
     * 至少一个参数不为空
     * @param emp_id
     * @param idcard
     * @return 返回带有三个对象的list<Object> ，分别实例化为 @class Skemp，Occupationcareer，Societyrelation
     */
    public List<Object> getEmpInfoByEmpidOrIdcard(String emp_id,String idcard){
        List<Object> list = new ArrayList<Object>();
        try{
        Skemp skemp=null;
        if(emp_id.isEmpty()&&idcard.isEmpty()){
            System.err.println("参数不能全为空");
            return null;
        }
        boolean flag = true;
        if(!emp_id.isEmpty()){
            skemp = skempMapper.getEmpByEmpid(emp_id);
            flag = false;
        }
        if(flag||!idcard.isEmpty()){
            skemp= skempMapper.getEmpbyIdcard(idcard);
        }
        list.add(skemp);
        }
        catch (NullPointerException e){
            System.err.println("没有找到对应的员工");
           list.add(null);
        }
        try {
            Occupationcareer occupationcareer =getCareerByEmpid(emp_id);
            list.add(occupationcareer);
        }catch (NullPointerException e){
            System.err.println("没有找到对应的职业生涯");
            list.add(null);
        }
        try {
            Societyrelation societyrelation = getRelationByEmpid(emp_id);
        }catch (NullPointerException e){
            System.err.println("没有找到对应的社会关系");
            list.add(null);
        }
        return list;
    }

    public Occupationcareer getCareerByEmpid(String emp_id){
        return occupationcareerMapper.getOccopationcareerByEmpid(emp_id);
    }

    public Societyrelation getRelationByEmpid(String emp_id){
        return societyrelationMapper.getSocietyrelationByEmpid(emp_id);
    }

}
