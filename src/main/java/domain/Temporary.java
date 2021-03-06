package domain;

import domain.enums.YesOrNo;

/**
 * Created by Jsz on 2015/9/17.
 */
public class Temporary {
    private int id;
    private String begintime;
    private String endtime;
    private String emp_id;
    private String job_id;
    private YesOrNo status;

    public Temporary(){}

    public Temporary(String begintime, String endtime, String emp_id, String job_id, YesOrNo status) {
        this.begintime = begintime;
        this.endtime = endtime;
        this.emp_id = emp_id;
        this.job_id = job_id;
        this.status = status;
    }



    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }


    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public YesOrNo getStatus() {
        return status;
    }

    public void setStatus(YesOrNo status) {
        this.status = status;
    }
}
