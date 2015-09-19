package domain.enums;

/**
 * Created by Jsz on 2015/9/19.
 */
public enum EmpTypes {
    Official("正式员工"),
    Temporary("临时员工");
    private String des;

    EmpTypes(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
