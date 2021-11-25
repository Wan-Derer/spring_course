package spring_introduction;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("catBean")
public class Cat implements Pet {

  public Cat() {
    System.out.println("Создание объекта класса Cat");
  }

  @PostConstruct
  private void init() {
    System.out.println(this.getClass().getSimpleName() + " INIT");
  }

  @PreDestroy
  private void destroy() {
    System.out.println(this.getClass().getSimpleName() + " DESTROY");
  }

  @Override
  public void say() {
    System.out.println("Мяу-мяу");
  }
}
