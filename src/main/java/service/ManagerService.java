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
     * 注册管理员
     * @param manager
     */
    public void createManager(Manager manager) {
        manager.setPass(Common.encodingMD5(manager.getPass()));
        managerMapper.createManager(manager);
    }
    /**
     * 登录
     * @param manager
     * @return  登录成功返回true否则返回false
     */
    public boolean login(Manager manager) {
        try {
            String pass = managerMapper.getManagerByName(manager.getName()).getPass();
        if(pass.equals(Common.encodingMD5(manager.getPass())))
            return  true;
        return false;}
        catch (NullPointerException e){
            System.err.println("该用户不存在不存在");
            return false;
        }
    }
}

