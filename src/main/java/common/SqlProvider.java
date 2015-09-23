package common;

import org.apache.ibatis.annotations.Param;

/**
 * Created by JSZ on 2015/9/23.
 */
public class SqlProvider {
    public String selectTemporaryInfo(@Param("emp_id")String emp_id,@Param("name")String name,@Param("begintime")String begintime,@Param("endtime")String endtime){
        return "SELECT t.EMP_ID,e.NAME EMPNAME,d.NAME DEPTNAME,j.NAME JOBNAME,t.STATUS, t,BEGINTIME,t.ENDTIME FROM TEMPORARY t,SKEMP e,SKDEPT d,SKJOB j WHERE " +
                "t.EMP_ID=e.EMP_ID AND t.JOB_ID = j.JOB_ID AND j.DEPT_ID = d.DEPT_ID "+(emp_id.isEmpty()?"":"AND t.EMP_ID "+emp_id)+ (name.isEmpty()?"":"AND  AND e.NAME like %"+name+"% ") +
                (begintime.isEmpty()?"":" AND TO_DATE("+begintime+",\"yyyy-mm-dd\") < TO_DATE(begintime,\"yyyy-mm-dd\") ")+(endtime.isEmpty()?"":"AND TO_DATE(#{endtime},\"yyyy-mm-dd\") >TO_DATE(endtime,\"yyyy-mm-dd\")  ");
    }
}
