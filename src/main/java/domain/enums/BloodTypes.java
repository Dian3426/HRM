package domain.enums;

/**
 * Created by Jsz on 2015/9/19.
 */
public enum BloodTypes {
    A("A型"),
    B("B型"),
    AB("AB型"),
    O("O型"),
    OtherBlood("其他血型");

    private String des;

    BloodTypes(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
