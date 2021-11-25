package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//  @Before("execution (* getStudents())")
//  public void beforeGetStudentsLoggingAdvice(){
//    System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов перед методом getStudents");
//  }

//  @AfterReturning(pointcut = "execution (* getStudents())", returning = "students")
//  public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
//    Student st1 = students.get(0);
//    String name = st1.getName();
//    name = "Чувак " + name;
//    st1.setName(name);
//
//    System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение списка студентов после метода getStudents");
//  }

//  @AfterThrowing(pointcut = "execution (* getStudents())", throwing = "exception")
//  public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
//
//    System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем исключение в методе getStudents " + exception);
//
//  }

  @After("execution (* getStudents())")
  public void afterGetStudentsLoggingAdvice(){

    System.out.println(
      "afterGetStudentsLoggingAdvice: логируем нормальное завершение метода getStudents или исключение"
    );

  }










}
