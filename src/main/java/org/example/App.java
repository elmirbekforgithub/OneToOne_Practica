package org.example;

import org.example.entyti.Detail;
import org.example.entyti.Emplooye;
import org.example.entyti.Have;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
//     try {
//         Session session = HibernateUtil.getSession().openSession();
//         Emplooye emplooye = new Emplooye("Elmirbek","Alisherov","IT",100);
//         Detail detail = new Detail("Buishkek","0709-89-82-30","elmirbeka@gmail.com");
//         emplooye.setEmployDetails(detail);
//         session.beginTransaction();
//         session.save(emplooye);
//         session.getTransaction().commit();
//         System.out.println("Don!");
//     }catch (Exception e){
//         System.out.println(e);
//     }

//        try {
//            Session session = HibernateUtil.getSession().openSession();
//            Emplooye emplooye = new Emplooye("Nurmukhamed","Babaev","President",300);
//            Detail detail = new Detail("Buishkek","0552-34-65-23","babaev@gmail.com");
//            emplooye.setEmployDetails(detail);
//            session.beginTransaction();
//            session.save(emplooye);
//            session.getTransaction().commit();
//            System.out.println("Don!");
//        }catch (Exception e){
//            System.out.println(e);
//        }
        Emplooye emplooye1 = new Emplooye("Elmirbek","Alisherov","IT",100);
             Detail detail1 = new Detail("Buishkek","0709-89-82-30","elmirbeka@gmail.com");

        Emplooye emplooye = new Emplooye("Nurmukhamed","Babaev","President",300);
        Detail detail = new Detail("Buishkek","0552-34-65-23","babaev@gmail.com");
get(1);


    }
    public static void create(Emplooye emplooye,Detail detail){
        try {
            Session session = HibernateUtil.getSession().openSession();
            emplooye.setEmployDetails(detail);
            session.beginTransaction();
            session.save(emplooye);
            session.getTransaction().commit();
            System.out.println("Don!");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void delate(int id){
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();
        Emplooye emplooye = session.get(Emplooye.class,id);
        session.delete(emplooye);
        session.getTransaction().commit();
        System.out.println("user delete");
    }
    public static void get(int id){
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();
        Emplooye emplooye = session.get(Emplooye.class,id);
        System.out.println(emplooye.getEmployDetails());
        session.getTransaction();
        System.out.println("user!!!!!!!!!!!!!!!46363575b436nw535");
    }

}
