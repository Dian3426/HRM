package actions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opensymphony.xwork2.ActionSupport;
import domain.*;
import domain.enums.*;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.*;
import org.apache.struts2.util.ServletContextAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import service.DeptService;
import service.EmpService;
import service.JobService;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by ZaraN on 2015/9/21.
 * this action's function is all about to operation with employees.
 */
@Controller
@Scope("prototype")
@Namespace("/")
@ParentPackage("struts-default")
public class EmpAction extends ActionSupport {

    String emp_name;
    String emp_sex;
    String emp_nat;
    String emp_birth;
    String emp_height;
    String emp_bloodtype;
    String emp_birthprov;
    String emp_birthcity;
    String emp_idNum;
    String emp_tel;
    String emp_mail;
    String emp_native;
    String emp_rresidence;
    String emp_marrige;
    String emp_ps;
    String emp_edu;
    String emp_coll;
    String emp_major;
    String emp_grad;
    String emp_from;
    String emp_jobtype;
    String emp_position;

    String emp_probation;
    String emp_probation_start;
    String emp_probation_end;
    String emp_attach;

    String emp_job_start;
    String emp_job_end;
    String emp_former_comp;
    String emp_former_position;
    Double emp_former_salary;
    String emp_former_evidence;
    String emp_former_evidence_position;
    String emp_job_attach;

    String emp_family_relation;
    String emp_family_name;
    String emp_family_comp;
    String emp_family_position;
    String emp_family_tel;

    String fileTitle;
    File emp_img;
    String emp_imgContentType;
    String emp_imgFileName;

    public String getFileTitle() {
        return fileTitle;
    }

    public void setFileTitle(String fileTitle) {
        this.fileTitle = fileTitle;
    }

    public File getEmp_img() {
        return emp_img;
    }

    public void setEmp_img(File emp_img) {
        this.emp_img = emp_img;
    }

    public String getEmp_imgContentType() {
        return emp_imgContentType;
    }

    public void setEmp_imgContentType(String emp_imgContentType) {
        this.emp_imgContentType = emp_imgContentType;
    }

    public String getEmp_imgFileName() {
        return emp_imgFileName;
    }

