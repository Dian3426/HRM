package domain.enums;

/**
 * Created by Jsz on 2015/9/19.
 */
public enum DeptTypes  {
    Enterprice("???"),
    Dept("????");

    private String des;

    DeptTypes(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
