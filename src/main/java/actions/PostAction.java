package actions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opensymphony.xwork2.ActionSupport;
import domain.Skjob;
import domain.enums.JobTypes;
import domain.enums.YesOrNo;
import javafx.application.Application;
import oracle.jdbc.proxy.annotation.Post;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import service.DeptService;
import service.JobService;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
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

    @Action(value = "getJobs")
    public void getJobs() throws Exception{
        List<String> result = jobService.getAllJobNames();
        ObjectMapper objectMapper = new ObjectMapper();
        String loginJson = objectMapper.writeValueAsString(result);
        HttpServletResponse response = ServletActionContext.getResponse();
        response.getOutputStream().write(loginJson.getBytes("UTF-8"));
    }

    @Action(value = "postAdd")
    public void postAdd(){
        HashMap<String,String> message = new HashMap<String, String>();
        try{
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
            message.put("success", "1");
        }catch (Exception e){
            message.put("success", "0");
            e.printStackTrace();
        }
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            String loginJson = objectMapper.writeValueAsString(message);
            HttpServletResponse response = ServletActionContext.getResponse();
            response.getOutputStream().write(loginJson.getBytes("UTF-8"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Action(value = "getPostAndSdept")
    public void getPostAndSDept() throws Exception{
        List<Skjob> jobs = jobService.getAllJobs();
        ArrayList<String> result = new ArrayList<String>();
        for (Skjob job : jobs) {
            String id = job.getDept_id();
            result.add(deptService.getNameByDeptid(id) + "-" + job.getName());
        }
        ObjectMapper objectMapper = new ObjectMapper();
        String loginJson = objectMapper.writeValueAsString(result);
        HttpServletResponse response = ServletActionContext.getResponse();
        response.getOutputStream().write(loginJson.getBytes("UTF-8"));
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PostAction postAction = (PostAction)context.getBean("postAction");
        List<Skjob> jobs = postAction.jobService.getAllJobs();
        ArrayList<String> result = new ArrayList<String>();
        for (Skjob job : jobs) {
            result.add(job.getType().toString());
        }
        for (String s : result) {
            System.out.println(s);
        }
    }

}
