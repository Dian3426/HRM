package mapper;

import domain.Temporary;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Jsz on 2015/9/19.
 */
public interface TemporaryMapper {
    @Insert("INSERT INTO TEMPORARY VALUES (null,#{emp_id},#{job_id},#{begintime},#{endtime},#{result},#{dealtime},#{ope_id},#{explanation,jdbcType=VARCHAR})")
    void createTemporary(@Param("Temporary") Temporary temporary);
}
