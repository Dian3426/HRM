package domain.enums;

/**
 * Created by Jsz on 2015/9/19.
 */
public enum Zzmm {
    PartyMenber("��Ա"),
    Komsomolets("������Ա"),
    Mass("Ⱥ��");

    private String des;

    Zzmm(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
