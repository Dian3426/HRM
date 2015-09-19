package mapper;

import domain.Skjob;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Jsz on 2015/9/19.
 */
public interface SkjobManager {

    @Insert("INSERT INTO  SKJOB VALUES (null,#{Skjob.name},#{Skjob.job_id},#{Skjob.type,typeHandler=org.apache.ibatis.type.EnumTypeHandler},#{Skjob.limitnum},#{Skjob.dept_id},#{Skjob.islimit,typeHandler=org.apache.ibatis.type.EnumTypeHandler})")
    void craateJob(@Param("Skjob")Skjob skjob);

    @Select("SELECT * FROM SKJOB")
    List<Skjob> getAllJobs();

    @Select("SELECT * FROM  SKJOB WHERE rownum <=#{end} minus SELECT * FROM  SKJOB WHERE rownum >=#{start} ")
    List<Skjob> getJobsByRows(@Param("start")int start,@Param("end")int end);

    @Select("SELECT JOB_ID,NAME FROM SKJOB")
    HashMap<String,String> getJobidAndNames();
}
