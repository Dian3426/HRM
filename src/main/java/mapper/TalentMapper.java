package mapper;

import domain.Talent;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Jsz on 2015/9/20.
 */
public interface TalentMapper {
    @Insert("INSERT INTO TALENT VALUES (null,#{emp_id},#{job_id},#{status,typeHandler=org.apache.ibatis.type.EnumTypeHandler})")
    void createTalent(@Param("Talent") Talent talent);

    @Select("SELECT * FROM TALENT WHERE JOB_ID=#{job_id}")
    List<Talent> getTalentByJobid(@Param("job_id")String job_id);

    @Select("SELECT * FROM TALENT WHERE EMP_ID=#{emp_id}")
    List<Talent> getTalentByEmpid(@Param("emp_id")String emp_id);

    @Select("SELECT COUNT(emp_id) FROM TALENT WHERE JOB_ID=#{job_id}")
    int getCountByJobid(@Param("job_id")String job_id);

    @Select("SELECT * FROM TALENT WHERE  EMP_ID=#{emp_id} AND JOB_ID=#{job_id} ")
    Talent getTalentByEmpidAndJobid(@Param("emp_id")String emp_id,@Param("job_id")String job_id);

    @Delete("DELETE FROM TALENT WHERE EMP_ID=#{emp_id} AND JOB_ID=#{job_id} ")
    void deleteTalentByIds(@Param("emp_id")String emp_id,@Param("job_id")String job_id);
}
