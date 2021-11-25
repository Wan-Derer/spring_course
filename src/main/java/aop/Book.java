package aop;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@ToString
public class Book {

  @Value("Название книги")
  private String name;

  @Value("Автор книги")
  private String author;

  @Value("1234")
  private int pubYear;


}
