package lk.ijse.hibernategdse63.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
@Entity(name = "Customer_detail")
public class Customer { // Customer_detail
    @Id
    private String id;
    @Column(name = "Customer_name")
    private String name; // customer_name
    private double salary;
    private String address;

    public Customer() {
    }

    public Customer(String id, String name, double salary, String address) {
        this.setId(id);
        this.setName(name);
        this.setSalary(salary);
        this.setAddress(address);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", address='" + getAddress() + '\'' +
                '}';
    }
}
