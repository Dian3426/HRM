package domain.enums;

/**
 * Created by Jsz on 2015/9/20.
 */
public enum Relations {
    Father("����"),
    Mother("ĸ��"),
    Spouse("��ż");
    private String des;

    Relations(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
