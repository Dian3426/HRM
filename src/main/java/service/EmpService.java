package service;

import domain.*;
import mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Jsz on 2015/9/20.
 */
@Service
public class EmpService {
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

    @Transactional
    public void createEmpTotally(Skemp skemp,Occupationcareer occupationcareer, Societyrelation societyrelation, Talent talent){
        String emp_id = skemp.getEmp_id();
        if(emp_id.equals(occupationcareer.getEmp_id())&&emp_id.equals(societyrelation.getEmp_id())&&emp_id.equals(talent.getEmp_id())){
            createEmp(skemp);
            createOccupationcareer(occupationcareer);
            creatSocietyrelation(societyrelation);
            createTalent(talent);
        }
    }

    public  void createEmp(Skemp skemp){
        skempMapper.createEmp(skemp);
    }

    public void createOccupationcareer(Occupationcareer occupationcareer){
        occupationcareerMapper.createOccupationcareer(occupationcareer);
    }

    public  void createTalent(Talent talent){
        talentMapper.createTalent(talent);
    }
    public void creatSocietyrelation(Societyrelation societyrelation){
        societyrelationMapper.creatSocietyrelation(societyrelation);
    }

    public void createTemporary(Temporary temporary){
        temporaryMapper.createTemporary(temporary);
    }

    public List<HashMap<String,String>> getTemporaryEmpInfo(String emp_id,String empName,String begintime,String endtime){
        return temporaryMapper.getTemporaryInfo(emp_id, empName, begintime, endtime);
    }
}
