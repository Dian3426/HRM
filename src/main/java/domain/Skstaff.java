package domain;

import domain.enums.SourceTypes;

/**
 * Created by Jsz on 2015/9/17.
 */
public class Skstaff {
    private int id;
    private String emp_id;
    private String job_id;
    private String time;

    public Skstaff(){}

    public Skstaff(String emp_id, String job_id, String time) {
        this.emp_id = emp_id;
        this.job_id = job_id;
        this.time = time;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
