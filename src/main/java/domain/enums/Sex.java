package domain.enums;

/**
 * Created by Jsz on 2015/9/19.
 */
public enum Sex {
    Male("��"),
    Female("Ů");

    private String des;

    Sex(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
