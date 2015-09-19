package mapper;

import domain.Manager;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by JSZ on 2015/9/18.
 */
public interface ManagerMapper {
    @Insert("INSERT into manager(name,pass) VALUES (#{Manager.name},#{Manager.pass})")
    void createManager(@Param("Manager")Manager manager);

    @Select("SELECT name,pass FROM manager WHERE NAME = #{name}")
    Manager getManagerByName(@Param("name")String name);
}
