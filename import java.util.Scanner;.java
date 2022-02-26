import java.util.Scanner;

public class Students {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println( "Enter your name" );
		String name = sc.nextLine();
		System.out.println("Enter your Rollno");
		int Rollno = sc.nextInt();
		System.out.println("Enter your marks");
		float marks = sc.nextFloat();
		if (marks < 0) {
			System.out.println(0.00);
		}else {
			System.out.println(marks);
	}
		
		double riseinMarks = (double)marks * 10 / 100;
		double finalMarks = (double)marks + (double)riseinMarks;
		
		System.out.println("Enter your attendance");
		float attendance = sc.nextFloat();
		 if (attendance > 75 && finalMarks > 100) {
				System.out.println(100);
			}else if (attendance > 75 && finalMarks < 100){
				System.out.println(finalMarks);		
			}else {
				System.out.println(marks);
			}
	}

}
	
