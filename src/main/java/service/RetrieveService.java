package service;

import domain.Skemp;
import domain.Skstaff;
import domain.enums.Degree;
import mapper.ChangeMapper;
import mapper.LeaveMapper;
import mapper.SkstaffMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

/**
 * Created by JSZ on 2015/9/22.
 */
public class RetrieveService extends BaseService {
    @Autowired
    private SkstaffMapper skstaffMapper;
    @Autowired
    private LeaveMapper leaveMapper;
    @Autowired
    private ChangeMapper changeMapper;

    public static String DEGREE="DEGREE";
    public static String EMP_ID="EMP_ID";

    /**
     * 获取新入职员工的学历
     * @param month
     * @param dept
     * @return keys： EMP_ID, DEGREE
     */
    public List<Skemp> getSkempsByMonthAndDeptid(String month,String dept){
        return skstaffMapper.getSkempsByMonthAndDeptid(month, dept);
    }

    public int getCountByDegree(String month,String dept,Degree degree){
        int count=0;
        List<Skemp> list = skstaffMapper.getSkempsByMonthAndDeptid(month,dept);
        for (Skemp skemp : list) {
            if(degree == skemp.getDegree())
                count++;
        }
        return count;

    }

    /**
     * 获取本月新入职人数
     * @param month
     * @param dept_id
     * @return
     */
    public int getNewCountByByMonthAndDeptid(String month,String dept_id){
        return  skstaffMapper.getSkempsByMonthAndDeptid(month,dept_id).size();
    }

    /**
     * 获取本月该部门离职人数
     * @param month
     * @param dept_id
     * @return
     */
    public int getLeaveCountByMonthAndDeptid(String month,String dept_id){
        return leaveMapper.getCountByMonthAndDeptid(month,dept_id);
    }

    /**
     * 获取本月该部门调入的人数
     * @param month
     * @param dept_id
     * @return
     */
    public int getInCountByMonthAndDeptid(String month,String dept_id){
        return changeMapper.getCountByMonthAndNewDeptid(month,dept_id);
    }

    /**
     * 获取本月该部门调出的人数
     * @param month
     * @param dept_id
     * @return
     */
    public int getOutCountByMonthAndDeptid(String month,String dept_id){
        return changeMapper.getCountByMonthAndOldDpetid(month,dept_id);
    }

    /**
     * 获取该部门当前所有正式员工人数
     * @param dept_id
     * @return
     */
    public int getCountByDeptid(String dept_id){
        return skstaffMapper.getCountByDeptid(dept_id);
    }
}
