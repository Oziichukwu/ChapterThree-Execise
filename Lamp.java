import java.util.Scanner;

public class Lamp{

    public static void main(String[] args){

	Scanner MysteryNumber = new Scanner(System.in);

	System.out.print("Guess a Number\n");

	int guess = MysteryNumber.nextInt();
	


		if (guess > 100)

		  System.out.println("Number is High\nTry again");



		if (guess < 100)

		  System.out.println("Guess is too low\nTry One more Time");



		if (guess == 100)

		  System.out.println("Absolutely Correct");

}

}
