package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
  public static void main(String[] args) {

    SessionFactory factory = new Configuration()
//      .configure(new File("hibernate.cfg.xml"))
      .configure("hibernate.cfg.xml")
      .addAnnotatedClass(Employee.class)
      .buildSessionFactory();

    try (factory) {
      Session session = factory.getCurrentSession();
      Employee employee = new Employee("Саня", "Иванов", "ИТ", 600);

      session.beginTransaction();
      session.save(employee);
      session.getTransaction().commit();
    } catch (HibernateException e) {
      e.printStackTrace();
    }


  }
}
