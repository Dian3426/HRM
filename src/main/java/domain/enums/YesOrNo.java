package domain.enums;

/**
 * Created by Jsz on 2015/9/19.
 */
public enum YesOrNo {
    Yes("是"),
    No("否");

    private String des;

    YesOrNo(String  s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
