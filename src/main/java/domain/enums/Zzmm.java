package domain.enums;

/**
 * Created by Jsz on 2015/9/19.
 */
public enum Zzmm {
    PartyMenber("党员"),
    Komsomolets("共青团员"),
    Mass("群众");

    private String des;

    Zzmm(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
