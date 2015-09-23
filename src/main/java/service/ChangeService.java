package service;

import domain.*;
import domain.enums.StaffTypes;
import mapper.*;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

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

    @Autowired
    private SkstaffMapper skstaffMapper;

    @Autowired
    private SkempMapper skempMapper;

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public void createChange(Change change) throws Exception{
        Talent talent = talentMapper.getTalentByEmpidAndJobid(change.getEmp_id(), change.getOldjob());
        Talent newTalent = new Talent(change.getEmp_id(),change.getNewjob(),talent.getStatus());
        talentMapper.deleteTalentByIds(talent.getEmp_id(), talent.getJob_id());
        createLegalTalent(newTalent);
        if(talent.getStatus()== StaffTypes.Official){
            skstaffMapper.changeJob(change.getEmp_id(),change.getNewjob());
        }

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

    public Skemp getEmpForChange(String emp_id){
        return skempMapper.getEmpByEmpid(emp_id);
    }


    /**
     * 获取hashmap values的keys
     */
    public static String EMP_ID = "EMP_ID";
    public static String NAME = "NAME";
    public static String OLD_DEPT = "OLDDEPT";
    public static String NEW_DEPT = "NEWDEPT";
    public static String OLD_JOB = "OLDJOB";
    public static String NEW_JOB = "NEWJOB";
    public static String CHANGE_TIME = "CHANGETIME";
    public static String TYPE = "TYPE";
    public static String CHANGE_REASON = "CHANGE_REASON";


    /**
     * 四个参数至少一个不为空，获取相应的搜索结果，keys储存在service中
     * @param emp_id
     * @param emp_name
     * @param beginTime
     * @param endTime
     * @return 返回的键值为 EMP_ID NAME OLD_DEPT NEW_DEPT OLD_JOB NEW_JOB CHANGE_TIME TYPE CHANGE_REASON
     */
    public List<HashMap<String,String>> getHistory(String emp_id,String emp_name,String beginTime,String endTime ){
        if(emp_id.isEmpty()&&emp_name.isEmpty()&&beginTime.isEmpty()&&endTime.isEmpty()) {
            System.out.println("请至少输入一个参数");
            return null;
        }
       return changeMapper.getChangeHistory(emp_id,emp_name,beginTime,endTime);
    }

    public List<Change> getChangeBetween(String begin,String end){
        return changeMapper.getChangesBetween(begin,end);
    }

    /**
     * 根据emp_id获取相应的talent
     * @param emp_id
     * @return
     */
    public  List<Talent> getTalentByEmpid(String emp_id){
        return talentMapper.getTalentByEmpid(emp_id);
    }

    @Autowired
    private LeaveMapper leaveMapper;

    public List<Leave> getLeave(String begin,String end,String job_id){
        return leaveMapper.getLeaves(begin,end,job_id);
    }

    public static String DEPT_ID="DEPT_ID";
    public static String DEPT_NAME="DEPTNAME";
    public static String EMP_NAME="EMPNAME";


    /**
     *
     * @param dept_id
     * @param deptName
     * @param emp_id
     * @param empName
     * @return 返回的键值为 EMP_ID ,DEPT_ID, DEPT_NAME, EMP_NAME
     */
    public List<HashMap<String,String>> getInfoForLeave(String dept_id,String deptName,String emp_id,String empName){
        return leaveMapper.getInfoForLeave(dept_id,deptName,emp_id,empName);
    }
}
