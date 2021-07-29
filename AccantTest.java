import java.util.Scanner;

public class AccantTest{

public static void main(String[] args){

			Scanner input = new Scanner(System.in);
	
	Accant myAccant = new Accant();

		System.out.print(" Enter your name:");


		String name = input.nextLine();

					
		myAccant.setName( name );

		System.out.printf(" The account name is: %n%s%n", myAccant.getName());




}


 }