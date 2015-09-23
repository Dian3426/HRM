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

    public String selectChangeHistory(final Map<String, Object> paramMap){
//        String tem = "<script> SELECT c.EMP_ID,e.NAME,c.OLDDPET,c.OLDJOB,c.NEWDEPT,c.NEWJOB,c.CHANGETIME,c.TYPE,c.CHANGEREASON  FROM SKEMP e,CHANGE c WHERE e.EMP_ID=c.EMP_ID \"+\n" +
//                "            \"<if test=\\\"emp_id!=null \\\">AND  c.emp_id=#{emp_id} </if> \" +\n" +
//                "            \"<if test=\\\"empName!=null \\\">AND e.NAME=#{empNAME}</if> \" +\n" +
//                "            \"<if test=\\\"beginTime!=null \\\"> AND TO_DATE(#{beginTime},\\\"yyyy-mm-dd\\\") &gt; TO_DATE(c.changetime,\\\"yyyy-mm-dd\\\")  </if> \" +\n" +
//                "            \"<if test=\"endTime!=null \">AND TO_DATE(#{endTime},\"yyyy-mm-dd\") &lt; TO_DATE(c.changetime,\"yyyy-mm-dd\")  </if></script>";
        String sql = new SQL(){{
            SELECT("c.EMP_ID,e.NAME,c.OLDDEPT,c.OLDJOB,c.NEWDEPT,c.NEWJOB,c.CHANGTIME,c.TYPE,c.CHANGREASON ");
            FROM("SKEMP e,CHANGE c");
            WHERE("e.EMP_ID=c.EMP_ID");
            if(paramMap.get("emp_id")!=null){
                WHERE("c.emp_id="+paramMap.get("emp_id").toString());
            }
            if(paramMap.get("empName")!=null){
                WHERE("e.NAME="+paramMap.get("empName").toString());
            }
            if(paramMap.get("beginTime")!=null){
                WHERE("TO_DATE("+ paramMap.get("beginTime").toString()+",\"yyyy-mm-dd\") &gt; TO_DATE(c.changtime,\"yyyy-mm-dd\")");
            }
            if(paramMap.get("endTime")!=null){
                WHERE("TO_DATE("+paramMap.get("endTime").toString()+",\"yyyy-mm-dd\") &lt; TO_DATE(c.changetime,\"yyyy-mm-dd\") ");
            }
        }}.toString();

        return sql;
    }

    public String selectInfoForLeave(final Map<String, Object> paramMap){
        String sql = new SQL(){{
            SELECT("e.name EMPNAME,e.emp_id,d.NAME DEPTNAME,d.dept_id,e.idcard");
            FROM("SKEMP e,SKDEPT d,TALENT t,SKJOB j");
            WHERE("e.emp_id=t.emp_id");
            WHERE("t.job_id=j.job_id");
            WHERE("j.dept_id=d.dept_id");
            if(paramMap.get("dept_id")!=null){
                WHERE("d.dept_id="+paramMap.get("dept_id").toString());
            }
            if(paramMap.get("deptName")!=null){
                WHERE("d.name="+paramMap.get("deptName").toString());
            }
            if(paramMap.get("emp_id")!=null){
                WHERE("e.emp_id="+paramMap.get("emp_id").toString());
            }
            if(paramMap.get("empName")!=null){
                WHERE("e.NAME="+paramMap.get("empName").toString());
            }
        }}.toString();

        return sql;
    }
}
