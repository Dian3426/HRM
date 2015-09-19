package domain;

import domain.enums.DeptTypes;

/**
 * Created by Jsz on 2015/9/17.
 */
public class Skdept {
    private int id;
    private String dept_id;
    private String name;
    private DeptTypes type;
    private String tele;
    private String fax;
    private String discrip;

    public Skdept(){
    }
    public Skdept(String dept_id, String name, DeptTypes type, String tele, String fax, String discrip, String superd, String createtime) {

        this.dept_id = dept_id;
        this.name = name;
        this.type = type;
        this.tele = tele;
        this.fax = fax;
        this.discrip = discrip;
        this.superd = superd;
        this.createtime = createtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeptTypes getType() {
        return type;
    }

    public void setType(DeptTypes type) {
        this.type = type;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDiscrip() {
        return discrip;
    }

    public void setDiscrip(String discrip) {
        this.discrip = discrip;
    }

    public String getSuperd() {
        return superd;
    }

    public void setSuperd(String superd) {
        this.superd = superd;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    private String superd;
    private String createtime;

    }
