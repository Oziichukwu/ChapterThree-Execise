import java.util.Scanner;

public class AverageSen{

	public static void main(String[] args){


		int total = 0;

		int gradeCounter = 1;

		//int grade = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a grade or -1 to exit:");

		int grade = input.nextInt();


		while ( grade > 0){

		System.out.print("Enter a grade or -1 to exit:");

			grade  = input.nextInt();
	
		total = total + grade;

		gradeCounter++;


		if ( grade == 0){

		System.out.print(" Kindly enter a grade");   }

	}



	
			

			int average = total / gradeCounter;

		System.out.printf("Total is %d%n", total);

		System.out.printf("Average is %d", average);


	}


}