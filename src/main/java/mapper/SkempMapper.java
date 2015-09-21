package mapper;

import domain.Skemp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Jsz on 2015/9/19.
 */
public interface SkempMapper {
    @Insert("INSERT INTO SKEMP VALUES (null,#{emp_id},#{name},#{sex,typeHandler=org.apache.ibatis.type.EnumTypeHandler},#{bir},#{idcard},#{toworktime}," +
            "#{zzmm,typeHandler=org.apache.ibatis.type.EnumTypeHandler},#{NATIONAL,typeHandler=org.apache.ibatis.type.EnumTypeHandler,jdbcType=VARCHAR },#{nativ,jdbcType=VARCHAR}," +
            "#{tele,jdbcType=VARCHAR},#{mail,jdbcType=VARCHAR},#{height,jdbcType=VARCHAR},#{bloodtype,jdbcType=VARCHAR,typeHandler=org.apache.ibatis.type.EnumTypeHandler},#{birthplace,jdbcType=VARCHAR}," +
            "#{hkplace,jdbcType=VARCHAR},#{degree,jdbcType=VARCHAR,typeHandler=org.apache.ibatis.type.EnumTypeHandler},#{graduateschool,jdbcType=VARCHAR},#{professional,jdbcType=VARCHAR},#{graduatetime,jdbcType=VARCHAR}," +
            "#{source,typeHandler=org.apache.ibatis.type.EnumTypeHandler})")
    void createEmp(@Param("Skemp")Skemp skemp);

    @Select("SELECT * FROM SKEMP WHERE IDCARD=#{idcard}")
    Skemp getEmpbyIdcard(@Param("idcard")String idcard);

    @Select("SELECT * FROM SKEMP")
    List<Skemp> getAllEmps();

    @Select("SELECT COUNT(emp_id) FROM SKEMP")
    int getCount();
}
