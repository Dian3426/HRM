package domain;

/**
 * Created by Jsz on 2015/9/17.
 */
public class Occupationcareer {
    private int id;
    private String emp_id;
    private String begintime;
    private String endtime;
    private String jobname;
    private String jobdiscrip;
    private String position;
    private double salary;
    private String reference;
    private String referenceposition;
    private String referencetel;

    public Occupationcareer(){}
    public Occupationcareer(String emp_id, String begintime, String endtime, String jobname, String jobdiscrip, String position, double salary, String reference, String referenceposition, String referencetel) {
        this.emp_id = emp_id;
        this.begintime = begintime;
        this.endtime = endtime;
        this.jobname = jobname;
        this.jobdiscrip = jobdiscrip;
        this.position = position;
        this.salary = salary;
        this.reference = reference;
        this.referenceposition = referenceposition;
        this.referencetel = referencetel;
    }


    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public String getJobdiscrip() {
        return jobdiscrip;
    }

    public void setJobdiscrip(String jobdiscrip) {
        this.jobdiscrip = jobdiscrip;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getReferenceposition() {
        return referenceposition;
    }

    public void setReferenceposition(String referenceposition) {
        this.referenceposition = referenceposition;
    }

    public String getReferencetel() {
        return referencetel;
    }

    public void setReferencetel(String referencetel) {
        this.referencetel = referencetel;
    }
}
