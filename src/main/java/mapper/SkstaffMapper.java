package mapper;

import domain.Skstaff;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * Created by Jsz on 2015/9/20.
 */
public interface SkstaffMapper {

    @Insert("INSERT INTO SKSTAFF VALUES (null,#{emp_id},#{job_id},#{time})")
    void createStaff(@Param("Skstaff")Skstaff skstaff);

    @Update("UPDATE SKSTAFF SET job_id=#{job_id},time=#{time} WHERE emp_id = #{emp_id}")
    void updateStaff(@Param("Skstaff")Skstaff skstaff);
}
