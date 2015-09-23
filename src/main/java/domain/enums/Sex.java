package domain.enums;

/**
 * Created by Jsz on 2015/9/19.
 */
public enum Sex {
    Male("男"),
    Female("女");

    private String des;

    Sex(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
