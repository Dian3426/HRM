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
     * ȡ�� start�к�end��֮�������
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

    /**�޸ĸ�λ��Ϣ
     * job.job_id ����Ͳ���Ŀ��һ��
     * @param job
     */
    public void updateJob(Skjob job){
        skjobManager.updateByJobid(job);
    }

    /**
     * ɾ����Ӧjob_id������
     * @param job_id
     */
    public boolean deleteJob(String job_id){
        if(!empHaveThisJob(job_id)) {
            skjobManager.delete(job_id);
            return true;
        }
        else{
            System.err.println("��λɾ������ʧ��,���ڵ��δ˸�λ��Ա��");
            return false;
        }
    }

    /**
     * ����Ƿ��е���job_id��Ӧ��λ��Ա��
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
