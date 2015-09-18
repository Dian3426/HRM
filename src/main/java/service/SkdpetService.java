package service;

import domain.Skdept;
import mapper.SkdeptManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Jsz on 2015/9/18.
 */
@Service
public class SkdpetService {

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
}
