package domain.enums;

/**
 * Created by Jsz on 2015/9/20.
 */
public enum ChangeTypes {
    Initiative("主动"),
    Passive("被动");

    private String des;

    ChangeTypes(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
