package service;

import domain.Skdept;
import mapper.SkdeptManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Jsz on 2015/9/18.
 */
@Service
public class DpetService {

    @Autowired
    private SkdeptManager skdeptManager;

    public void createDept(Skdept skdept){
        skdeptManager.createDept(skdept);
    }

    public List<Skdept> getAllDepts(){
        return skdeptManager.getAllDepts();
    }

    /**
     * 取出 start行和end行之间的数据
     * @param start
     * @param end
     * @return
     */
    public List<Skdept> getDeptsByRows(int start,int end){
        return skdeptManager.getDeptsByRows(start,end);
    }

    /**
     * 获取所有的部门编号，以及对应名称，以便填写上级部门
     * 注意Skdept中上级部门对应的是id而不是名称
     * @return
     */
    public HashMap<String,String> getAllDeptidAndNames(){
        return skdeptManager.getAllDeptidAndNames();
    }
}
