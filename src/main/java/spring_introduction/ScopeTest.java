package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
      new ClassPathXmlApplicationContext("applicationContext3.xml");

    Cat cat1 = context.getBean("catBean", Cat.class);
    Cat cat2 = context.getBean("catBean", Cat.class);


    System.out.println(cat1);
    System.out.println(cat2);

cat1.say();



  context.close();

  }
}
