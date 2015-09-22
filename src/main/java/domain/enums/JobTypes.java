package domain.enums;

/**
 * Created by Jsz on 2015/9/19.
 */
public enum JobTypes  {
    Manage("管理"),
    Technology("技术"),
    Marketing("营销"),
    Market("市场");

    private String des;
     JobTypes(String s){
        des = s;
    }

    public String toString(){
        return des;
    }

}
