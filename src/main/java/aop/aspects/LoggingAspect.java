package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
  @Before("aop.aspects.MyPointcuts.allAddMethods()")
  public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
    System.out.println("beforeAddLoggingAdvice: Логирование попытки получить книгу или журнал");
    System.out.println(joinPoint.getSignature().getName());
    System.out.println(Arrays.toString(joinPoint.getArgs()));
    System.out.println("-----------------------------------------------------");

  }
}
