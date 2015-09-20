package domain.enums;

/**
 * Created by Jsz on 2015/9/19.
 */
public enum StaffTypes {
    Official("正式员工"),
    Temporary("临时员工");
    private String des;

    StaffTypes(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
