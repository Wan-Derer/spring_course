package spring_introduction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
//@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person {

  private Pet pet;

  @Value("${person.surname}")
  private String surname;
  @Value("${person.age}")
  private int age;


//  @Autowired
//  public Person(@Qualifier("catBean") Pet pet) {
//    System.out.println("Конструктор класса Person");
//    this.pet = pet;
//  }

  public Person(Pet pet) {
    System.out.println("Конструктор класса Person");
    this.pet = pet;
  }

  public void callYourPet() {
    System.out.println("Эй, жывотное!");
    pet.say();
  }



}
