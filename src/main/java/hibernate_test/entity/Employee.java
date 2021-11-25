package hibernate_test.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

  @Column(name = "name")
  private String firstName;

  private String surname;
  private String department;
  private int salary;


  public Employee(String firstName, String surname, String department, int salary) {
    this.firstName = firstName;
    this.surname = surname;
    this.department = department;
    this.salary = salary;
  }
}
