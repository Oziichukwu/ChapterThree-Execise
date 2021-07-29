import java.util.Scanner;

public class Area{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter the radius");

	int radius = input.nextInt();


	double PI  = Math.PI;


	double area  = PI * radius * radius;



System.out.printf("The area is %f", area);

}

}