package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
  public static void main(String[] args) {

    SessionFactory factory = new Configuration()
//      .configure(new File("hibernate.cfg.xml"))
      .configure("hibernate.cfg.xml")
      .addAnnotatedClass(Employee.class)
      .buildSessionFactory();

    try (factory) {
      Session session = factory.getCurrentSession();
      session.beginTransaction();

      session.createQuery("update Employee set salary = 1000 where department = 'ИТ'").executeUpdate();




      session.getTransaction().commit();


    } catch (HibernateException e) {
      e.printStackTrace();
    }


  }
}
