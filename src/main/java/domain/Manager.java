package domain;

import org.springframework.stereotype.Component;

/**
 * Created by Jsz on 2015/9/17.
 */
@Component
public class Manager {
    private int id;
    private String name;
    private String pass;

    public Manager(){}

    public Manager(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
