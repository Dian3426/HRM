package service;

import domain.Skdept;
import domain.Skjob;
import mapper.SkdeptMapper;
import mapper.SkjobMapper;
import mapper.TalentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Jsz on 2015/9/18.
 */
@Service
public class DeptService extends BaseService{

    @Autowired
    private SkdeptMapper skdeptManager;

    @Autowired
    private SkjobMapper skjobMapper;

    @Autowired
    private  TalentMapper talentMapper;
    /**
     * 创建一个部门
     * @param skdept
     */
    public void createDept(Skdept skdept){
        skdeptManager.createDept(skdept);
    }

    /**
     * 获取对应编号的部门
     * @param dept_id
     * @return
     */
    public Skdept getSkdeptByDeptid(String dept_id){
        return skdeptManager.getDeptByDeptid(dept_id);
    }

    /**
     * 获取所有的部门
     * @return
     */
    public List<Skdept> getAllDepts(){
        return skdeptManager.getAllDepts();
    }

    /**
     * 取出 start行和end行之间的数据
     * @param start
     * @param end
     * @return
     */
    public List<Skdept> getDeptsByRows(int start,int end){
        return skdeptManager.getDeptsByRows(start, end);
    }

    /**
     * 获取所有的部门编号，以及对应名称，以便填写上级部门
     * 注意Skdept中上级部门对应的是id而不是名称
     * @return
     */
    public List<HashMap<String,String>> getAllDeptidAndNames(){
        return skdeptManager.getAllDeptidAndNames();
    }

    public String getNameByDeptid(String dept_id){
        return skdeptManager.getDeptNameByDeptid(dept_id);
    }

    /**
     * dept_id必须与对应修改的目标一致
     * @param dept
     */
    public void updateDept(Skdept dept){
        skdeptManager.updateByDeptid(dept);
    }

    public static String DEPT_ID="DEPT_ID";
    public static String DEPT_NAME = "DEPTNAME";
    public static String EMP_NAME="EMPNAME";
    public static String EMP_ID="EMP_ID";
    public static String TEL="TELE";
    public static String JOB_NAME="JOBNAME";
    public static String TIME= "TIME";

    /**
     * 键名由服务提供
     * @param dept_id
     * @return
     */
    public List<HashMap<String,String>> getStaffByDeptid(String dept_id){
        return skdeptManager.getStaffByDeptid(dept_id);
    }

    /**
     * 删除对应dept_id的数据
     * @param dept_id
     */
    public boolean deleteDept(String dept_id){
        if(!empInThisDept(dept_id)) {
            skdeptManager.delete(dept_id);
            return true;
        }else {
            System.err.println("部门删除失败，存在属于该部门的员工");
            return false;
        }
    }

    /**
     * 获取对应dept_id职工（包括临时员工）总人数
     * @return
     */
    public int getCountByDeptid(String dept_id){
        int count = 0;
        List<Skjob> skjobList = skjobMapper.getJobsByDeptid(dept_id);
        for(Skjob job:skjobList){
            count+=talentMapper.getCountByJobid(job.getJob_id());
        }
        return count;
    }

    public String getDeptidByName(String name){
        return skdeptManager.getDeptidByName(name);
    }

    public int getCount(){
        return skdeptManager.getDeptNum();
    }

    public List<String> getExistDeptid(){
        List<Skdept> deptList = skdeptManager.getAllDepts();
        List<String>  idList = new ArrayList<String>();
        for (Skdept skdept : deptList) {
            idList.add(skdept.getDept_id());
        }
        return idList;
    }

    public boolean isDeptidExist(String emp_id){
        if(getExistDeptid().contains(emp_id))
            return true;
        return false;
    }
}
