package service;

import domain.Skjob;
import domain.Talent;
import domain.enums.YesOrNo;
import mapper.SkjobMapper;
import mapper.TalentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by JSZ on 2015/9/21.
 */
@Service
public class BaseService{
    @Autowired
    private SkjobMapper skjobMapper;

    @Autowired
    private TalentMapper talentMapper;

    /**
     * 安全的符合完整性约束的方法
     * @param talent
     * @return
     */
    protected boolean createLegalTalent(Talent talent){

        String job_id = talent.getJob_id();
        Skjob job = skjobMapper.getJobByJobid(job_id);
        if(isLimitThisJob(job.getIslimit())){
            int count=talentMapper.getCountByJobid(job_id);
            if(count<job.getLimitnum()){
                talentMapper.createTalent(talent);
                return true;
            }
        }else {
            job.setLimitnum(job.getLimitnum() + 1);
            skjobMapper.updateByJobid(job);
            talentMapper.createTalent(talent);
            return true;
        }
        System.err.println("非法的创建：超过编制限制");
        return false;
    }

    protected boolean isLimitThisJob(YesOrNo isLimit){
        if(isLimit.equals(YesOrNo.Yes)){
            return true;
        }else{
            return false;
        }
    }

}
