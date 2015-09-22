package actions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import domain.Manager;
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
import service.ManagerService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 * Created by ZaraN on 2015/9/21.
 * this action is set to compelete the login and logout function
 */
@Controller
@Scope("prototype")
@Namespace("/")
@ParentPackage("struts-default")
public class LogInAndOutAction extends ActionSupport{

    String emp_id;
    String emp_pass;
    boolean emp_rem;

    @Autowired
    private ManagerService managerService;

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


    /**
     * login function,get emp_id��emp_pass and build to a Manager object.use login function to match database
     * if success,put emp_id to cookie and session,put a status with a "1" mean login successfully
     * if fail,put a status with a "0" mean login fail,and put a message with why fail
     */
    @Action(value = "login")
    public void login(){
        Manager manager = new Manager();
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
                HttpServletRequest request = ServletActionContext.getRequest();
                request.getSession().setAttribute("emp_id", getEmp_id());
                if(isEmp_rem()){
                    Cookie cookie = new Cookie("emp_id",getEmp_id());
                    response.addCookie(cookie);
                }
            }else{
                message.put("success","0");
                message.put("message","�û����������������������");
                ObjectMapper objectMapper = new ObjectMapper();
                String loginJson = objectMapper.writeValueAsString(message);
                HttpServletResponse response = ServletActionContext.getResponse();
                response.getOutputStream().write(loginJson.getBytes("UTF-8"));
            }
        }catch (Exception e){
            message.put("success","0");
            message.put("message","��������Ӧ��ʱ�����Ժ�����");
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

    /**
     * logout function,clear cookie and session whose name is emp_id
     * @return Action support status
     */
    @Action(value = "logout",results =
            @Result(name = ActionSupport.SUCCESS,location = "index.jsp")
            )
    public String logout(){
        HttpServletRequest request = ServletActionContext.getRequest();
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if(cookie.getName().equals(emp_id))
                cookie.setMaxAge(0);
        }
        request.getSession().setAttribute("emp_id","");
        return SUCCESS;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        LogInAndOutAction logInAndOutAction = (LogInAndOutAction)context.getBean("logInAndOutAction");
    }

}
