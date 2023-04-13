package lk.ijse.hibernategdse63.util;

import lk.ijse.hibernategdse63.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {

    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration(){
        sessionFactory=new Configuration().configure()
                .addAnnotatedClass(Owner.class)
                .addAnnotatedClass(Pet.class)
                .addAnnotatedClass(Lecture.class)
                .addAnnotatedClass(Subject.class)
                .buildSessionFactory();
    }

    public static FactoryConfiguration getInstance(){
        return (factoryConfiguration==null) ? factoryConfiguration=new FactoryConfiguration()
                : factoryConfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}