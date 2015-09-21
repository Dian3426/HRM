package domain;

import domain.enums.JobTypes;
import domain.enums.YesOrNo;

/**
 * Created by Jsz on 2015/9/17.
 */
public class Skjob {
    private int id;
    private String job_id;
    private String name;
    private JobTypes type;
    private int limitnum;
    private YesOrNo islimit;
    private String dept_id;

    public Skjob(){}

    public Skjob(String job_id, String name, JobTypes type, String dept_id,int limitnum, YesOrNo islimit ) {
        this.job_id = job_id;
        this.name = name;
        this.type = type;
        this.limitnum = limitnum;
        this.islimit = islimit;
        this.dept_id = dept_id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobTypes getType() {
        return type;
    }

    public void setType(JobTypes type) {
        this.type = type;
    }

    public int getLimitnum() {
        return limitnum;
    }

    public void setLimitnum(int limitnum) {
        this.limitnum = limitnum;
    }

    public YesOrNo getIslimit() {
        return islimit;
    }

    public void setIslimit(YesOrNo islimit) {
        this.islimit = islimit;
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }
}
