package mapper;

import domain.Skemp;
import domain.Skstaff;
import org.apache.ibatis.annotations.*;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Jsz on 2015/9/20.
 */
public interface SkstaffMapper {

    @Insert("INSERT INTO SKSTAFF VALUES (null,#{emp_id},#{job_id},#{time})")
    void createStaff(Skstaff skstaff);

    @Update("UPDATE SKSTAFF SET job_id=#{job_id},time=#{time} WHERE emp_id = #{emp_id}")
    void updateStaff(@Param("Skstaff")Skstaff skstaff);

    @Update("UPDATE SKSTAFF SET JOB_ID=#{job_id} WHERE  EMP_ID=#{emp_id}")
    void changeJob(@Param("emp_id")String emp_id,@Param("job_id")String job_id);

    @Delete("DELETE FROM SKSTAFF WHERE EMP_ID=#{emp_id}")
    void deleteByEmpid(String emp_id);

    @Select("SELECT e.EMP_ID,d.NAME DEPTNAME,j.NAME JOBNAME,e.NAME EMPNAME,e.SEX,s.TIME FROM SKEMP e,SKDEPT d,SKJOB j,SKSTAFF s WHERE " +
            "s.EMP_ID = e.EMP_ID AND s.JOB_ID = j.JOB_ID AND j.DEPT_ID=#{dept_id} AND " +
            "TO_DATE(#{beginTime},\"yyyy-mm-dd\") &gt; TO_DATE(s.TIME,\"yyyy-mm-dd\") AND " +
            "TO_DATE(#{endTime},\"yyyy-mm-dd\") &lt; TO_DATE(begintime,\"yyyy-mm-dd\") ")
    List<HashMap<String,String>> getNewHiredStaff(@Param("beginTime")String beginTime,@Param("endTime")String endTime,@Param("dept_id")String dept_id);

    @Select("SELECT COUNT(*) FROM SKSTAFF WHERE substr(TIME,0,7) =#{month}")
    int getAmountByMonth(String month);

    @Select("SELECT e.* FROM SKJOB j,SKSTAFF s,SKEMP e WHERE j.DEPT_ID=#{dept_id} AND j.JOB_ID=s.JOB_ID AND " +
            "s.EMP_ID=e.EMP_ID AND substr(s.TIME,0,7)=#{month}")
    List<Skemp> getSkempsByMonthAndDeptid(@Param("month")String month,@Param("dept_id")String dept_id);

    @Select("SELECT COUNT(s.EMP_ID) FROM SKSTAFF s,SKJOB j WHERE s.JOB_ID=j.JOB_ID AND j.DEPT_ID =#{dept_id}")
    int getCountByDeptid(String dept_id);
}
