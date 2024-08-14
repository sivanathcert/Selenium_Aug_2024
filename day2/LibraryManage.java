package week1.day2;

public class LibraryManage {

	public static void main(String[] args) {
		Library libman = new Library();
		System.out.println(libman.addBook("Book Name: Wings of Fire"));
		libman.issueBook();
		
	}
}
