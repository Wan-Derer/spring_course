package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
      new AnnotationConfigApplicationContext(MyConfig.class);

    Pet cat1 = context.getBean("catBean", Pet.class);
    Pet cat2 = context.getBean("catBean", Pet.class);
    cat1.say();

    System.out.println(cat1);
    System.out.println(cat2);

    Person person = context.getBean("person", Person.class);
    System.out.println(person);


//    Person person = context.getBean("person", Person.class);
//    person.callYourPet();
//    System.out.println(person);


    context.close();


  }

}
