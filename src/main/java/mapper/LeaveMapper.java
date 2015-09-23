package mapper;

import domain.Leave;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Jsz on 2015/9/20.
 */
public interface LeaveMapper {

    @Insert("INSERT INTO LEAVE VALUES (null,#{emp_id},#{job_id},#{place},#{time},#{reason})")
    void createLeave(Leave leave);

    @Select("SELECT * FROM WHERE TO_DATE(#{begin},\"yyyy-mm-dd\") < TO_DATE(time,\"yyyy-mm-dd\") AND " +
            " TO_DATE( #{end},\"yyyy-mm-dd\") >TO_DATE(time,\"yyyy-mm-dd\") AND job_id=#{job_id")
    List<Leave> getLeaves(String begin,String end,String job_id);
}
