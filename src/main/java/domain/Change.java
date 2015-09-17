package domain;

/**
 * Created by Jsz on 2015/9/17.
 */
public class Change {
    private String id;
    private String be_dept_id;
    private String af_dept_id;
    private String deptype;
    private String deptreason;
    private String depttime;
    private String oldjob;
    private String newjob;
    private String type;
    private String time;
    private String jobtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBe_dept_id() {
        return be_dept_id;
    }

    public void setBe_dept_id(String be_dept_id) {
        this.be_dept_id = be_dept_id;
    }

    public String getDeptreason() {
        return deptreason;
    }

    public void setDeptreason(String deptreason) {
        this.deptreason = deptreason;
    }

    public String getJobtime() {
        return jobtime;
    }

    public void setJobtime(String jobtime) {
        this.jobtime = jobtime;
    }

    public String getAf_dept_id() {
        return af_dept_id;
    }

    public void setAf_dept_id(String af_dept_id) {
        this.af_dept_id = af_dept_id;
    }

    public String getDeptype() {
        return deptype;
    }

    public void setDeptype(String deptype) {
        this.deptype = deptype;
    }

    public String getDepttime() {
        return depttime;
    }

    public void setDepttime(String depttime) {
        this.depttime = depttime;
    }

    public String getOldjob() {
        return oldjob;
    }

    public void setOldjob(String oldjob) {
        this.oldjob = oldjob;
    }

    public String getNewjob() {
        return newjob;
    }

    public void setNewjob(String newjob) {
        this.newjob = newjob;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
