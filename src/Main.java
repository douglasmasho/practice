import java.util.*;
import java.time.*;
public class Main {
    public static void main(String[] args){
        //System.out.println("Hello world");
        Library l1 = new Library();

        Book b1 = new Book("Bible", "123", LocalDate.parse("2022-10-18"), LocalDate.parse("2022-10-28"));
        Book b2 = new Book("The magic of thinking big", "124", LocalDate.parse("2022-09-18"), LocalDate.parse("2022-09-28"));
        l1.addBook(b1);
        l1.addBook(b2);
//        System.out.println(l1.HowManyBooksToBeReturned());

        try{
            System.out.println(l1.checkAvailability("123"));
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }


}
