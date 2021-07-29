import java.util.Scanner;

public class Volume1{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter radius");

	int radius = input.nextInt();

System.out.println("Enter the length");

	int length = input.nextInt();

	double n = Math.PI;

// n is the Math. PI

	double volume = n * radius * radius * length;

System.out.printf("%f is the volume", volume);

}

}