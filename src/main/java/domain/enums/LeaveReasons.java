package domain.enums;

/**
 * Created by Jsz on 2015/9/20.
 */
public enum LeaveReasons {
    Resign("主动辞职"),
    Dismiss("辞退"),
    Expel("开除"),
    Retire("退休"),
    Notby("试用期未通过");

    private String des;

    LeaveReasons(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
