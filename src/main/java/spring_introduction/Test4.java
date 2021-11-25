package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext2.xml");

    Cat cat1 = context.getBean("myPet", Cat.class);
    System.out.println(cat1);

    Cat cat2 = context.getBean("myPet", Cat.class);
    System.out.println(cat2);


    System.out.println("Context close");
    context.close();

  }
}
