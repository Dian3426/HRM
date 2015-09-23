package mapper;

import domain.Change;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Jsz on 2015/9/20.
 */
public interface ChangeMapper {

    @Insert("INSERT INTO CHANGE VALUES (null,#{emp_id},#{olddept},#{newdept},#{changereason},#{oldjob},#{newjob},#{type,typeHandler=org.apache.ibatis.type.EnumTypeHandler},#{changetime})")
    void createChange(Change change);

    @Select("<script> SELECT c.EMP_ID,e.NAME,c.OLDDPET,c.OLDJOB,c.NEWDEPT,c.NEWJOB,c.CHANGETIME,c.TYPE,c.CHANGEREASON  FROM SKEMP e,CHANGE c WHERE e.EMP_ID=c.EMP_ID "+
            "AND  <if test=\"emp_id!=null \">c.emp_id=#{emp_id} </if> AND " +
            "<if test=\"empName!=null \">e.NAME=#{empNAME} </if> AND " +
            "<if test=\"beginTime!=null \">TO_DATE(#{beginTime},\"yyyy-mm-dd\") &gt; TO_DATE(c.changetime,\"yyyy-mm-dd\")  </if> AND " +
            "<if test=\"endTime!=null \">TO_DATE(#{endTime},\"yyyy-mm-dd\") &lt; TO_DATE(c.changetime,\"yyyy-mm-dd\")  </if></script>")
    List<HashMap<String,String>> getChangeHistory(@Param("emp_id")String emp_id,@Param("empName")String empName,
                                            @Param("beginTime")String beginTime,@Param("endTime")String endTime);
}
