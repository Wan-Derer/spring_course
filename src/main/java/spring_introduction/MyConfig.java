package spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("spring_introduction")
@PropertySource(value = "classpath:myApp.properties", encoding = "UTF-8")
public class MyConfig {

  @Bean
  @Scope("prototype")
  public Pet catBean() {
    return new Cat();
  }

  @Bean
  public Person person() {
    return new Person(catBean());
  }


}
