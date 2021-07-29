import java.util.Scanner;

	public class Conversion{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a degree in Celsius");

			int celsius = input.nextInt();


			double fahrenheit  = (9.0 / 5) * celsius + 32;


	System.out.printf("%d celsius is %f fahrenheit", celsius,  fahrenheit);

}

}