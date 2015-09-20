package mapper;

import domain.Talent;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Jsz on 2015/9/20.
 */
public interface TalentMapper {
    @Insert("INSERT INTO TALENT VALUES (null,#{emp_id},#{job_id},#{status,typeHandler=org.apache.ibatis.type.EnumTypeHandler})")
    void createTalent(@Param("Talent") Talent talent);
}
