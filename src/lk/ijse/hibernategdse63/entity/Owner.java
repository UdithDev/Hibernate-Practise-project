package lk.ijse.hibernategdse63.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Owner {
    @Id
    private String oId;
    private String name;


    @OneToMany(mappedBy = "owner" , fetch = FetchType.EAGER)
    private List<Pet> petList=new ArrayList<>();

    public Owner(){

    }

    public Owner(String oId, String name,List<Pet> petList) {
        this.oId = oId;
        this.name = name;
    }

    public List<Pet> getPetList() {

        return petList;
    }

    public void setPetList(List<Pet> petList) {
        this.petList = petList;
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "oId='" + oId + '\'' +
                ", name='" + name + '\'' +
                ", petList=" + petList +
                '}';
    }
}
