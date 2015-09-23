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
}
