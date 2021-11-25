package hibernate_test_one_to_many_bidir;

import hibernate_test_one_to_many_bidir.entity.Department;
import hibernate_test_one_to_many_bidir.entity.Employee;
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
        .addAnnotatedClass(Department.class)
        .buildSessionFactory();

      Session session = factory.getCurrentSession()
    ) {

//      session.beginTransaction();
//
//      Department department = new Department("ИТ", 1000, 200);
//      department.addEmployeeToDepartment(new Employee("Ваня", "Петин", 500));
//      department.addEmployeeToDepartment(new Employee("Петя", "Ванин", 550));
//
//      session.save(department);
//
//      session.getTransaction().commit();


      session.beginTransaction();

      Department dep = session.get(Department.class, 1);
      System.out.println(dep);
      System.out.println(dep.getEmps());

//      Employee emp = session.get(Employee.class, 16);
//      System.out.println(emp);
//      System.out.println(emp.getDepartment());

      session.getTransaction().commit();


//      session.beginTransaction();
//
//      Employee emp = session.get(Employee.class, 19);
//      session.delete(emp);
//
//      session.getTransaction().commit();


//      session.beginTransaction();
//
//      Department dep = session.get(Department.class, 23);
//      session.delete(dep);
//
//      session.getTransaction().commit();





    } catch (HibernateException e) {
      e.printStackTrace();
    }


  }
}
