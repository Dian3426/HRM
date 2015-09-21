package service;

import domain.Skdept;
import domain.Skjob;
import mapper.SkdeptMapper;
import mapper.SkjobMapper;
import mapper.TalentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Jsz on 2015/9/18.
 */
@Service
public class DeptService {

    @Autowired
    private SkdeptMapper skdeptManager;

    @Autowired
    private SkjobMapper skjobManager;

    @Autowired
    private TalentMapper talentMapper;
    /**
     * 创建一个部门
     * @param skdept
     */
    public void createDept(Skdept skdept){
        skdeptManager.createDept(skdept);
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

    /**
     * dept_id必须与对应修改的目标一致
     * @param dept
     */
    public void updateDept(Skdept dept){
        skdeptManager.updateByDeptid(dept);
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

    private boolean empInThisDept(String dept_id){
        List<Skjob> list = skjobManager.getJobsByDeptid(dept_id);
        if(list.isEmpty())
            return false;
        else {
            for(Skjob job:list){
                if(!talentMapper.getTalentByJobid(job.getJob_id()).isEmpty())
                    return true;
            }
            return false;
        }
    }
}
