package domain.enums;

/**
 * Created by Jsz on 2015/9/19.
 */
public enum Degree {
    Postgraduate("�о���"),
    Undergraduate("������"),
    SHStudent("������"),
    JHStudent("������"),
    OtherDegree("����ѧ��");
    private String des;

    Degree(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
