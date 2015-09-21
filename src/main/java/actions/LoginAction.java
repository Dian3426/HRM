package actions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import domain.Manager;
import org.apache.ibatis.annotations.Results;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import service.ManagerService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Action;
import java.util.HashMap;

/**
 * Created by ZaraN on 2015/9/21.
 * this action is set to compelete the login function
 */
@Controller
@Scope("prototype")
@Namespace("/")
@ParentPackage("struts-default")
public class LoginAction extends ActionSupport{
    String emp_id;
    String emp_pass;
    boolean emp_rem;

    @Autowired
    ManagerService managerService;

    @Autowired
    Manager manager;

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public boolean isEmp_rem() {
        return emp_rem;
    }

    public void setEmp_rem(boolean emp_rem) {
        this.emp_rem = emp_rem;
    }

    public String getEmp_pass() {
        return emp_pass;
    }

    public void setEmp_pass(String emp_pass) {
        this.emp_pass = emp_pass;
    }



    @org.apache.struts2.convention.annotation.Action(value = "login")
    public void login(){
        manager.setName(getEmp_id());
        manager.setPass(getEmp_pass());
        HashMap<String,String> message = new HashMap<String, String>();
        try{
            if(managerService.login(manager)){
                message.put("success","1");
                ObjectMapper objectMapper = new ObjectMapper();
                String loginJson = objectMapper.writeValueAsString(message);
                HttpServletResponse response = ServletActionContext.getResponse();
                response.getOutputStream().write(loginJson.getBytes("UTF-8"));
                if(isEmp_rem()){
                    Cookie cookie = new Cookie("emp_id",getEmp_id());
                    response.addCookie(cookie);
                }
            }else{
                message.put("success","0");
                message.put("message","用户名或密码错误！请重新输入");
                ObjectMapper objectMapper = new ObjectMapper();
                String loginJson = objectMapper.writeValueAsString(message);
                HttpServletResponse response = ServletActionContext.getResponse();
                response.getOutputStream().write(loginJson.getBytes("UTF-8"));
            }
        }catch (Exception e){
            message.put("success","0");
            message.put("message","服务器响应超时，请稍后再试");
            ObjectMapper objectMapper = new ObjectMapper();
            String loginJson = null;
            try {
                loginJson = objectMapper.writeValueAsString(message);
                HttpServletResponse response = ServletActionContext.getResponse();
                response.getOutputStream().write(loginJson.getBytes("UTF-8"));
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }

}
