package service;

import common.Common;
import domain.Manager;
import mapper.ManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by JSZ on 2015/9/18.
 */
@Service
public class ManagerService extends BaseService{
    @Autowired
    private ManagerMapper managerMapper;

    /**
     * ע�����Ա
     * @param manager
     */
    public void createManager(Manager manager) {
        manager.setPass(Common.encodingMD5(manager.getPass()));
        managerMapper.createManager(manager);
    }
    /**
     * ��¼
     * @param manager
     * @return  ��¼�ɹ�����true���򷵻�false
     */
    public boolean login(Manager manager) {
        try {
            String pass = managerMapper.getManagerByName(manager.getName()).getPass();
        if(pass.equals(Common.encodingMD5(manager.getPass())))
            return  true;
        return false;}
        catch (NullPointerException e){
            System.err.println("���û������ڲ�����");
            return false;
        }
    }
}

