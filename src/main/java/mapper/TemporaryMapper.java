package mapper;

import common.SqlProvider;
import domain.Temporary;
import domain.enums.YesOrNo;
import org.apache.ibatis.annotations.*;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Jsz on 2015/9/19.
 */
public interface TemporaryMapper {
    @Insert("INSERT INTO TEMPORARY VALUES (null,#{emp_id},#{job_id},#{begintime},#{endtime},#{status,typeHandler=org.apache.ibatis.type.EnumTypeHandler})")
    void createTemporary(Temporary temporary);

    /**
     * 这个方法打破每个mapper只处理一张表的原则=。=
     * @param emp_id
     * @param name
     * @param begintime
     * @param endtime
     * @return
     */
//    @Select("<script>SELECT t.EMP_ID,e.NAME EMPNAME,d.NAME DEPTNAME,j.NAME JOBNAME,t.STATUS, t,BEGINTIME,t.ENDTIME FROM TEMPORARY t,SKEMP e,SKDEPT d,SKJOB j <where>" +
//            "t.EMP_ID=e.EMP_ID AND t.JOB_ID = j.JOB_ID AND j.DEPT_ID = d.DEPT_ID " +
//            "<if test=\"emp_id!=null\"> AND t.EMP_ID=#{emp_id} </if>" +
//            "<if test=\"name!=null\"> AND e.NAME like %#{name}%</if>" +
//            "<if test=\"begintime!=null\"> AND TO_DATE(#{begintime},\"yyyy-mm-dd\") &gt; TO_DATE(begintime,\"yyyy-mm-dd\") </if>" +
//            "<if test=\"endtime!=null\"> AND TO_DATE(#{endtime},\"yyyy-mm-dd\") &lt; TO_DATE(endtime,\"yyyy-mm-dd\")  </if></where></script>")

    @SelectProvider(type = SqlProvider.class, method = "selectTemporaryInfo")
    List<HashMap<String,String>> getTemporaryInfo(@Param("emp_id")String emp_id,@Param("name")String name,@Param("begintime")String begintime,@Param("endtime")String endtime);

    @Update("UPDATE TEMPORARY SET STATUS = #{status,typeHandler=org.apache.ibatis.type.EnumTypeHandler} WHERE EMP_ID =#{emp_id}")
    void endTemporary(@Param("emp_id")String emp_id,@Param("status")YesOrNo status);

}
