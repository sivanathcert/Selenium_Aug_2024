package week1.day2;

public class StudentGrades {

	public static void main(String[] args) {
	int marks=45;
		
		if(marks<20)
		{
			System.out.println("Student grade is C");
		}else if(marks<40) {
			System.out.println("Student grade is B");
		}
		else if(marks<50){
			System.out.println("Student grade is A");
		}
		else {
			System.out.println("Student grade is O");
		}
	}
}


