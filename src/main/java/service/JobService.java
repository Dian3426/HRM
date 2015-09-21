package service;

import domain.Skjob;
import mapper.SkjobMapper;
import mapper.TalentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Jsz on 2015/9/19.
 */
@Service
public class JobService {
    @Autowired
    private SkjobMapper skjobManager;
    @Autowired
    private TalentMapper talentMapper;

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
     * 监测是否有担任job_id对应岗位的员工
     * @param job_id
     * @return
     */
    private boolean empHaveThisJob(String job_id){
        if(talentMapper.getTalentByJobid(job_id).isEmpty())
            return false;
        else
            return true;
    }
}
