package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
      new AnnotationConfigApplicationContext(Config.class);

    UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
    Book book = context.getBean("book", Book.class);

    uniLibrary.getBook();
//    uniLibrary.returnBook();

    uniLibrary.getMagazine();

    uniLibrary.addBook("Вася", book);
    uniLibrary.addMagazine();



    context.close();

  }
}
