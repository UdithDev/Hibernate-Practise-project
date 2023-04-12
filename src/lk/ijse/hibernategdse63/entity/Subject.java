package lk.ijse.hibernategdse63.entity;

public class Subject {
    private String sId;
    private String name;


    public Subject() {
    }


    public Subject(String sId, String name) {
        this.sId = sId;
        this.name = name;
    }


    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
