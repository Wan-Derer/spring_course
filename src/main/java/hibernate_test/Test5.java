package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
  public static void main(String[] args) {

    SessionFactory factory = new Configuration()
//      .configure(new File("hibernate.cfg.xml"))
      .configure("hibernate.cfg.xml")
      .addAnnotatedClass(Employee.class)
      .buildSessionFactory();

    try (factory) {
      Session session = factory.getCurrentSession();
      session.beginTransaction();

//      Employee emp = session.get(Employee.class, 7);
//      session.delete(emp);

      session.createQuery("delete Employee where department = 'ИТ'").executeUpdate();


      session.getTransaction().commit();


    } catch (HibernateException e) {
      e.printStackTrace();
    }


  }
}
