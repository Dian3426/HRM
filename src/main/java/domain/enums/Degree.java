package domain.enums;

/**
 * Created by Jsz on 2015/9/19.
 */
public enum Degree {
    Postgraduate("研究生"),
    Undergraduate("本科生"),
    College("大专"),
    SHStudent("高中生及以下");
    private String des;

    Degree(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
