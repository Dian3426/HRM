package service;

import domain.Change;
import domain.Talent;
import domain.enums.StaffTypes;
import mapper.ChangeMapper;
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

    @Transactional
    public void createChange(Change change){
        Talent talent = talentMapper.getTalentByEmpidAndJobid(change.getEmp_id(), change.getOldjob());
        Talent newTalent = new Talent(change.getEmp_id(),change.getNewjob(),talent.getStatus());
        if(talent.getStatus()== StaffTypes.Official){
        }

        talentMapper.deleteTalentByIds(talent.getEmp_id(), talent.getJob_id());
        createLegalTalent(newTalent);
        changeMapper.createChange(change);

        Histroy history = new Histroy();
        history.setChangetime(change.getChangetime());

    }

}
