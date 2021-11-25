package hibernate_test_many_to_many;

import hibernate_test_many_to_many.entity.Child;
import hibernate_test_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
  public static void main(String[] args) {

    try (
      SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Child.class)
        .addAnnotatedClass(Section.class)
        .buildSessionFactory();
      Session session = factory.getCurrentSession()
    ) {

//      session.beginTransaction();
//
//      Section section = new Section("Футбол");
//      section.addChildToSection(new Child("Вася", 5));
//      section.addChildToSection(new Child("Коля", 6));
//      section.addChildToSection(new Child("Маша", 4));
//
//      session.save(section);
//
//      session.getTransaction().commit();


//      session.beginTransaction();
//
//      Child child = new Child("Глаша", 7);
//      child.addSectionToChild(new Section("Бокс"));
//      child.addSectionToChild(new Section("Танцы"));
//      child.addSectionToChild(new Section("Шахматы"));
//
//      session.persist(child);
//
//      session.getTransaction().commit();


//      session.beginTransaction();
//
//      Section section = session.get(Section.class, 37);
//      System.out.println(section);
//      System.out.println(section.getChildren());
//
//      session.getTransaction().commit();


//      session.beginTransaction();
//
//      Child child = session.get(Child.class, 41);
//      System.out.println(child);
//      System.out.println(child.getSections());
//
//      session.getTransaction().commit();


//      session.beginTransaction();
//
//      Section section = session.get(Section.class, 37);
//      session.delete(section);
//
//      session.getTransaction().commit();


      session.beginTransaction();

      Child child = session.get(Child.class, 46);
      session.delete(child);

      session.getTransaction().commit();



    } catch (Exception e) {
      e.printStackTrace();
    }


  }
}
