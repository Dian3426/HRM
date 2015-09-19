package mapper;

import domain.Skdept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Jsz on 2015/9/18.
 */
public interface SkdeptManager {

    @Insert("INSERT INTO SKDEPT VALUES (NULL ,#{Skdept.dept_id},#{Skdept.name},#{Skdept.type,typeHandler=org.apache.ibatis.type.EnumTypeHandler},#{Skdept.tele}," +
            "#{Skdept.fax},#{Skdept.discrip,jdbcType=VARCHAR},#{Skdept.superd,jdbcType=VARCHAR} ,#{Skdept.createtime})")
    void createDept(@Param("Skdept") Skdept skdept);

    @Select("SELECT *  FROM SKDEPT")
    List<Skdept> getAllDepts();

    @Select(" select * from SKDEPT WHERE rownum<=#{end}  minus  select * from SKDEPT WHERE rownum>=#{start}")
    List<Skdept> getDeptsByRows(@Param("start")int start,@Param("end")int end );

    @Select("SELECT DEPT_ID, NAME FROM SKDEPT")
    HashMap<String,String> getAllDeptidAndNames();
}
