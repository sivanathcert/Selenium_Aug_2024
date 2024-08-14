package week1.day2;

public class Library {
	
	public String addBook(String bookTitle) {
		System.out.println("Book added Successfully");
		return bookTitle;
	}
	public void issueBook() {
		System.out.println("\nBook issued Successfully");
	}
	public static void main(String[] args) {
		//creating object
				Library lib = new Library();
			
				// Calling issueaddBook method
				String bookName = lib.addBook("Book Name: Wings of Fire");
				System.out.println(bookName);
				// System.out.println(lib.addBook("Wings of Fire"));
			
				// Calling issueBook method
				lib.issueBook();

	}

}