    public void setEmp_imgFileName(String emp_imgFileName) {
        this.emp_imgFileName = emp_imgFileName;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_sex() {
        return emp_sex;
    }

    public void setEmp_sex(String emp_sex) {
        this.emp_sex = emp_sex;
    }

    public String getEmp_nat() {
        return emp_nat;
    }

    public void setEmp_nat(String emp_nat) {
        this.emp_nat = emp_nat;
    }

    public String getEmp_birth() {
        return emp_birth;
    }

    public void setEmp_birth(String emp_birth) {
        this.emp_birth = emp_birth;
    }

    public String getEmp_height() {
        return emp_height;
    }

    public void setEmp_height(String emp_height) {
        this.emp_height = emp_height;
    }

    public String getEmp_bloodtype() {
        return emp_bloodtype;
    }

    public void setEmp_bloodtype(String emp_bloodtype) {
        this.emp_bloodtype = emp_bloodtype;
    }

    public String getEmp_birthprov() {
        return emp_birthprov;
    }

    public void setEmp_birthprov(String emp_birthprov) {
        this.emp_birthprov = emp_birthprov;
    }

    public String getEmp_birthcity() {
        return emp_birthcity;
    }

    public void setEmp_birthcity(String emp_birthcity) {
        this.emp_birthcity = emp_birthcity;
    }

    public String getEmp_idNum() {
        return emp_idNum;
    }

    public void setEmp_idNum(String emp_idNum) {
        this.emp_idNum = emp_idNum;
    }

    public String getEmp_tel() {
        return emp_tel;
    }

    public void setEmp_tel(String emp_tel) {
        this.emp_tel = emp_tel;
    }

    public String getEmp_mail() {
        return emp_mail;
    }

    public void setEmp_mail(String emp_mail) {
        this.emp_mail = emp_mail;
    }

    public String getEmp_native() {
        return emp_native;
    }

    public void setEmp_native(String emp_native) {
        this.emp_native = emp_native;
    }

    public String getEmp_rresidence() {
        return emp_rresidence;
    }

    public void setEmp_rresidence(String emp_rresidence) {
        this.emp_rresidence = emp_rresidence;
    }

    public String getEmp_marrige() {
        return emp_marrige;
    }

    public void setEmp_marrige(String emp_marrige) {
        this.emp_marrige = emp_marrige;
    }

    public String getEmp_ps() {
        return emp_ps;
    }

    public void setEmp_ps(String emp_ps) {
        this.emp_ps = emp_ps;
    }

    public String getEmp_edu() {
        return emp_edu;
    }

    public void setEmp_edu(String emp_edu) {
        this.emp_edu = emp_edu;
    }

    public String getEmp_coll() {
        return emp_coll;
    }

    public void setEmp_coll(String emp_coll) {
        this.emp_coll = emp_coll;
    }

    public String getEmp_major() {
        return emp_major;
    }

    public void setEmp_major(String emp_major) {
        this.emp_major = emp_major;
    }

    public String getEmp_from() {
        return emp_from;
    }

    public void setEmp_from(String emp_from) {
        this.emp_from = emp_from;
    }

    public String getEmp_grad() {
        return emp_grad;
    }

    public void setEmp_grad(String emp_grad) {
        this.emp_grad = emp_grad;
    }

    public String getEmp_jobtype() {
        return emp_jobtype;
    }

    public void setEmp_jobtype(String emp_jobtype) {
        this.emp_jobtype = emp_jobtype;
    }

    public String getEmp_position() {
        return emp_position;
    }

    public void setEmp_position(String emp_position) {
        this.emp_position = emp_position;
    }

    public String getEmp_probation() {
        return emp_probation;
    }

    public void setEmp_probation(String emp_probation) {
        this.emp_probation = emp_probation;
    }

    public String getEmp_probation_start() {
        return emp_probation_start;
    }

    public void setEmp_probation_start(String emp_probation_start) {
        this.emp_probation_start = emp_probation_start;
    }

    public String getEmp_probation_end() {
        return emp_probation_end;
    }

    public void setEmp_probation_end(String emp_probation_end) {
        this.emp_probation_end = emp_probation_end;
    }

    public String getEmp_attach() {
        return emp_attach;
    }

    public void setEmp_attach(String emp_attach) {
        this.emp_attach = emp_attach;
    }

    public String getEmp_job_start() {
        return emp_job_start;
    }

    public void setEmp_job_start(String emp_job_start) {
        this.emp_job_start = emp_job_start;
    }

    public String getEmp_former_comp() {
        return emp_former_comp;
    }

    public void setEmp_former_comp(String emp_former_comp) {
        this.emp_former_comp = emp_former_comp;
    }

    public String getEmp_job_end() {
        return emp_job_end;
    }

    public void setEmp_job_end(String emp_job_end) {
        this.emp_job_end = emp_job_end;
    }

    public String getEmp_former_evidence() {
        return emp_former_evidence;
    }

    public void setEmp_former_evidence(String emp_former_evidence) {
        this.emp_former_evidence = emp_former_evidence;
    }

    public String getEmp_former_position() {
        return emp_former_position;
    }

    public void setEmp_former_position(String emp_former_position) {
        this.emp_former_position = emp_former_position;
    }

    public Double getEmp_former_salary() {
        return emp_former_salary;
    }

    public void setEmp_former_salary(Double emp_former_salary) {
        this.emp_former_salary = emp_former_salary;
    }

    public String getEmp_former_evidence_position() {
        return emp_former_evidence_position;
    }

    public void setEmp_former_evidence_position(String emp_former_evidence_position) {
        this.emp_former_evidence_position = emp_former_evidence_position;
    }

    public String getEmp_job_attach() {
        return emp_job_attach;
    }

    public void setEmp_job_attach(String emp_job_attach) {
        this.emp_job_attach = emp_job_attach;
    }

    public String getEmp_family_relation() {
        return emp_family_relation;
    }

    public void setEmp_family_relation(String emp_family_relation) {
        this.emp_family_relation = emp_family_relation;
    }

    public String getEmp_family_name() {
        return emp_family_name;
    }

    public void setEmp_family_name(String emp_family_name) {
        this.emp_family_name = emp_family_name;
    }

    public String getEmp_family_comp() {
        return emp_family_comp;
    }

    public void setEmp_family_comp(String emp_family_comp) {
        this.emp_family_comp = emp_family_comp;
    }

    public String getEmp_family_tel() {
        return emp_family_tel;
    }

    public void setEmp_family_tel(String emp_family_tel) {
        this.emp_family_tel = emp_family_tel;
    }

    public String getEmp_family_position() {
        return emp_family_position;
    }

    public void setEmp_family_position(String emp_family_position) {
        this.emp_family_position = emp_family_position;
    }

    @Autowired
    private EmpService empService;

    @Autowired
    private DeptService deptService;

    @Autowired
    private JobService jobService;

    /**
     * add one new emp to database
     */
    @Action(value = "empInfoAdd", interceptorRefs = {
            @InterceptorRef("defaultStack"),
            @InterceptorRef(value = "fileUpload", params = {"maximumSize", "1024000"})
    })
    public void empAdd() {
        HashMap<String, String> message = new HashMap<String, String>();
        try {
            String empNo = createEmpNo();
            String[] temp = getEmp_position().split("-");
            String position = temp[1];
            String dept = temp[0];

            String path = saveFile();


            Skjob skjob = jobService.getJobByNameAndDeptid(position, deptService.getDeptidByName(dept));
            Skemp emp = new Skemp(getEmp_name(), (getEmp_sex() == "0") ? Sex.Male : Sex.Female, getEmp_birth(), getEmp_idNum(), new SimpleDateFormat("yyyy/mm/dd").format(new Date()), Zzmm.PartyMember,
                    getEmp_nat(), getEmp_native(), getEmp_tel(), getEmp_mail(), getEmp_height(), BloodTypes.A,
                    getEmp_birthprov() + getEmp_birthcity(), getEmp_rresidence(), path, Degree.College, getEmp_coll(),
                    getEmp_major(), getEmp_grad(), SourceTypes.Social, empNo);
            Occupationcareer occupationcareer = new Occupationcareer(empNo, getEmp_job_start(), getEmp_job_end(),
                    getEmp_former_position(), "无", getEmp_former_position(), getEmp_former_salary(), getEmp_former_evidence(),
                    getEmp_former_evidence_position(), "2222");
            Societyrelation societyrelation = new Societyrelation(empNo, Relations.Father,
                    getEmp_family_name(), getEmp_family_position(), getEmp_family_comp(), getEmp_family_tel());
            Talent talent = new Talent(empNo, skjob.getJob_id(), (getEmp_jobtype() == "0") ? StaffTypes.Official : StaffTypes.Temporary);

            if (getEmp_probation() == "1") {
                Temporary temporary = new Temporary(getEmp_probation_start(), getEmp_probation_end(),
                        empNo, skjob.getJob_id(), YesOrNo.Yes);
                empService.createTemporary(temporary);
            }

            empService.createEmpTotally(emp, occupationcareer, societyrelation, talent);

            message.put("success", "1");
        } catch (Exception e) {
            message.put("success", "0");
            e.printStackTrace();
        }
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String loginJson = objectMapper.writeValueAsString(message);
            HttpServletResponse response = ServletActionContext.getResponse();
            response.getOutputStream().write(loginJson.getBytes("UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * create employee's emp number;format:xxxx
     * xxxx means he is the No.xxxx of com
     * @return empNo
     */
    private String createEmpNo() {
        int count = empService.getCount();
        String empNo = "0001";
        while (empService.isEmpidExist(String.valueOf(empNo))) {
            empNo = "";
            if (count < 10)
                empNo += "000";
            else if (count < 100)
                empNo += "00";
            else if (count < 1000)
                empNo += "0";
            empNo += count + 1;
            count++;
        }
        return empNo;
    }

    /**
     * create employee's dept number,format: aabbb
     * aa means deptid , bbb means how many people in this dept
     * example:if A is a new and belongs to deptId 5 and this dept has haven 53 people;
     * A's empPosNo is 05054
     *
     * @param dept deptName
     * @return empDeptNo
     */
    private String createEmpDeptNo(String dept) {
        int deptID = Integer.parseInt(deptService.getDeptidByName(dept));
        int count = deptService.getCountByDeptid(Integer.toString(deptID));
        String deptNo = "";
        if (deptID < 10)
            deptNo += "0";
        deptNo += deptID;
        if (count < 10)
            deptNo += "00";
        else if (count < 100)
            deptNo += "0";
        deptNo += count + 1;
        return deptNo;
    }

    /**
     * upload user's img to server and return a path
     * @return path that will be saved in database
     * @throws Exception about file
     */
    private String saveFile() throws Exception {
        File file = new File(ServletActionContext.getServletContext().getResource("/").getPath().substring(1) + "\\img/photo");
        String fileName = UUID.randomUUID().toString() + getEmp_imgFileName().substring(getEmp_imgFileName().lastIndexOf('.'));
        String result = "/img/photo/" + fileName;
        File resultFile = new File(ServletActionContext.getServletContext().getResource("/").getPath().substring(1) + "\\img/photo/" + fileName);
        if (!file.exists() && !file.isDirectory()) {
            file.mkdir();
        }
        FileOutputStream fos = new FileOutputStream(result);
        FileInputStream fis = new FileInputStream(getEmp_img());
        byte[] buffer = new byte[1024];
        int len = 0;
        try {
            while ((len = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(new File(System.getProperty("user.dir") + "\\web\\photo\\").getAbsolutePath());
    }


}
