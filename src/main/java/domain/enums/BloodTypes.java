package domain.enums;

/**
 * Created by Jsz on 2015/9/19.
 */
public enum BloodTypes {
    A("A��"),
    B("B��"),
    AB("AB��"),
    O("O��"),
    OtherBlood("����Ѫ��");

    private String des;

    BloodTypes(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
