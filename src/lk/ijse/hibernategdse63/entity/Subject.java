package lk.ijse.hibernategdse63.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Subject {
    @Id
    private String sId;
    private String name;


    @ManyToMany
    private List<Lecture> lectureList=new ArrayList<>();

    public Subject() {
    }


    public Subject(String sId, String name, List<Lecture> lectureList) {
        this.sId = sId;
        this.name = name;
        this.lectureList = lectureList;
    }

    public List<Lecture> getLectureList() {
        return lectureList;
    }

    public void setLectureList(List<Lecture> lectureList) {
        this.lectureList = lectureList;
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
