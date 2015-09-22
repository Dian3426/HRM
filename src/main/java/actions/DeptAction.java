package actions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opensymphony.xwork2.ActionSupport;
import domain.Skdept;
import domain.enums.DeptTypes;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import service.DeptService;

import javax.servlet.http.HttpServletResponse;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by ZaraN on 2015/9/21.
 * this action's function is all about to operation with department.
 */
@Controller
@Scope("prototype")
@Namespace("/")
@ParentPackage("struts-default")
public class DeptAction extends ActionSupport {

    String dept_name;
    String dept_type;
    String dept_tel;
    String dept_fax;
    String dept_desc;
    String dept_sdept;

    /**
     * format : yyyy/mm/dd
     */
    String dept_ftime;

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getDept_type() {
        return dept_type;
    }

    public void setDept_type(String dept_type) {
        this.dept_type = dept_type;
    }

    public String getDept_tel() {
        return dept_tel;
    }

    public void setDept_tel(String dept_tel) {
        this.dept_tel = dept_tel;
    }

    public String getDept_fax() {
        return dept_fax;
    }

    public void setDept_fax(String dept_fax) {
        this.dept_fax = dept_fax;
    }

    public String getDept_desc() {
        return dept_desc;
    }

    public void setDept_desc(String dept_desc) {
        this.dept_desc = dept_desc;
    }

    public String getDept_sdept() {
        return dept_sdept;
    }

    public void setDept_sdept(String dept_sdept) {
        this.dept_sdept = dept_sdept;
    }

    public String getDept_ftime() {
        return dept_ftime;
    }

    public void setDept_ftime(String dept_ftime) {
        this.dept_ftime = dept_ftime;
    }

    @Autowired
    private DeptService deptService;

    /**
     * get All Depts' info,response a JSON with "sdepts" -> List<Skept>
     * @return Action support status
     * @throws Exception jacksonException
     */
    @Action(value = "deptInfo")
    public void deptInfo() throws Exception{
        List<Skdept> skdepts = deptService.getAllDepts();
        HashMap<String,List> result = new HashMap<String, List>();
        result.put("skdepts",skdepts);
        ObjectMapper objectMapper = new ObjectMapper();
        String loginJson = objectMapper.writeValueAsString(result);
        HttpServletResponse response = ServletActionContext.getResponse();
        response.getOutputStream().write(loginJson.getBytes("UTF-8"));
    }

    @Action(value = "deptSearch")
    public void deptSearch() throws Exception{
        List<Skdept> skdepts = deptService.getAllDepts();
        List<List<String>> result = new ArrayList<List<String>>();
        for (Skdept skdept : skdepts) {
            List<String> strings = new ArrayList<String>();
            strings.add(skdept.getDept_id());
            strings.add(skdept.getName());
            strings.add(skdept.getType().equals(DeptTypes.Dept)? "部门" : "公司");
            strings.add(skdept.getTele());
            strings.add(skdept.getFax());
            strings.add(skdept.getDiscrip());
            strings.add(skdept.getSuperd());
            strings.add(skdept.getCreatetime());
            result.add(strings);
        }
        ObjectMapper objectMapper = new ObjectMapper();
        String loginJson = objectMapper.writeValueAsString(result);
        HttpServletResponse response = ServletActionContext.getResponse();
        response.getOutputStream().write(loginJson.getBytes("UTF-8"));
    }

    /**
     * add one new dept
     * @return Action support status
     */
    @Action(value = "deptAdd")
    public void deptAdd(){
        HashMap<String,String> message = new HashMap<String, String>();
        try{
            Skdept skdept = new Skdept();
            skdept.setCreatetime(getDept_ftime());
            skdept.setFax(getDept_fax());
            skdept.setDiscrip(getDept_desc());
            skdept.setName(getDept_name());
            skdept.setSuperd(getDept_sdept());
            skdept.setTele(getDept_tel());
            skdept.setType(getDept_type().equals("部门") ? DeptTypes.Dept : DeptTypes.Enterprice);
            int count = deptService.getCount();
            skdept.setDept_id(Integer.toString(count));
            deptService.createDept(skdept);
            message.put("success", "1");
        }catch (Exception e){
            message.put("success", "0");
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

}
