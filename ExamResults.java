import java.util.Scanner;

public class ExamResults{

	public static void main(String[] args){


		Scanner input = new Scanner(System.in);


			int passes = 0;

			int failures = 0;

			int studentCounter = 1;


		while ( studentCounter <= 10) {

			System.out.print("Enter the results.. 1 for pass and 2 for fail:");

			int result = input.nextInt();
			


				if ( result == 1) 

					passes = passes + 1; 
		

				else

					failures = failures + 1;



				studentCounter = studentCounter + 1;
}

				System.out.printf(" Passed: %d  failed: %d%n", passes, failures);


				if ( passes > 8)

					System.out.println(" Bonus to instructor");

		}	

}