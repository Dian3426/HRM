package mapper;

import domain.Temporary;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Jsz on 2015/9/19.
 */
public interface TemporaryMapper {
    @Insert("INSERT INTO TEMPORARY VALUES (null,#{emp_id},#{job_id},#{begintime},#{endtime},#{status,typeHandler=org.apache.ibatis.type.EnumTypeHandler})")
    void createTemporary(@Param("Temporary") Temporary temporary);

    /**
     * 这个方法打破每个mapper只处理一张表的原则=。=
     * @param emp_id
     * @param name
     * @param begintime
     * @param endtime
     * @return
     */
    @Select("<script>SELECT t.EMP_ID,e.NAME,d.NAME,j.NAME,t.STATUS, t,BEGINTIME,t.ENDTIME FROM TEMPORARY t,SKEMP e,SKDEPT d,SKJOB j WHERE " +
            "t.EMP_ID=e.EMP_ID AND t.JOB_ID = j.JOB_ID AND j.DEPT_ID = d.DEPT_ID " +
            "<if test=\"emp_id!=null\"> AND t.EMP_ID=#{emp_id} </if>" +
            "<if test=\"name!=null\"> AND e.NAME like %#{name}%</if>" +
            "<if test=\"begintime!=null\"> AND TO_DATE(#{begintime},\"yyyy-mm-dd\") &gt; TO_DATE(begintime,\"yyyy-mm-dd\") </if>" +
            "<if test=\"endtime!=null\"> AND TO_DATE(#{endtime},\"yyyy-mm-dd\") &lt; TO_DATE(endtime,\"yyyy-mm-dd\")  </if></script>")
    List<HashMap<String,String>> getTemporaryInfo(String emp_id,String name,String begintime,String endtime);

}
