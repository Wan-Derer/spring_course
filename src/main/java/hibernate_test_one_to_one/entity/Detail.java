package hibernate_test_one_to_one.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "details")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Detail {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENERATOR2")
  @SequenceGenerator(name = "GENERATOR2", allocationSize = 1)
  private int id;

  private String city;

  @Column(name = "phone_number")
  private String phoneNumber;

  private String email;

  @OneToOne(mappedBy = "empDetail", cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
  @ToString.Exclude
  private Employee employee;


  public Detail(String city, String phoneNumber, String email) {
    this.city = city;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }
}
