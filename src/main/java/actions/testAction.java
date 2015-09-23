package actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * test for SSM
 */
@Controller
@Scope("prototype")
@Namespace("/Test")
@ParentPackage("struts-default")
@Action(value = "Login",results = {
        @Result(name = ActionSupport.SUCCESS,location = "/WEB-INF/testStrutsTo.jsp"),
        @Result(name = ActionSupport.ERROR,location = "/WEB-INF/testStrutsError.jsp")}
)
public class testAction extends ActionSupport{

    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    @Override
//    @Action(value = "Login")
//    public String execute() throws Exception {
//        if(getUsername().equals("SCOTT") && getPassword().equals("tiger")){
//            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//            TestService testService = (TestService)context.getBean("testService");
//            testService.insert(10, "Perry");
//            return SUCCESS;
//        }
//        else
//            return ERROR;
//    }


}
