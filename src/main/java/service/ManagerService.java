package service;

import domain.Manager;
import mapper.ManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by JSZ on 2015/9/18.
 */
@Service
public class ManagerService {
    @Autowired
    private ManagerMapper managerMapper;

    /**
     * ע�����Ա
     * @param manager
     */
    public void createManager(Manager manager) {
        managerMapper.insert(manager);
    }

    /**
     * ��¼
     * @param manager
     * @return
     */
    public boolean login(Manager manager) {
        String pass=managerMapper.select(manager.getName()).getPass();
        if(pass.equals(manager.getPass()))
            return  true;
        return false;
    }
}

