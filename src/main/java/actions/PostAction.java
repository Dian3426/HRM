package actions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opensymphony.xwork2.ActionSupport;
import domain.Skjob;
import domain.enums.JobTypes;
import domain.enums.YesOrNo;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.DeptService;
import service.JobService;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;

/**
 * Created by ZaraN on 2015/9/21.
 */
@Controller
@Scope("prototype")
@Namespace("/")
@ParentPackage("struts-default")
public class PostAction extends ActionSupport {

    String post_name;
    String post_sdept;
    String post_type;
    int post_num;
    boolean post_isnum;

    public String getPost_name() {
        return post_name;
    }

    public void setPost_name(String post_name) {
        this.post_name = post_name;
    }

    public String getPost_sdept() {
        return post_sdept;
    }

    public void setPost_sdept(String post_sdept) {
        this.post_sdept = post_sdept;
    }

    public String getPost_type() {
        return post_type;
    }

    public void setPost_type(String post_type) {
        this.post_type = post_type;
    }

    public boolean isPost_isnum() {
        return post_isnum;
    }

    public void setPost_isnum(boolean post_isnum) {
        this.post_isnum = post_isnum;
    }

    public int getPost_num() {
        return post_num;
    }

    public void setPost_num(int post_num) {
        this.post_num = post_num;
    }

    @Autowired
    JobService jobService;

    @Autowired
    DeptService deptService;

    @Action(value = "addPost",results = {
            @Result(name = ActionSupport.SUCCESS,location = "/WEB-INF/index.jsp")
    })
    public String addPost(){
        Skjob skjob = new Skjob();
        skjob.setName(getPost_name());
        skjob.setType(JobTypes.valueOf(getPost_type()));
        skjob.setLimitnum(getPost_num());
        skjob.setIslimit(isPost_isnum() ? YesOrNo.Yes : YesOrNo.No);
        List<HashMap<String,String>> deptidAndNames = deptService.getAllDeptidAndNames();
        int deptID = 0;
        for (HashMap<String, String> deptidAndName : deptidAndNames) {
            if(deptidAndName.get(deptID) == getPost_sdept())
                break;
        }
        skjob.setDept_id(Integer.toString(deptID));
        jobService.createJob(skjob);
        return SUCCESS;
    }

    @Action(value = "getPostAndSdept")
    public void getPostAndSDept() throws Exception{
        List<Skjob> jobs = jobService.getAllJobs();
        HashMap<String,String> result = new HashMap<String, String>();
        List<HashMap<String,String>> deptidAndNames = deptService.getAllDeptidAndNames();
        for (Skjob job : jobs) {
            String id = job.getDept_id();
            for (HashMap<String, String> deptidAndName : deptidAndNames) {
                result.put(job.getName(),deptidAndName.get(id));
            }
        }
        ObjectMapper objectMapper = new ObjectMapper();
        String loginJson = objectMapper.writeValueAsString(result);
        HttpServletResponse response = ServletActionContext.getResponse();
        response.getOutputStream().write(loginJson.getBytes("UTF-8"));
    }

}