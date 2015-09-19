package actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by ZaraN on 2015/9/19.
 */
@Controller
@Scope("prototype")
@Namespace("/mainFrame")
@ParentPackage("struts-default")
public class MainAction extends ActionSupport{

    @Action(value = "",results = {
            @Result(name = ActionSupport.SUCCESS,location = "/WEB-INF/testStrutsTo.jsp")
    })
    public String mainFrame(){
        return SUCCESS;
    }

    @Action(value = "deptInfo",results = {
            @Result(name = ActionSupport.SUCCESS,location = "/WEB-INF/testStrutsTo.jsp")
    })
    public String deptInfo(){
        return SUCCESS;
    }

    @Action(value = "deptAdd",results = {
            @Result(name = ActionSupport.SUCCESS,location = "/WEB-INF/testStrutsTo.jsp")
    })
    public String deptAdd(){
        return SUCCESS;
    }

}
