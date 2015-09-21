package domain;

import org.apache.ibatis.annotations.Select;

/**
 * Created by Jsz on 2015/9/17.
 */
public class Histroy {
    private int id;
    private String dept_id;
    private String job_id;
    private String type;
    private int peoplenum;
    private String changetime;
    private int oldnum;
    private int newnum;
    private String mangagername;

    public Histroy(){}

    public Histroy(String dept_id, String job_id, String type, int peoplenum, String changetime, int oldnum, int newnum, String mangagername) {
        this.dept_id = dept_id;
        this.job_id = job_id;
        this.type = type;
        this.peoplenum = peoplenum;
        this.changetime = changetime;
        this.oldnum = oldnum;
        this.newnum = newnum;
        this.mangagername = mangagername;
    }



    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPeoplenum() {
        return peoplenum;
    }

    public void setPeoplenum(int peoplenum) {
        this.peoplenum = peoplenum;
    }

    public String getChangetime() {
        return changetime;
    }

    public void setChangetime(String changetime) {
        this.changetime = changetime;
    }

    public int getOldnum() {
        return oldnum;
    }

    public void setOldnum(int oldnum) {
        this.oldnum = oldnum;
    }

    public int getNewnum() {
        return newnum;
    }

    public void setNewnum(int newnum) {
        this.newnum = newnum;
    }

    public String getMangagername() {
        return mangagername;
    }

    public void setMangagername(String mangagername) {
        this.mangagername = mangagername;
    }
}
