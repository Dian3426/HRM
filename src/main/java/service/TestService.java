package service;

import mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import domain.Test;

/**
 * Created by ZaraN on 2015/9/17.
 */
@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public void insert(int ID,String username){
        Test test = new Test(ID,username);
        testMapper.insert(test);
    }

    public void delete(int ID){
        testMapper.delete(ID);
    }

}
