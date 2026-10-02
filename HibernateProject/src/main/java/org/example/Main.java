package org.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("Asus");
        l1.setModel("Rog");
        l1.setRam(16);

        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setBrand("Apple");
        l2.setModel("Air");
        l2.setRam(16);

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Rahul");
        a1.setTech("Java");
        a1.setLaptops(Arrays.asList(l1, l2));


        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(org.example.Alien.class);
        cfg.addAnnotatedClass(org.example.Laptop.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();



        Transaction transaction = session.beginTransaction();

        session.persist(l1);
        session.persist(l2);
        session.persist(a1);

        transaction.commit();

        Alien a2 = session.find(Alien.class, 101);
        System.out.println(a2);

        session.close();
        sf.close();



    }


}
