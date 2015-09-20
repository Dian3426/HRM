package domain;

import domain.enums.StaffTypes;

/**
 * Created by Jsz on 2015/9/17.
 */
public class Talent {
    private int id;
    private String emp_id;
    private String job_id;
    private StaffTypes status;

    public Talent(String emp_id, String job_id, StaffTypes status) {
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

    public StaffTypes getStatus() {
        return status;
    }

    public void setStatus(StaffTypes status) {
        this.status = status;
    }
}
