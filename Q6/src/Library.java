import java.util.ArrayList;
import java.util.Iterator;


public class Library {
	private ArrayList<Book> bookList=new ArrayList<Book>();
     
     public void setBookList(ArrayList<Book> bookList){
         this.bookList=bookList;
     }
     public ArrayList<Book> getBookList(){
         return bookList;
     }
     public void addBook(Book bobj){
         bookList.add(bobj);
     }
     public boolean isEmpty(){
         return bookList.isEmpty();
     }
     public int countnoofbook(String bname){
         
     }


}
