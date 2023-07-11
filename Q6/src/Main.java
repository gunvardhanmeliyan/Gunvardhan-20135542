import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        Library lib=new Library();
        int i,ch;
        for(i=0;i<10;i++){
            System.out.println("1.Add the Book");
            System.out.println("2.Display all the book details");
            System.out.println("3.Search Book by the name of the author");
            System.out.println("4.Count number of books - by using the book name");
            System.out.println("5.Exit/Quit");
            System.out.println("Enter your choice (operation you want to perform):");
            ch=s.nextInt();s.nextLine();
            if(ch==1){
                Book b=new Book();
                System.out.println("Enter the isbn no:");
                b.setIsbnno(s.nextInt());s.nextLine();
                System.out.println("Enter the book name:");
                b.setBookname(s.nextLine());
                System.out.println("Enter the author name:");
                b.setAuthor(s.nextLine());
                lib.addBook(b);
            }
            if(ch==2){
                ArrayList<Book> result=lib.viewAllBooks();
                if(result.isEmpty())
                {
                    System.out.println("The list is empty");
                    continue;
                }
                Iterator i=result.iterator();
                while(i.hasNext())
                {
                    Book b=(Book)i.next();
                    System.out.println("Isbn No: "+b.getIsbnno());
                    System.out.println("Book name:"+b.getBookname());
                    System.out.println("Author name: "+b.getAuthor());
                }
            }
            if(ch==3){
                System.out.println("Enter the author name:");
                
                String name=s.nextLine();
                ArrayList<Book> result=lib.viewBooksByAuthor(name);
                if(result.isEmpty()){
                    System.out.println("None of the book published by the author "+name);
                    continue;
                }
                Iterator i=result.iterator();
                while(i.hasNext()){
                    
                    Book b=(Book)i.next();
                    System.out.println("Isbn no: "+b.getIsbnno());
                    System.out.println("Book name: "+b.getBookname());
                    System.out.println("Author name: "+b.getAuthor());
                }
            }
            if(ch==4){
                System.out.println("Enter the book name");
                String name=s.nextLine();
                System.out.println("Count is "+lib.countnoofbook(name));
            }
            if(ch==5)
            System.exit(0);
        }

	}

}
