import java.util.ArrayList;
import java.util.Date;

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
        Date current = new Date();
        for(Book i:books){
            //if the book is
            if(i.GetIDNum().equals(idNum)){
                if(current.before(i.getBorrowedDate()) || current.after(i.getReturnedDate())){
                    return true;
                }else{
                    return false;
                }
            }
        }
        throw new Exception("Book not found");
    }
}
