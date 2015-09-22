package mapper;

import domain.Change;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Jsz on 2015/9/20.
 */
public interface ChangeMapper {

    @Insert("INSERT INTO CHANGE VALUES (null,#{emp_id},#{olddept},#{newdept},#{changereason},#{oldjob},#{newjob},#{type,typeHandler=org.apache.ibatis.type.EnumTypeHandler},#{changetime})")
    void createChange(@Param("Change")Change change);
}
