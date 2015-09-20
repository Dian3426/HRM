package mapper;

import domain.Skstaff;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Jsz on 2015/9/20.
 */
public interface SkstaffMapper {

    @Insert("INSERT INTO SKSTAFF VALUES (null,#{emp_id},#{job_id},#{time})")
    void createStaff(@Param("Skstaff")Skstaff skstaff);
}
