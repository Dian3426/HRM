package mapper;

import domain.Skstaff;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Jsz on 2015/9/20.
 */
public interface SkstaffMapper {

    @Insert("INSERT INTO SKSTAFF VALUES (null,#{emp_id},#{job_id},#{time})")
    void createStaff(@Param("Skstaff")Skstaff skstaff);

    @Update("UPDATE SKSTAFF SET job_id=#{job_id},time=#{time} WHERE emp_id = #{emp_id}")
    void updateStaff(@Param("Skstaff")Skstaff skstaff);

    @Update("UPDATE SKSTAFF SET JOB_ID=#{job_id} WHERE  EMP_ID=#{emp_id}")
    void changeJob(@Param("emp_id")String emp_id,@Param("job_id")String job_id);

    @Select("SELECT e.EMP_ID,d.NAME DEPTNAME,j.NAME JOBNAME,e.NAME EMPNAME,e.SEX,s.TIME FROM SKEMP e,SKDEPT d,SKJOB j,SKSTAFF s WHERE " +
            "s.EMP_ID = e.EMP_ID AND s.JOB_ID = j.JOB_ID AND j.DEPT_ID=#{dept_id} AND " +
            "TO_DATE(#{beginTime},\"yyyy-mm-dd\") &gt; TO_DATE(s.TIME,\"yyyy-mm-dd\") AND " +
            "TO_DATE(#{endTime},\"yyyy-mm-dd\") &lt; TO_DATE(begintime,\"yyyy-mm-dd\") ")
    List<HashMap<String,String>> getNewHiredStaff(String beginTime,String endTime,String dept_id);
}
