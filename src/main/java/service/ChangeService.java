package service;

import domain.Change;
import domain.History;
import domain.Talent;
import domain.enums.StaffTypes;
import mapper.ChangeMapper;
import mapper.SkjobMapper;
import mapper.TalentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by JSZ on 2015/9/21.
 */
@Service
public class ChangeService extends BaseService {
    @Autowired
    private ChangeMapper changeMapper;

    @Autowired
    private TalentMapper talentMapper;

    @Autowired
    private SkjobMapper skjobMapper;

    @Transactional
    public void createChange(Change change){
        Talent talent = talentMapper.getTalentByEmpidAndJobid(change.getEmp_id(), change.getOldjob());
        Talent newTalent = new Talent(change.getEmp_id(),change.getNewjob(),talent.getStatus());
        if(talent.getStatus()== StaffTypes.Official){
        }

        talentMapper.deleteTalentByIds(talent.getEmp_id(), talent.getJob_id());
        createLegalTalent(newTalent);
        changeMapper.createChange(change);

        History historyOld = new History();
        historyOld.setChangetime(change.getChangetime());
        historyOld.setDept_id(change.getOlddept());
        historyOld.setJob_id(change.getOldjob());
        historyOld.setType(change.getChangereason());
        historyOld.setPeoplenum(skjobMapper.getJobByJobid(change.getOldjob()).getLimitnum());
        historyOld.setMangagername("Administrator");
        historyOld.setOldnum(getCountByJobid(change.getOldjob()));
        historyOld.setNewnum(historyOld.getOldnum()+1);



        History historyNew = new History();
        historyNew.setChangetime(change.getChangetime());
        historyNew.setDept_id(change.getNewdept());
        historyNew.setJob_id(change.getNewjob());
        historyNew.setType(change.getChangereason());
        historyNew.setPeoplenum(skjobMapper.getJobByJobid(change.getNewjob()).getLimitnum());
        historyNew.setMangagername("Administrator");
        historyNew.setOldnum(getCountByJobid(change.getNewjob()));
        historyNew.setNewnum(historyNew.getOldnum()+1);
    }

}
