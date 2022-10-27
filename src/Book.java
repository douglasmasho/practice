import java.util.Date;

public class Book {
    private String name;
    private String idNum;
    private Date borrowedDate;
    private Date returnedDate;


    public Book(String newName, String newIDNum, Date newBorrowedDate, Date newReturnedDate){
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

    public void SetBorrowedDate(Date newDate){
        borrowedDate = newDate;
    }

    public void SetReturnedDate(Date newDate){
        returnedDate = newDate;
    }

    public Date getBorrowedDate(){
        return borrowedDate;
    }
    public Date getReturnedDate(){
        return returnedDate;
    }

}
