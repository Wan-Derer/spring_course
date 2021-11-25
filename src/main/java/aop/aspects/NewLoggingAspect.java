package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

  @Around("execution(public String returnBook())")
  public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint pjp) throws Throwable {
    System.out.println("aroundReturnBookLoggingAdvice: в библиотеку пытаются вернуть книгу");

    long begin = System.currentTimeMillis();
    Object res = pjp.proceed();
    long end = System.currentTimeMillis();

    System.out.println("aroundReturnBookLoggingAdvice: в библиотеку успешно вернули книгу");
    System.out.println("Time: " + (end-begin) + " ms");
    return res;
  }

}