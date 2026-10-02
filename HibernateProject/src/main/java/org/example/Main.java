package org.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {


        Student s1 = new Student();
        s1.setsName("Anvit");
        s1.setRollNO(106);
        s1.setsAge(28);



        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(org.example.Student.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();



        Transaction transaction = session.beginTransaction();
//        session.persist(s1);

        //We can use merge to create or update any record
        session.remove(s1);

        transaction.commit();


        session.close();
        sf.close();

        System.out.println(s1);

    }


}
