package mapper;

import domain.History;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Jsz on 2015/9/20.
 */
public interface HistoryMapper {
    @Insert("INSERT INTO HISTORY VALUES (null,#{dept_id},#{job_id},#{type},#{peoplenum},#{changtime},#{oldnum},#{newnum},#{managername})")
    void createHistory(@Param("History") History histroy);
}
