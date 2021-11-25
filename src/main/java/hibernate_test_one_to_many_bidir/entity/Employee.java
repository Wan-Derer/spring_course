package hibernate_test_one_to_many_bidir.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
  private int salary;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "department_id")
  @ToString.Exclude
  private Department department;

  public Employee(String firstName, String surname, int salary) {
    this.firstName = firstName;
    this.surname = surname;
    this.salary = salary;
  }
}


