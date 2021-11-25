package hibernate_test_many_to_many.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "children")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Child {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int id;

  private String name;
  private int age;

  @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
  @JoinTable(
    name = "child_section"
    , joinColumns = @JoinColumn(name = "child_id")
    , inverseJoinColumns = @JoinColumn(name = "section_id")
  )
  @ToString.Exclude
  private List<Section> sections;

  public Child(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void addSectionToChild(Section section){
    if (sections == null) sections = new ArrayList<>();
    sections.add(section);
  }


}
