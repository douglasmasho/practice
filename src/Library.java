import java.util.ArrayList;
import java.util.Date;
import java.time.*;

public class Library {
    private ArrayList<Book> books;

    public Library(){
        books =  new ArrayList<Book>();
    }

    //methods to add and remove from the lists
    public void addBook(Book newBook){
        books.add(newBook);
    }


    public void removeBook(String idNum){
        for(int i =0; i < books.size(); i++){
            if(books.get(i).GetIDNum().equals(idNum)){
                books.remove(i);
            }
        }
    }

    public boolean checkAvailability(String idNum) throws Exception{
        //loop through all the books
        //get current date
        LocalDate current = LocalDate.now();
        for(Book i:books){
            //if the book is
            if(i.GetIDNum().equals(idNum)){
                if(current.isBefore(i.getBorrowedDate()) || current.isAfter(i.getReturnedDate())){
                    return true;
                }else{
                    return false;
                }
            }
        }
        throw new Exception("Book not found");
    }


    public int HowManyBooksToBeReturned(){
        int count = 0;
        for(Book i: books){
            LocalDate current = LocalDate.now();
            System.out.println(current);
            System.out.println(i.getReturnedDate());
            if(i.getReturnedDate().equals(current)){
                count++;
            }
        }
        return count;
    }
}
