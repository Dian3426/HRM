package domain;

import domain.enums.ChangeTypes;

/**
 * Created by Jsz on 2015/9/17.
 */
public class Change {
    private int id;
    private String emp_id;
    private String olddept;
    private String newdept;
    private String changreason;
    private String oldjob;
    private String newjob;
    private ChangeTypes type;
    private String changetime;

    public Change(){}

    /**
     *
     * @param emp_id
     * @param olddept 旧部门id
     * @param newdept 新部门id
     * @param changreason
     * @param oldjob 旧岗位id
     * @param newjob 新岗位id
     * @param type
     * @param changetime
     */
    public Change(String emp_id, String olddept, String newdept, String changreason, String oldjob, String newjob, ChangeTypes type, String changetime) {
        this.emp_id = emp_id;
        this.olddept = olddept;
        this.newdept = newdept;
        this.changreason = changreason;
        this.oldjob = oldjob;
        this.newjob = newjob;
        this.type = type;
        this.changetime = changetime;
    }


    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getOlddept() {
        return olddept;
    }

    public void setOlddept(String olddept) {
        this.olddept = olddept;
    }

    public String getNewdept() {
        return newdept;
    }

    public void setNewdept(String newdept) {
        this.newdept = newdept;
    }

    public String getChangereason() {
        return changreason;
    }

    public void setChangereason(String changereason) {
        this.changreason = changereason;
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

    public ChangeTypes getType() {
        return type;
    }

    public void setType(ChangeTypes type) {
        this.type = type;
    }

    public String getChangetime() {
        return changetime;
    }

    public void setChangetime(String changetime) {
        this.changetime = changetime;
    }
}
