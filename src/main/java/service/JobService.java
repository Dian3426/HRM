package service;

import domain.Skemp;
import domain.Skjob;
import domain.Talent;
import mapper.SkempMapper;
import mapper.SkjobMapper;
import mapper.TalentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Jsz on 2015/9/19.
 */
@Service
public class JobService extends BaseService {
    @Autowired
    private SkjobMapper skjobManager;
    @Autowired
    private TalentMapper talentMapper;
    @Autowired
    private SkempMapper skempMapper;

    public void createJob(Skjob skjob){
        skjobManager.craateJob(skjob);
    }

    public List<Skjob> getAllJobs(){
        return skjobManager.getAllJobs();
    }
    /**
     * 取出 start行和end行之间的数据
     * @param start
     * @param end
     * @return
     */
    public List<Skjob> getJobsByRows(int start,int end){
        return skjobManager.getJobsByRows(start, end);
    }

    public  List<HashMap<String,String>> getJobidAndNames(){
        return skjobManager.getJobidAndNames();
    }

    /**修改岗位信息
     * job.job_id 必须和操作目标一致
     * @param job
     */
    public void updateJob(Skjob job){
        skjobManager.updateByJobid(job);
    }

    /**
     * 删除对应job_id的数据
     * @param job_id
     */
    public boolean deleteJob(String job_id){
        if(!empHaveThisJob(job_id)) {
            skjobManager.delete(job_id);
            return true;
        }
        else{
            System.err.println("岗位删除操作失败,存在担任此岗位的员工");
            return false;
        }
    }

    /**
     * 根据dept_id查询旗下所有岗位
     * @param dept_id
     * @return
     */
    public List<Skjob> getJobsByDeptid(String dept_id){
        return skjobManager.getJobsByDeptid(dept_id);
    }

    /**
     * 获取任职job_id对应岗位的总人数
     * @param job_id
     * @return
     */
    public int getCountByJobid(String job_id){
        return talentMapper.getCountByJobid(job_id);
    }

    public List<Skjob> getJobsByName(String name){
        return skjobManager.getJobsByName(name);
    }

    public Skjob getJobByNameAndDeptid(String name,String dept_id){
        return skjobManager.getJobByNameAndDeptid(name, dept_id);
    }

    public List<String> getAllJobNames(){
        return skjobManager.getAllJobNames();
    }

    /**
     * 获取当前岗位总数
     * @return
     */
    public int getCount(){
        return skjobManager.getCount();
    }

    public List<Skemp> getAllEmpByJobid(String job_id){
        List<Talent> talents =null;
        talents = talentMapper.getTalentByJobid(job_id);
        if(!talents.isEmpty()) {
            List<Skemp> emps = new ArrayList<Skemp>();
            for (Talent talent : talents) {
                emps.add(skempMapper.getEmpByEmpid(talent.getEmp_id()));
            }
            return  emps;
        }else {
            System.err.println("尚未有担任该岗位的员工");
            return null;
        }

    }
}
