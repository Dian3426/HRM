package domain.enums;

/**
 * Created by Jsz on 2015/9/19.
 */
public enum JobTypes implements GenericEnum {
    Manage("����"),
    Technology("����"),
    Marketing("Ӫ��"),
    Market("�г�");

    private String des;
     JobTypes(String s){
        des = s;
    }

    public String toString(){
        return des;
    }

}
