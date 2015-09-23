package mapper;

import domain.Skdept;
import domain.Skemp;
import org.apache.ibatis.annotations.*;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Jsz on 2015/9/18.
 */
public interface SkdeptMapper {

    @Insert("INSERT INTO SKDEPT VALUES (NULL ,#{Skdept.dept_id},#{Skdept.name},#{Skdept.type,typeHandler=org.apache.ibatis.type.EnumTypeHandler},#{Skdept.tele}," +
            "#{Skdept.fax},#{Skdept.discrip,jdbcType=VARCHAR},#{Skdept.superd,jdbcType=VARCHAR} ,#{Skdept.createtime})")
    void createDept(@Param("Skdept") Skdept skdept);

    @Select("SELECT *  FROM SKDEPT")
    List<Skdept> getAllDepts();

    @Select(" select * from SKDEPT WHERE rownum<=#{end}  minus  select * from SKDEPT WHERE rownum>=#{start}")
    List<Skdept> getDeptsByRows(@Param("start")int start,@Param("end")int end );

    @Select("SELECT DEPT_ID, NAME FROM SKDEPT")
    List<HashMap<String,String>> getAllDeptidAndNames();

    @Select("SELECT NAME FROM SKDEPT WHERE DEPT_ID=#{dept_id}")
    String getDeptNameByDeptid(@Param("dept_id")String dept_id);

    @Update("UPDATE SKDEPT SET name=#{name},TYPE=#{type ,typeHandler=org.apache.ibatis.type.EnumTypeHandler},TELE=#{tele}," +
            "FAX=#{fax},DISCRIP=#{discrip},SUPERD=#{superd},CREATETIME=#{createtime} WHERE DEPT_ID=#{emp_id}")
    void updateByDeptid(@Param("Skdept")Skdept skdept);

    @Delete("DELETE FROM SKDEPT WHERE DEPT_ID=#{dept_id}")
    void delete(@Param("dept_id")String dept_id);

    @Select("SELECT DEPT_ID FROM SKDEPT WHERE NAME=#{name}")
    String getDeptidByName(@Param("name")String name);

    @Select("SELECT * FROM SKDEPT WHERE DEPT_ID=#{dept_id}")
    Skdept getDeptByDeptid(@Param("dept_id")String dept_id);

    @Select("SELECT COUNT(dept_id) FROM  SKDEPT")
    int getDeptNum();

    @Select("SELECT d.DEPT_ID,d.NAME DEPTNAME,e.NAME EMPNAME,e.EMP_ID,j.NAME JOBNAME,e.TELE,s.TIME FROM SKEMP e,SKSTAFF s,SKJOB j WHERE " +
            "e.EMP_ID=s.EMP_ID AND j.JOB_ID=s.JOB_ID AND j.DEPT_ID=d.DEPT_ID AND d.DEPT_ID=#{dept_id}")
    List<HashMap<String,String>> getStaffByDeptid(@Param("dept_id")String dept_id);
}
