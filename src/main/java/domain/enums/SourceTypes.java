package domain.enums;

/**
 * Created by Jsz on 2015/9/19.
 */
public enum SourceTypes {
    Social("�����Ƹ"),
    School("У԰��Ƹ"),
    OtherSource("������Դ");

    private String des;

    SourceTypes(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
