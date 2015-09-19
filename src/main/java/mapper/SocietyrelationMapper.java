package mapper;

import domain.Societyrelation;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Jsz on 2015/9/19.
 */
public interface SocietyrelationMapper {

    @Insert("INSERT INTO SOCIETYRELATION VALUES (null,#{relation,typeHandler=org.apache.ibatis.type.EnumTypeHandler},#{name},#{job},#{posi},#{tel},#{emp_id})")
    void creatSocietyrelation(Societyrelation societyrelation);

    @Select("SELECT * FROM SOCIETYRELATION WHERE EMP_ID=#{emp_id}")
    Societyrelation getSocietyrelationByEmpid(@Param("emp_id")String emp_id);
}
