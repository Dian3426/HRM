package mapper;

import common.SqlProvider;
import domain.Change;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Jsz on 2015/9/20.
 */
public interface ChangeMapper {

    @Insert("INSERT INTO CHANGE VALUES (null,#{emp_id},#{olddept},#{newdept},#{changereason},#{oldjob},#{newjob},#{type,typeHandler=org.apache.ibatis.type.EnumTypeHandler},#{changetime})")
    void createChange(Change change);

   @SelectProvider(type = SqlProvider.class,method = "selectChangeHistory")
    List<HashMap<String,String>> getChangeHistory(@Param("emp_id")String emp_id,@Param("empName")String empName,
                                            @Param("beginTime")String beginTime,@Param("endTime")String endTime);

    @Select("SELECT * FROM CHANGE c WHERE TO_DATE(#{begin},\"yyyy-mm-dd\") < TO_DATE(c.changtime,\"yyyy-mm-dd\") AND" +
            " TO_DATE( #{end},\"yyyy-mm-dd\") >TO_DATE(c.changtime,\"yyyy-mm-dd\")")
    List<Change> getChangesBetween(String begin,String end);

    @Select("SELECT COUNT(EMP_ID) FROM CHANGE WHERE substr(CHANGTIME,0,7)=#{month} AND NEWDEPT=#{dept_id}")
    int getCountByMonthAndNewDeptid(String month, String dept_id);

    @Select("SELECT COUNT(EMP_ID) FROM CHANGE WHERE substr(CHANGTIME,0,7)=#{month} AND OLDDEPT=#{dept_id}  ")
    int getCountByMonthAndOldDpetid(String month,String dept_id);
}
