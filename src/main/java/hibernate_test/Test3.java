package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
  public static void main(String[] args) {

    SessionFactory factory = new Configuration()
//      .configure(new File("hibernate.cfg.xml"))
      .configure("hibernate.cfg.xml")
      .addAnnotatedClass(Employee.class)
      .buildSessionFactory();

    try (factory) {
      Session session = factory.getCurrentSession();
      session.beginTransaction();

      List<?> emps = session
        .createQuery("from Employee where department = 'ИТ' and salary > 550")
        .getResultList();

      List<Employee> employees = session.createQuery("from Employee ").getResultList();

      emps.forEach(System.out::println);

      session.getTransaction().commit();







    } catch (HibernateException e) {
      e.printStackTrace();
    }


  }
}
