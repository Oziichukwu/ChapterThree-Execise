import java.util.Scanner;

public class MySecondLineOfCode{

   public static void main(String[] args){

	Scanner InputCollector = new Scanner(System.in);
	System.out.println ("Enter a Number");
	
	int firstNumber = InputCollector.nextInt();

	System.out.println("Enter Second Number");

	int secondNumber = InputCollector.nextInt();

	System.out.printf("The sum of the firstNumber%d and secondNumber%d is firstNumber + secondNumber%d%n");

}


}