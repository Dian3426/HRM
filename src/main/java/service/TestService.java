package service;

import impl.TestDaoImpl;

/**
 * Created by ZaraN on 2015/9/17.
 */
public class TestService {
    private TestDaoImpl testImpl;

    public TestDaoImpl getTestImpl() {
        return testImpl;
    }

    public void setTestImpl(TestDaoImpl testImpl) {
        this.testImpl = testImpl;
    }

    public void insert(int ID, String username){
        this.testImpl.insert(ID,username);
    }
}
