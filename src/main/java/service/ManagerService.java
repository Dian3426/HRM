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
     * ×¢²á¹ÜÀíÔ±
     * @param manager
     */
    public void createManager(Manager manager) {
        managerMapper.insert(manager);
    }

    /**
     * µÇÂ¼
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

