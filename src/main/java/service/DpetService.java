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
     * ȡ�� start�к�end��֮�������
     * @param start
     * @param end
     * @return
     */
    public List<Skdept> getDeptsByRows(int start,int end){
        return skdeptManager.getDeptsByRows(start,end);
    }

    /**
     * ��ȡ���еĲ��ű�ţ��Լ���Ӧ���ƣ��Ա���д�ϼ�����
     * ע��Skdept���ϼ����Ŷ�Ӧ����id����������
     * @return
     */
    public HashMap<String,String> getAllDeptidAndNames(){
        return skdeptManager.getAllDeptidAndNames();
    }
}
