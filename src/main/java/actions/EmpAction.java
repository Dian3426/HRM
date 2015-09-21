package actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.EmpService;

/**
 * Created by ZaraN on 2015/9/21.
 * this action's function is all about to operation with employees.
 */
@Controller
@Scope("prototype")
@Namespace("/")
@ParentPackage("struts-default")
public class EmpAction extends ActionSupport {

    @Autowired
    private EmpService empService;

    public String addEmp(){
        return SUCCESS;
    }

    private String createEmpNumber(){
        return SUCCESS;
    }

}
