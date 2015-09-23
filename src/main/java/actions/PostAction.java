package actions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opensymphony.xwork2.ActionSupport;
import domain.Skemp;
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
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

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
    String post_id;
    int post_num;
    boolean post_isnum;

    public String getPost_id() {
        return post_id;
    }

    public void setPost_id(String post_id) {
        this.post_id = post_id;
    }

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
        ArrayList<HashMap<String,String>> result = new ArrayList<HashMap<String,String>>();
        for (JobTypes jobTypes : JobTypes.values()) {
            HashMap<String ,String> temp = new HashMap<String, String>();
            temp.put("key",jobTypes.name());
            temp.put("value",jobTypes.toString());
            result.add(temp);
        }
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
            for(int i = 0; i < 10000; i++){
                if(!jobService.isJobidExist(String.valueOf(i))){
                    skjob.setJob_id(String.valueOf(i));
                    break;
                }
            }
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

    @Action(value = "getAllPosts")
    public void getAllPosts() throws Exception{
        List<List<String>> result = new ArrayList<List<String>>();
        List<Skjob> jobs = jobService.getAllJobs();
        for (Skjob job : jobs) {
            List<String> strings = new ArrayList<String>();
            strings.add(job.getJob_id());
            strings.add(job.getName());
            strings.add(job.getType().toString());
            strings.add(deptService.getNameByDeptid(job.getDept_id()));
            strings.add(job.getIslimit().toString());
            try{
                strings.add(String.valueOf(job.getLimitnum()));
            }
            catch (Exception e){
                strings.add("-");
            }
            result.add(strings);
        }
        HashMap<String,List<List<String>>> data = new HashMap<String,List<List<String>>>();
        data.put("data",result);
        ObjectMapper objectMapper = new ObjectMapper();
        String loginJson = objectMapper.writeValueAsString(data);
        HttpServletResponse response = ServletActionContext.getResponse();
        response.getOutputStream().write(loginJson.getBytes("UTF-8"));
    }

    @Action(value = "postDelete")
    public void postDelete(){
        HashMap<String,String> message = new HashMap<String, String>();
        try{
            jobService.deleteJob(getPost_id());
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

    @Action(value = "getEmpByPostID")
    public void getEmpByPostID() throws Exception{
        List<List<String>> result = new ArrayList<List<String>>();
        List<Skemp> emps = jobService.getAllEmpByJobid(getPost_id());
        for (Skemp emp : emps) {
            List<String> strings = new ArrayList<String>();
            strings.add(emp.getName());
            strings.add(emp.getEmp_id());
            strings.add(emp.getTele());
            strings.add(emp.getToworktime());
            result.add(strings);
        }
        HashMap<String,List<List<String>>> data = new HashMap<String,List<List<String>>>();
        data.put("data",result);
        ObjectMapper objectMapper = new ObjectMapper();
        String loginJson = objectMapper.writeValueAsString(data);
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
