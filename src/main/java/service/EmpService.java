package service;

import domain.Occupationcareer;
import domain.Skemp;
import domain.Societyrelation;
import domain.Temporary;
import mapper.OccupationcareerMapper;
import mapper.SkempMapper;
import mapper.SocietyrelationMapper;
import mapper.TemporaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Jsz on 2015/9/20.
 */
public class EmpService {
    @Autowired
    private SkempMapper skempMapper;
    @Autowired
    private OccupationcareerMapper occupationcareerMapper;
    @Autowired
    private SocietyrelationMapper societyrelationMapper;
    @Autowired
    private TemporaryMapper temporaryMapper;

    @Transactional
    void createEmpTotally(Skemp skemp,Occupationcareer occupationcareer, Societyrelation societyrelation){
        if(skemp.getEmp_id().equals(occupationcareer.getEmp_id())&&skemp.getEmp_id().equals(societyrelation.getEmp_id())){
            createEmp(skemp);
            createOccupationcareer(occupationcareer);
            creatSocietyrelation(societyrelation);
        }
    }

    void createEmp(Skemp skemp){
        skempMapper.createEmp(skemp);
    }

    void createOccupationcareer(Occupationcareer occupationcareer){
        occupationcareerMapper.createOccupationcareer(occupationcareer);
    }

    void creatSocietyrelation(Societyrelation societyrelation){
        societyrelationMapper.creatSocietyrelation(societyrelation);
    }

    void createTemporary(Temporary temporary){
        temporaryMapper.createTemporary(temporary);
    }
}
