package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Scope("prototype")
public class Dog implements Pet {

  public Dog() {
    System.out.println("Создание объекта класса Dog");
  }

  @Override
  public void say(){
    System.out.println("Гав-гав");
  }
}
