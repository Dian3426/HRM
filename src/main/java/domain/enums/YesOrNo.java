package domain.enums;

/**
 * Created by Jsz on 2015/9/19.
 */
public enum YesOrNo {
    Yes("��"),
    No("��");

    private String des;

    YesOrNo(String  s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
