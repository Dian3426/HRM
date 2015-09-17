package bean;

/**
 * Created by ZaraN on 2015/9/17.
 * This bean is built to testing connecting to oracle with Mybatis
 */
public class Test {

    private int ID;
    private String username;

    public Test(){};

    public Test(int ID, String username) {
        this.ID = ID;
        this.username = username;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
