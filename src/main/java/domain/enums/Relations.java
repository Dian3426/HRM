package domain.enums;

/**
 * Created by Jsz on 2015/9/20.
 */
public enum Relations {
    Father("¸¸Ç×"),
    Mother("Ä¸Ç×"),
    Spouse("ÅäÅ¼");
    private String des;

    Relations(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
