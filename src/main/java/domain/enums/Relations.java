package domain.enums;

/**
 * Created by Jsz on 2015/9/20.
 */
public enum Relations {
    Father("父亲"),
    Mother("母亲"),
    Spouse("配偶");
    private String des;

    Relations(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
