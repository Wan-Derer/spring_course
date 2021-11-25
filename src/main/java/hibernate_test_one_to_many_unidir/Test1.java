package hibernate_test_one_to_many_unidir;

import hibernate_test_one_to_many_unidir.entity.Department;
import hibernate_test_one_to_many_unidir.entity.Employee;
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


//      session.beginTransaction();
//
//      Department dep = session.get(Department.class, 34);
//      System.out.println(dep);
//      System.out.println(dep.getEmps());
//
//      session.getTransaction().commit();


//      session.beginTransaction();
//
//      Employee emp = session.get(Employee.class, 36);
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
