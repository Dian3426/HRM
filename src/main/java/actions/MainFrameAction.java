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
public class MainFrameAction extends ActionSupport{

    @Action(value = "",results = {
            @Result(name = ActionSupport.SUCCESS,location = "/WEB-INF/main_frame.jsp")
    })
    public String mainFrame(){

        return SUCCESS;
    }

    @Action(value = "deptInfo",results = {
            @Result(name = ActionSupport.SUCCESS,location = "/WEB-INF/orgManage/dept_info.jsp")
    })
    public String deptInfo(){
        return SUCCESS;
    }

    @Action(value = "deptAdd",results = {
            @Result(name = ActionSupport.SUCCESS,location = "/WEB-INF/orgManage/dept_add.jsp")
    })
    public String deptAdd(){
        return SUCCESS;
    }

    @Action(value = "postAdd",results = {
            @Result(name = ActionSupport.SUCCESS,location = "/WEB-INF/posManage/post_add.jsp")
    })
    public String postAdd(){
        return SUCCESS;
    }

        @Action(value = "empAdd",results = {
            @Result(name = ActionSupport.SUCCESS,location = "/WEB-INF/empManage/emp_add.jsp")
    })
    public String empAdd(){
        return SUCCESS;
    }

    @Action(value = "postInfo",results = {
            @Result(name = ActionSupport.SUCCESS,location = "/WEB-INF/posManage/post_info.jsp")
    })
    public String postInfo(){
        return SUCCESS;
    }

    @Action(value = "empInfo",results = {
            @Result(name = ActionSupport.SUCCESS,location = "/WEB-INF/empManage/emp_info.jsp")
    })
    public String empInfo(){
        return SUCCESS;
    }

    @Action(value = "probInfo",results = {
            @Result(name = ActionSupport.SUCCESS,location = "/WEB-INF/probManage/prob_info.jsp")
    })
    public String probInfo(){
        return SUCCESS;
    }

    @Action(value = "probedInfo",results = {
            @Result(name = ActionSupport.SUCCESS,location = "/WEB-INF/probManage/probed_info.jsp")
    })
    public String probedInfo(){
        return SUCCESS;
    }

    @Action(value = "empExited",results = {
            @Result(name = ActionSupport.SUCCESS,location = "/WEB-INF/empManage/emp_exited.jsp")
    })
    public String empExited(){
        return SUCCESS;
    }

    @Action(value = "postTrans",results = {
            @Result(name = ActionSupport.SUCCESS,location = "/WEB-INF/posTransManage/post_trans.jsp")
    })
    public String postTrans(){
        return SUCCESS;
    }

    @Action(value = "postTransed",results = {
            @Result(name = ActionSupport.SUCCESS,location = "/WEB-INF/posTransManage/post_transed.jsp")
    })
    public String postTransed(){
        return SUCCESS;
    }

    @Action(value = "empSearch",results = {
            @Result(name = ActionSupport.SUCCESS,location = "/WEB-INF/empManage/emp_search.jsp")
    })
    public String empSearch(){
        return SUCCESS;
    }

    @Action(value = "newEmpTable",results = {
            @Result(name = ActionSupport.SUCCESS,location = "/WEB-INF/tableManage/newemp_table.jsp")
    })
    public String newEmpTable(){
        return SUCCESS;
    }

    @Action(value = "exitEmpTable",results = {
            @Result(name = ActionSupport.SUCCESS,location = "/WEB-INF/tableManage/exitemp_table.jsp")
    })
    public String exitEmpTable(){
        return SUCCESS;
    }

    @Action(value = "deptTransTable",results = {
            @Result(name = ActionSupport.SUCCESS,location = "/WEB-INF/tableManage/dept_trans_table.jsp")
    })
    public String deptTransTable(){
        return SUCCESS;
    }

    @Action(value = "hrMonth",results = {
            @Result(name = ActionSupport.SUCCESS,location = "/WEB-INF/tableManage/hr_month_table.jsp")
    })
    public String hrMonth(){
        return SUCCESS;
    }
}
