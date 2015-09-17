package domain;

/**
 * Created by Jsz on 2015/9/17.
 */
public class Histroy {
    private String id;
    private String dept_id;
    private String type;
    private String people;
    private String changetime;
    private String oldpeople;
    private String newpeople;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getChangetime() {
        return changetime;
    }

    public void setChangetime(String changetime) {
        this.changetime = changetime;
    }

    public String getOldpeople() {
        return oldpeople;
    }

    public void setOldpeople(String oldpeople) {
        this.oldpeople = oldpeople;
    }

    public String getNewpeople() {
        return newpeople;
    }

    public void setNewpeople(String newpeople) {
        this.newpeople = newpeople;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
