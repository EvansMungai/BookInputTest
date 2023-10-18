package classs;
import java.util.Scanner;

public class BookInputTest {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Book myBook=new Book();
		System.out.print("Please enter the title of the book\n");
		myBook.title=in.nextLine();
		
		System.out.print("Please enter the author name\n"+myBook.author);
		myBook.author=in.nextLine();
		
		System.out.print("Please enter the number of pages\n"+myBook.numberOfPages);
		myBook.numberOfPages=in.nextInt();
		System.out.println("The book title is:"+myBook.title);
		System.out.println("The book author is:"+myBook.author);
		System.out.println("The book has "+myBook.numberOfPages+ "pages");
		
		in.close();

	}

}
