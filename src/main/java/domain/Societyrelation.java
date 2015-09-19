package domain;

import domain.enums.Relations;

/**
 * Created by Jsz on 2015/9/17.
 */
public class Societyrelation {
    private int id;
    private String emp_id;
    private Relations relation;
    private String name;
    private String job;
    private String posi;
    private String tel;

    public Societyrelation(String emp_id, Relations relation, String name, String job, String posi, String tel) {
        this.emp_id = emp_id;
        this.relation = relation;
        this.name = name;
        this.job = job;
        this.posi = posi;
        this.tel = tel;
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

    public Relations getRelation() {
        return relation;
    }

    public void setRelation(Relations relation) {
        this.relation = relation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPosi() {
        return posi;
    }

    public void setPosi(String posi) {
        this.posi = posi;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
