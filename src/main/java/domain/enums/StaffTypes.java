package domain.enums;

/**
 * Created by Jsz on 2015/9/19.
 */
public enum StaffTypes {
    Official("��ʽԱ��"),
    Temporary("��ʱԱ��");
    private String des;

    StaffTypes(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
