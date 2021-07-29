import java.util.Scanner;

public class Addition{

public static void main(String[] args){

Scanner add = new Scanner(System.in);

System.out.print("Enter a number:");

int number1 = add.nextInt();

System.out.print("Enter a second number:");

int number2 = add.nextInt();

int sum = number1 + number2;

System.out.printf("sum is %d%n", sum);



} 


}