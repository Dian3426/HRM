package domain.enums;

/**
 * Created by Jsz on 2015/9/19.
 */
public enum  NationalTypes {
    Han("����"),
    Miao("����"),
    Man("����"),
    Hui("����"),
    OtherNation("��������");

    private String des;

    NationalTypes(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
