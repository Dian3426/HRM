package mapper;

import common.SqlProvider;
import domain.Leave;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Jsz on 2015/9/20.
 */
public interface LeaveMapper {

    @Insert("INSERT INTO LEAVE VALUES (null,#{emp_id},#{job_id},#{place},#{time},#{reason})")
    void createLeave(Leave leave);

    @Select("SELECT * FROM LEAVE WHERE TO_DATE(#{begin},\"yyyy-mm-dd\") < TO_DATE(time,\"yyyy-mm-dd\") AND " +
            " TO_DATE( #{end},\"yyyy-mm-dd\") >TO_DATE(time,\"yyyy-mm-dd\") AND job_id=#{job_id")
    List<Leave> getLeaves(String begin,String end,String job_id);


    @SelectProvider(type = SqlProvider.class,method = "selectInfoForLeave")
    List<HashMap<String,String>> getInfoForLeave(@Param("dept_id")String dept_id,@Param("deptName")String deptName,
                                                 @Param("emp_id")String emp_id,@Param("empName")String empName);

    @Select("SELECT COUNT(l.EMP_ID) FROM LEAVE l,SKJOB j WHERE j.JOB_ID=l.JOB_ID AND j.DEPT_ID=#{dept_id} AND " +
            "substr(l.TIME,0,7)=#{month}")
    int getCountByMonthAndDeptid(@Param("month")String month,@Param("dept_id") String dept_id);
}
