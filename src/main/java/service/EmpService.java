package service;

import domain.*;
import mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
    @Autowired
    private SkjobMapper skjobManager;

    /**
     * �ĸ������� emp_id����һ��
     * @param skemp
     * @param occupationcareer
     * @param societyrelation
     * @param talent
     */
    @Transactional
    public void createEmpTotally(Skemp skemp,Occupationcareer occupationcareer, Societyrelation societyrelation, Talent talent){
        String emp_id = skemp.getEmp_id();
        if(emp_id.equals(occupationcareer.getEmp_id())&&emp_id.equals(societyrelation.getEmp_id())&&emp_id.equals(talent.getEmp_id())){
            createEmp(skemp);
            createOccupationcareer(occupationcareer);
            creatSocietyrelation(societyrelation);
            createLegalTalent(talent);
        }
    }

    public  void createEmp(Skemp skemp){skempMapper.createEmp(skemp);
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
     * ����ȫ�ķ��������ܻ��ƻ����ݿ�������Լ��
     * @param talent
     */
    public  void createTalent(Talent talent){
        talentMapper.createTalent(talent);
    }


    public void creatSocietyrelation(Societyrelation societyrelation){
        societyrelationMapper.creatSocietyrelation(societyrelation);
    }

    /**
     * �������ڵ�Ա������ע��ñ�
     * @param temporary
     */
    public void createTemporary(Temporary temporary){
        temporaryMapper.createTemporary(temporary);
    }

    /**
     * �ĸ���������һ����Ϊ�գ���ȡ��Ӧ���������
     * @param emp_id
     * @param empName
     * @param begintime
     * @param endtime
     * @return
     */
    public List<HashMap<String,String>> getTemporaryEmpInfo(String emp_id,String empName,String begintime,String endtime){
        return temporaryMapper.getTemporaryInfo(emp_id, empName, begintime, endtime);
    }
}
