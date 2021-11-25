package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

//  @Pointcut("execution(* aop.UniLibrary.*(..))")
//  private void allMethodsFromUniLibrary(){}
//
//  @Pointcut("execution(* aop.UniLibrary.addBook(..))")
//  private void addBookToUniLibrary(){}
//
//  @Pointcut("allMethodsFromUniLibrary() && !addBookToUniLibrary()")
//  private void allExceptAddBook(){}
//
//  @Before("allExceptAddBook()")
//  public void allExceptAddBookAdvice(){
//    System.out.println(getMethodName() + ": writing Log #4");
//  }

//  @Pointcut("execution(* aop.UniLibrary.get*())")
//  private void allGetMethodsFromUniLibrary() {
//  }
//
//  @Pointcut("execution(* aop.UniLibrary.return*())")
//  private void allReturnMethodsFromUniLibrary() {
//  }
//
//  @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//  private void allGetAndReturnMethodsFromUniLibrary(){}
//
//  @Before("allGetAndReturnMethodsFromUniLibrary()")
//  public void beforeGetAndReturnLoggingAdvice(){
//    System.out.println(getMethodName() + ": writing Log #3");
//  }
//
//  @Before("allGetMethodsFromUniLibrary()")
//  public void beforeGetLoggingAdvice(){
//    System.out.println(getMethodName() + ": writing Log #1");
//  }
//
//  @Before("allReturnMethodsFromUniLibrary()")
//  public void beforeReturnLoggingAdvice(){
//    System.out.println(getMethodName() + ": writing Log #2");
//  }


  private String getMethodName(){
    return Thread.currentThread().getStackTrace()[2].getMethodName();
  }

}



