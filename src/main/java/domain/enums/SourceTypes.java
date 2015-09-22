package domain.enums;

/**
 * Created by Jsz on 2015/9/19.
 */
public enum SourceTypes {
    Social("社会招聘"),
    School("校园招聘"),
    OtherSource("其他来源");

    private String des;

    SourceTypes(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
