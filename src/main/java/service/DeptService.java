package service;

import domain.Skdept;
import domain.Skjob;
import mapper.SkdeptMapper;
import mapper.SkjobMapper;
import mapper.TalentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Jsz on 2015/9/18.
 */
@Service
public class DeptService {

    @Autowired
    private SkdeptMapper skdeptManager;

    @Autowired
    private SkjobMapper skjobManager;

    @Autowired
    private TalentMapper talentMapper;
    /**
     * ����һ������
     * @param skdept
     */
    public void createDept(Skdept skdept){
        skdeptManager.createDept(skdept);
    }

    /**
     * ��ȡ���еĲ���
     * @return
     */
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
        return skdeptManager.getDeptsByRows(start, end);
    }

    /**
     * ��ȡ���еĲ��ű�ţ��Լ���Ӧ���ƣ��Ա���д�ϼ�����
     * ע��Skdept���ϼ����Ŷ�Ӧ����id����������
     * @return
     */
    public List<HashMap<String,String>> getAllDeptidAndNames(){
        return skdeptManager.getAllDeptidAndNames();
    }

    /**
     * dept_id�������Ӧ�޸ĵ�Ŀ��һ��
     * @param dept
     */
    public void updateDept(Skdept dept){
        skdeptManager.updateByDeptid(dept);
    }

    /**
     * ɾ����Ӧdept_id������
     * @param dept_id
     */
    public boolean deleteDept(String dept_id){
        if(!empInThisDept(dept_id)) {
            skdeptManager.delete(dept_id);
            return true;
        }else {
            System.err.println("����ɾ��ʧ�ܣ��������ڸò��ŵ�Ա��");
            return false;
        }
    }

    private boolean empInThisDept(String dept_id){
        List<Skjob> list = skjobManager.getJobsByDeptid(dept_id);
        if(list.isEmpty())
            return false;
        else {
            for(Skjob job:list){
                if(!talentMapper.getTalentByJobid(job.getJob_id()).isEmpty())
                    return true;
            }
            return false;
        }
    }
}
