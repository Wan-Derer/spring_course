package hibernate_test_one_to_many_bidir.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Department {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int id;

  private String name;

  @Column(name = "max_salary")
  private int maxSalary;
  @Column(name = "min_salary")
  private int minSalary;

  @OneToMany(
    cascade = CascadeType.ALL
    ,    mappedBy = "department"
    ,    fetch = FetchType.EAGER
  )
  @ToString.Exclude
  List<Employee> emps;

  public Department(String name, int maxSalary, int minSalary) {
    this.name = name;
    this.maxSalary = maxSalary;
    this.minSalary = minSalary;
  }

  public void addEmployeeToDepartment(Employee employee) {
    if (emps == null) emps = new ArrayList<>();

    emps.add(employee);
    employee.setDepartment(this);
  }


}
