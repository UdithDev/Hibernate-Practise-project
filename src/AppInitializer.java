import lk.ijse.hibernategdse63.entity.*;
import lk.ijse.hibernategdse63.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;


public class AppInitializer{
    public static void main(String[] args) {

/*
        Student s1 = new Student();
        s1.setsId("S001");
        s1.setName("Udith");

        Laptop l1 = new Laptop();
        l1.setlId("L001");
        l1.setDescription("Dell");
        l1.setStudent(s1);

        Student s2 = new Student();
        s2.setsId("S002");
        s2.setName("Dev");

        Laptop l2 = new Laptop();
        l2.setlId("L002");
        l2.setDescription("Hp");
        l2.setStudent(s2);

        Laptop l3 = new Laptop();
        l3.setlId("L003");
        l3.setDescription("asus");
        l3.setStudent(s2);*/

/*      Owner o1 = new Owner();
        o1.setoId("o001");
        o1.setName("kamala");

        Pet p1 = new Pet();
        p1.setpId("P001");
        p1.setName("cat");
        p1.setOwner(o1);

        Pet p2=new Pet();
        p2.setpId("P002");
        p2.setName("Bird");
        p2.setOwner(o1);

        //1 methodology

        ArrayList<Pet> petList=new ArrayList<>();
        petList.add(p1);
        petList.add(p2);

        o1.setPetList(petList);

        o1.getPetList().add(p1);
        o1.getPetList().add(p2);*/

      /*  Lecture l1 = new Lecture();
        l1.setlId("L001");
        l1.setName("Niroth");

        Lecture l2=new Lecture();
        l2.setlId("L002");
        l2.setName("prasad");


        Subject s1 = new Subject();
        s1.setsId("S001");
        s1.setName("PRF");


        Subject s2 = new Subject();
        s2.setsId("S002");
        s2.setName("DBMS");

        ArrayList<Subject> subjectList=new ArrayList<>();
        subjectList.add(s1);
        subjectList.add(s2);*/

        //1type
        /*ArrayList<Lecture> lectureList=new ArrayList<>();
        lectureList.add(l1);
        lectureList.add(l2);

        l1.setSubjectList(subjectList);
        l2.setSubjectList(subjectList);

        s1.setLectureList(lectureList);
        s2.setLectureList(lectureList);*/

        //2 type

       /* l1.getSubjectList().add(s1);
        l1.getSubjectList().add(s2);

        s1.getLectureList().add(l1);
        s2.getLectureList().add(l1);
*/
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Owner o1 = session.get(Owner.class, "o001");
        System.out.println(o1.getoId()+" - "+o1.getName());

        System.out.println("-----------------");

        System.out.println(o1.getPetList());

        transaction.commit();
        session.close();
    }
}
