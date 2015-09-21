package domain;

import domain.enums.LeaveReasons;

/**
 * Created by Jsz on 2015/9/17.
 */
public class Leave {
    private int id;
    private String emp_id;
    private String job_id;
    private String place;
    private String time;
    private LeaveReasons reason;

    public Leave(){}

    public Leave(String emp_id, String job_id, String place, String time, LeaveReasons reason) {
        this.emp_id = emp_id;
        this.job_id = job_id;
        this.place = place;
        this.time = time;
        this.reason = reason;
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

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public LeaveReasons getReason() {
        return reason;
    }

    public void setReason(LeaveReasons reason) {
        this.reason = reason;
    }
}
