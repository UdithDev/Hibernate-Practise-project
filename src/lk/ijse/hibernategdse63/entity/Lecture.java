package lk.ijse.hibernategdse63.entity;

public class Lecture {
    private String lId;
    private String name;


    public Lecture() {
    }

    public Lecture(String lId, String name) {
        this.lId = lId;
        this.name = name;
    }

    public String getlId() {
        return lId;
    }

    public void setlId(String lId) {
        this.lId = lId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "lId='" + lId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
