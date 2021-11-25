package hibernate_test_many_to_many.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "section")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Section {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int id;

  private String name;

  @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
  @JoinTable(
    name = "child_section"
    , joinColumns = @JoinColumn(name = "section_id")
    , inverseJoinColumns = @JoinColumn(name = "child_id")
  )
  private List<Child> children;

  public Section(String name) {
    this.name = name;

  }

  public void addChildToSection(Child child){
    if (children == null) children = new ArrayList<>();
    children.add(child);

  }


}
