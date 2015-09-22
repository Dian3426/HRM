package service;

import domain.Skjob;
import domain.Talent;
import domain.enums.YesOrNo;
import mapper.SkdeptMapper;
import mapper.SkjobMapper;
import mapper.TalentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JSZ on 2015/9/21.
 */
@Service
public class BaseService {


    @Autowired
    private SkjobMapper skjobMapper;

    @Autowired
    private TalentMapper talentMapper;

    @Autowired
    private SkdeptMapper skdeptMapper;

    /**
     * ��ȫ�ķ���������Լ���ķ���
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
        System.err.println("�Ƿ��Ĵ�����������������");
        return false;
    }

    protected boolean isLimitThisJob(YesOrNo isLimit){
        if(isLimit.equals(YesOrNo.Yes)){
            return true;
        }else{
            return false;
        }
    }
    protected boolean empInThisDept(String dept_id){
        List<Skjob> list = skjobMapper.getJobsByDeptid(dept_id);
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


    /**
     * ����Ƿ��е���job_id��Ӧ��λ��Ա��
     * @param job_id
     * @return
     */
    protected boolean empHaveThisJob(String job_id) {
        if (talentMapper.getTalentByJobid(job_id).isEmpty())
            return false;
        else
            return true;
    }

    /**
     * ��ȡ��ְjob_id��Ӧ��λ��������
     * @param job_id
     * @return
     */
    protected int getCountByJobid(String job_id){
        return talentMapper.getCountByJobid(job_id);
    }

    /**
     * ���� ������ + ��λ�� ��ȡ��Ӧ�� dept_id �� job_id
     * @param deptName
     * @param jobName
     * @return
     */
    protected List<String> getDeptAndJobIdsByNames(String deptName,String jobName){
        List<String> list = new ArrayList<String>();
        String dept_id = skdeptMapper.getDeptidByName(deptName);
        list.add(dept_id);

        String job_id = skjobMapper.getJobByNameAndDeptid(jobName,dept_id).getJob_id();
        list.add(job_id);
        return list;
    }

}
