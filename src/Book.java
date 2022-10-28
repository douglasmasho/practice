import java.util.Date;
import java.time.*;

public class Book {
    private String name;
    private String idNum;
    private LocalDate borrowedDate;
    private LocalDate returnedDate;


    public Book(String newName, String newIDNum, LocalDate newBorrowedDate, LocalDate newReturnedDate){
        name = newName;
        idNum = newIDNum;
        borrowedDate = newBorrowedDate;
        returnedDate = newReturnedDate;
    }

    public String GetName(){
        return name;
    }

    public String GetIDNum(){
        return idNum;
    }

    public void SetBorrowedDate(LocalDate newDate){
        borrowedDate = newDate;
    }

    public void SetReturnedDate(LocalDate newDate){
        returnedDate = newDate;
    }

    public LocalDate getBorrowedDate(){
        return borrowedDate;
    }
    public LocalDate getReturnedDate(){
        return returnedDate;
    }

}
