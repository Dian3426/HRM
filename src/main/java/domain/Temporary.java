package domain;

import domain.enums.YesOrNo;

/**
 * Created by Jsz on 2015/9/17.
 */
public class Temporary {
    private int id;
    private String begintime;
    private String endtime;
    private int result;
    private String ope_id;
    private String emp_id;
    private String job_id;
    private YesOrNo status;

    public Temporary(){}

    public Temporary(String begintime, String endtime, int result, String ope_id, String emp_id, String job_id, YesOrNo status) {
        this.begintime = begintime;
        this.endtime = endtime;
        this.result = result;

        this.ope_id = ope_id;
        this.emp_id = emp_id;
        this.job_id = job_id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getOpe_id() {
        return ope_id;
    }

    public void setOpe_id(String ope_id) {
        this.ope_id = ope_id;
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
