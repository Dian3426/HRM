package domain.enums;

/**
 * Created by Jsz on 2015/9/20.
 */
public enum ChangeTypes {
    Initiative("����"),
    Passive("����");

    private String des;

    ChangeTypes(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
