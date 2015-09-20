package domain.enums;

/**
 * Created by Jsz on 2015/9/20.
 */
public enum LeaveReasons {
    Resign("������ְ"),
    Dismiss("����"),
    Expel("����"),
    Retire("����"),
    Notby("������δͨ��");

    private String des;

    LeaveReasons(String s){
        des = s;
    }

    @Override
    public String toString() {
        return des;
    }
}
