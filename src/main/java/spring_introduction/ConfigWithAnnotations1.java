package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext3.xml");

//    Cat cat1 = context.getBean("catBean", Cat.class);
//    cat1.say();
//
//    Dog dog1 = context.getBean("dog", Dog.class);
//    dog1.say();

    Person person = context.getBean("person", Person.class);
    person.callYourPet();

    System.out.println(person);

    context.close();
  }


}
