package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
  public static void main(String[] args) {

    SessionFactory factory = new Configuration()
//      .configure(new File("hibernate.cfg.xml"))
      .configure("hibernate.cfg.xml")
      .addAnnotatedClass(Employee.class)
      .buildSessionFactory();

    try (factory) {
      Session session = factory.getCurrentSession();
      Employee employee = new Employee("Олег", "Сидоров", "Кадры", 200);

      session.beginTransaction();
      session.save(employee);
//      session.getTransaction().commit();

      int myId = employee.getId();
//      session = factory.getCurrentSession();
//      session.beginTransaction();
      Employee emp2 = session.get(Employee.class, myId);
      session.getTransaction().commit();

      System.out.println(emp2);






    } catch (HibernateException e) {
      e.printStackTrace();
    }


  }
}
