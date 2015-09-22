package domain.enums;

/**
 * Created by Jsz on 2015/9/19.
 */
public enum  NationalTypes {
    Han("汉族"),
    Miao("苗族"),
    Man("满族"),
    Hui("回族"),
    OtherNation("其他民族");

    private String des;

    NationalTypes(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
