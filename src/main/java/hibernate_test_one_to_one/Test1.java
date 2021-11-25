package hibernate_test_one_to_one;

import hibernate_test_one_to_one.entity.Employee;
import hibernate_test_one_to_one.entity.Detail;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
  public static void main(String[] args) {

    try (
      SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Employee.class)
        .addAnnotatedClass(Detail.class)
        .buildSessionFactory();

      Session session = factory.getCurrentSession()
    ) {

      session.beginTransaction();

//      Employee emp = new Employee("Саша", "Иванов", "ИТ", 500);
//      Detail detail = new Detail("Баку", "123-45-67", "ivanov@mail.com");

//      Employee emp = new Employee("Ваня", "Петин", "Торговля", 400);
//      Detail detail = new Detail("Кагалым", "234-56-78", "petin@mail.com");
//
//      emp.setEmpDetail(detail);
//
//      session.save(emp);

      Employee emp = session.get(Employee.class, 11);
      session.delete(emp);


      session.getTransaction().commit();

    } catch (HibernateException e) {
      e.printStackTrace();
    }


  }
}
