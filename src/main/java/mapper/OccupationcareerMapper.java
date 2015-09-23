package mapper;

import domain.Occupationcareer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Jsz on 2015/9/19.
 */
public interface OccupationcareerMapper {
    @Insert("INSERT INTO OCCUPATIONCAREER VALUES (null,#{begintime},#{endtime},#{jobname},#{jobdiscrip},#{postion},#{salary},#{reference},#{referencetel},#{referenceposition},#{emp_id})")
    void createOccupationcareer(Occupationcareer occupationcareer);

    @Select("SELECT * FROM OCCUPATIONCAREER WHERE EMP_ID = #{emp_id}")
    Occupationcareer getOccopationcareerByEmpid(@Param("emp_id") String emp_id);
}
