package domain.enums;

/**
 * Created by Jsz on 2015/9/19.
 */
public enum EmpTypes {
    Official("��ʽԱ��"),
    Temporary("��ʱԱ��");
    private String des;

    EmpTypes(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
