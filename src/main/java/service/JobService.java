package service;

import domain.Skjob;
import mapper.SkjobManager;
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
    private SkjobManager skjobManager;

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
        return skjobManager.getJobsByRows(start,end);
    }

    public  List<HashMap<String,String>> getJobidAndNames(){
        return skjobManager.getJobidAndNames();
    }
}
