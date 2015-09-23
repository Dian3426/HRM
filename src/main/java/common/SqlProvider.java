package common;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

/**
 * Created by JSZ on 2015/9/23.
 */
public class SqlProvider {
    public SqlProvider(){
    }

    public String selectTemporaryInfo(final Map<String, Object> paramMap){
//        final String emp_id = paramMap.get("emp_id").toString();
//        final String name=paramMap.get("name").toString();
//        final String begintime = paramMap.get("begintime").toString();
//        final String endtime = paramMap.get("endtime").toString();
        String sql = new SQL(){{
            SELECT("t.EMP_ID,e.NAME EMPNAME,d.NAME DEPTNAME,j.NAME JOBNAME,t.STATUS, t,BEGINTIME,t.ENDTIME");
            FROM("TEMPORARY t,SKEMP e,SKDEPT d,SKJOB j ");
            WHERE("t.EMP_ID=e.EMP_ID");
            WHERE(" t.JOB_ID = j.JOB_ID");
            WHERE("j.DEPT_ID = d.DEPT_ID ");
            if(paramMap.get("emp_id")!=null){
                WHERE("t.EMP_ID ="+paramMap.get("emp_id").toString());
            }
            if(paramMap.get("name")!=null){
                WHERE("e.NAME like %"+paramMap.get("name").toString()+"% ");
            }
            if(paramMap.get("begintime")!=null){
                WHERE(" TO_DATE("+paramMap.get("begintime").toString()+",\"yyyy-mm-dd\") < TO_DATE(begintime,\"yyyy-mm-dd\")");
            }
            if(paramMap.get("endtime")!=null){
                WHERE("TO_DATE("+paramMap.get("endtime").toString()+",\"yyyy-mm-dd\") >TO_DATE(endtime,\"yyyy-mm-dd\")");
            }
        }}.toString();
        return sql;
//        return "SELECT t.EMP_ID,e.NAME EMPNAME,d.NAME DEPTNAME,j.NAME JOBNAME,t.STATUS, t,BEGINTIME,t.ENDTIME FROM TEMPORARY t,SKEMP e,SKDEPT d,SKJOB j WHERE " +
//                "t.EMP_ID=e.EMP_ID AND t.JOB_ID = j.JOB_ID AND j.DEPT_ID = d.DEPT_ID "+(paramMap.get(emp_id)==null?"":"AND t.EMP_ID "+emp_id)+ (name==null?"":" AND e.NAME like %"+name+"% ") +
//                (begintime==null?"":" AND TO_DATE("+begintime+",\"yyyy-mm-dd\") < TO_DATE(begintime,\"yyyy-mm-dd\") ")+(endtime==null?"":"AND TO_DATE(#{endtime},\"yyyy-mm-dd\") >TO_DATE(endtime,\"yyyy-mm-dd\")  ");
    }
}
