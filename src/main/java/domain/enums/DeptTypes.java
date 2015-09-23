package domain.enums;

/**
 * Created by Jsz on 2015/9/19.
 */
public enum DeptTypes  {
    Enterprise("公司"),
    Dept("部门");

    private String des;

    DeptTypes(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
