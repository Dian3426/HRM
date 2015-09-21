package actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.DeptService;
import service.EmpService;

import java.util.HashMap;
import java.util.List;

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

    @Autowired
    private DeptService deptService;

    public String addEmp(){
        return SUCCESS;
    }

    /**
     * create employee's emp number;format:xxxx
     * xxxx means he is the No.xxxx of com
     * @return empNo
     */
    private String createEmpNo(){
        int count = empService.getCount();
        String empNo = "";
        if(count < 10)
            empNo += "000";
        else if(count < 100)
            empNo += "00";
        else if(count < 1000)
            empNo += "0";
        empNo += count + 1;
        return SUCCESS;
    }

    /**
     * create employee's dept number,format: aabbb
     * aa means deptid , bbb means how many people in this dept
     * example:if A is a new and belongs to deptId 5 and this dept has haven 53 people;
     *         A's empPosNo is 05054
     * @param dept deptName
     * @return empDeptNo
     */
    private String createEmpDeptNo(String dept){
        List<HashMap<String,String>> deptidAndNames = deptService.getAllDeptidAndNames();
        int deptID = 0;
        for (HashMap<String, String> deptidAndName : deptidAndNames) {
            if(deptidAndName.get(deptID) == dept)
                break;
        }
        int count = deptService.getCountByDeptid(Integer.toString(deptID));
        String deptNo = "";
        if(deptID < 10)
            deptNo += "0";
        deptNo += deptID;
        if(count < 10)
            deptNo += "00";
        else if(count < 100)
            deptNo += "0";
        deptNo += count + 1;
        return deptNo;
    }

}
