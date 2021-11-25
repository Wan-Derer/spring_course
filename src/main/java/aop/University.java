package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class University {

  private final List<Student> students = new ArrayList<>();

  public void addStudents() {
    students.addAll(Arrays.asList(
        new Student("Имя 1", 4, 7.5),
        new Student("Имя 2", 2, 8.3),
        new Student("Имя 3", 1, 9.1)
      )
    );
  }

  public List<Student> getStudents() {
    System.out.println("Start of getStudents method");
//    System.out.println(students.get(5));
    System.out.println("Information from method getStudents:");
    System.out.println(students);
    return students;
  }


}
