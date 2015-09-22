package service;

import domain.Skstaff;
import domain.enums.YesOrNo;
import mapper.SkdeptMapper;
import mapper.SkstaffMapper;
import mapper.TemporaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by JSZ on 2015/9/22.
 */
@Service
public class StaffService extends BaseService {

    @Autowired
    private SkstaffMapper skstaffMapper;
    @Autowired
    private SkdeptMapper skdeptMapper;
    @Autowired
    private TemporaryMapper temporaryMapper;

    public static String EMP_ID="EMP_ID";
    public static String DPET_NAME="DEPTNAME";
    public static String JOB_NAME = "JOBNAME";
    public static String EMP_NAME="EMPNAME";
    public static String SEX="SEX";
    public static String TIME="TIME";

    /**
     * 键值是该service的常量
     * @param beginTime
     * @param endTime
     * @param deptName
     * @return
     */
    public List<HashMap<String,String>> getNewHiredStaff(String beginTime,String endTime,String deptName){
        String dept_id = skdeptMapper.getDeptidByName(deptName);
        return skstaffMapper.getNewHiredStaff(beginTime,endTime,dept_id);
    }

    public void changeToOffical(Skstaff staff){
        temporaryMapper.endTemporary(staff.getEmp_id(), YesOrNo.No);
        skstaffMapper.createStaff(staff);
    }
}
