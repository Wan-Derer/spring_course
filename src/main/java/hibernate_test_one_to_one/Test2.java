package hibernate_test_one_to_one;

import hibernate_test_one_to_one.entity.Detail;
import hibernate_test_one_to_one.entity.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
  public static void main(String[] args) {

    try (
      SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Employee.class)
        .addAnnotatedClass(Detail.class)
        .buildSessionFactory();

      Session session = factory.getCurrentSession()
    ) {

//      session.beginTransaction();
//
//      Employee emp = new Employee("Петя", "Машин", "Кадры", 520);
//      Detail detail = new Detail("Тбилиси", "345-67-89", "sashin@mail.com");
//
//      Employee emp2 = new Employee("Вася", "Петров", "Торговля", 410);
//      Detail detail2 = new Detail("Курган", "456-78-90", "petrov@mail.com");
//
//      emp.setEmpDetail(detail);
//      detail.setEmployee(emp);
//
//      emp2.setEmpDetail(detail2);
//      detail2.setEmployee(emp2);
//
//      session.save(emp);
//      session.save(detail2);
//
//      session.getTransaction().commit();


//      session.beginTransaction();
//
//      Detail detail = session.get(Detail.class, 7);
//
//      System.out.println(detail.getEmployee());
//
//      session.getTransaction().commit();

      session.beginTransaction();

      Detail detail = session.get(Detail.class, 6);
      detail.getEmployee().setEmpDetail(null);
      session.delete(detail);

      session.getTransaction().commit();


    } catch (HibernateException e) {
      e.printStackTrace();
    }


  }
}
