package mapper;

import domain.Leave;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Jsz on 2015/9/20.
 */
public interface LeaveMapper {

    @Insert("INSERT INTO LEAVE VALUES (null,#{emp_id},#{job_id},#{place},#{time},#{reason})")
    void createLeave(Leave leave);


}
