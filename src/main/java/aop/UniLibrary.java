package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

  public void getBook(){
    System.out.println("Мы берём книгу из " + this.getClass().getSimpleName());
    System.out.println("-----------------------------------------------------");
  }

  public void getMagazine(){
    System.out.println("Мы берём журнал из " + this.getClass().getSimpleName());
    System.out.println("-----------------------------------------------------");
  }

  public String returnBook(){
    System.out.println("Мы возвращаем книгу в " + this.getClass().getSimpleName());
    return "Some Book";
  }

  public void returnMagazine(){
    System.out.println("Мы возвращаем журнал в " + this.getClass().getSimpleName());
    System.out.println("-----------------------------------------------------");
  }

  public void addBook(String personName, Book book){
    System.out.println("Мы добавляем книгу в " + this.getClass().getSimpleName());
    System.out.println("-----------------------------------------------------");
  }

  public void addMagazine(){
    System.out.println("Мы добавляем журнал в " + this.getClass().getSimpleName());
    System.out.println("-----------------------------------------------------");
  }






}
