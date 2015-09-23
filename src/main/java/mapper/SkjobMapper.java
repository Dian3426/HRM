package mapper;

import domain.Skjob;
import domain.enums.YesOrNo;
import org.apache.ibatis.annotations.*;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Jsz on 2015/9/19.
 */
public interface SkjobMapper {

    @Insert("INSERT INTO  SKJOB VALUES (null,#{Skjob.name},#{Skjob.job_id},#{Skjob.type,typeHandler=org.apache.ibatis.type.EnumTypeHandler},#{Skjob.limitnum},#{Skjob.dept_id},#{Skjob.islimit,typeHandler=org.apache.ibatis.type.EnumTypeHandler})")
    void craateJob(@Param("Skjob")Skjob skjob);

    @Select("SELECT * FROM SKJOB")
    List<Skjob> getAllJobs();

    @Select("SELECT * FROM  SKJOB WHERE rownum <=#{end} minus SELECT * FROM  SKJOB WHERE rownum >=#{start} ")
    List<Skjob> getJobsByRows(@Param("start")int start,@Param("end")int end);

    @Select("SELECT JOB_ID,NAME FROM SKJOB")
    List<HashMap<String,String>> getJobidAndNames();

    @Update("UPDATE SKJOB SET NAME=#{name},TYPE=#{TYPE ,typeHandler=org.apache.ibatis.type.EnumTypeHandler},LIMITNUM=#{limitnum},DEPT_ID=#{dept_id}," +
            "ISLIMIT=#{islimit,typeHandler=org.apache.ibatis.type.EnumTypeHandler} WHERE JOB_ID=#{job_id}")
    void updateByJobid(@Param("Skjob")Skjob skjob);

    @Delete("DELETE  FROM SKJOB WHERE JOB_ID=#{job_id}")
    void delete(@Param("job_id")String job_id);

    @Select("SELECT * FROM SKJOB WHERE DEPT_ID=#{dept_id}")
    List<Skjob> getJobsByDeptid(@Param("dept_id")String dept_id);

    @Select("SELECT * FROM SKJOB WHERE JOB_ID=#{job_id}")
    Skjob getJobByJobid(@Param("job_id")String job_id);

    @Select("SELECT * FROM SKJOB WHERE NAME =#{name}")
    List<Skjob> getJobsByName(@Param("name") String name);

    @Select("SELECT * FROM SKJOB WHERE NAME =#{name} AND DEPT_ID=#{dept_id}")
    Skjob getJobByNameAndDeptid(@Param("name")String name,@Param("dept_id")String dept_id);

    @Select("SELECT DISTINCT NAME FROM SKJOB")
    List<String> getAllJobNames();

    @Select("SELECT COUNT(JOB_ID) FROM SKJOB")
    int getCount();
}
