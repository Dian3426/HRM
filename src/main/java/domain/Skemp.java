package domain;

import domain.enums.*;

/**
 * Created by Jsz on 2015/9/17.
 */
public class Skemp {
    private int id;
    private String emp_id;
    private String name;
    private Sex sex;
    private String bir;
    private String idcard;
    private String toworktime;
    private Zzmm zzmm;
    private String national;
    private String nativ;
    private String tele;
    private String mail;
    private String height;
    private BloodTypes bloodtype;
    private String birthplace;
    private String hkplace;
    private String photo;
    private Degree degree;
    private String graduateschool;
    private String professional;
    private String graduatetime;
    private SourceTypes source;

    public Skemp(String name, Sex sex, String bir, String idcard, String toworktime, Zzmm zzmm, String national, String nativ, String tele, String mail, String height, BloodTypes bloodtype, String birthplace, String hkplace, String photo, Degree degree, String graduateschool, String professional, String graduatetime, SourceTypes source, String emp_id) {
        this.name = name;
        this.sex = sex;
        this.bir = bir;
        this.idcard = idcard;
        this.toworktime = toworktime;
        this.zzmm = zzmm;
        this.national = national;
        this.nativ = nativ;
        this.tele = tele;
        this.mail = mail;
        this.height = height;
        this.bloodtype = bloodtype;
        this.birthplace = birthplace;
        this.hkplace = hkplace;
        this.photo = photo;
        this.degree = degree;
        this.graduateschool = graduateschool;
        this.professional = professional;
        this.graduatetime = graduatetime;
        this.source = source;
        this.emp_id = emp_id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getBir() {
        return bir;
    }

    public void setBir(String bir) {
        this.bir = bir;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getToworktime() {
        return toworktime;
    }

    public void setToworktime(String toworktime) {
        this.toworktime = toworktime;
    }

    public Zzmm getZzmm() {
        return zzmm;
    }

    public void setZzmm(Zzmm zzmm) {
        this.zzmm = zzmm;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getNativ() {
        return nativ;
    }

    public void setNativ(String nativ) {
        this.nativ = nativ;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public BloodTypes getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(BloodTypes bloodtype) {
        this.bloodtype = bloodtype;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getHkplace() {
        return hkplace;
    }

    public void setHkplace(String hkplace) {
        this.hkplace = hkplace;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public String getGraduateschool() {
        return graduateschool;
    }

    public void setGraduateschool(String graduateschool) {
        this.graduateschool = graduateschool;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public String getGraduatetime() {
        return graduatetime;
    }

    public void setGraduatetime(String graduatetime) {
        this.graduatetime = graduatetime;
    }

    public SourceTypes getSource() {
        return source;
    }

    public void setSource(SourceTypes source) {
        this.source = source;
    }
}
