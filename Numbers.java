import java.util.Scanner;

public class Numbers{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

	int num1;

	int num2;

	int num3;

	int num4;

	int num5;

	int negNo = 0;

	int posNo = 0;

	int zero = 0;


System.out.print("Enter first number:");

	num1 = input.nextInt();

System.out.print("Enter second number:");

	num2 = input.nextInt();

System.out.print("Enter third number:");

	num3 = input.nextInt();

System.out.print("Enter fourth number:");

	num4 = input.nextInt();


System.out.print("Enter fifth number:");

	num5 = input.nextInt();


		if ( num1 < negNo )

			negNo = negNo + 1;

		if (num2 < negNo )

			negNo = negNo + 1;


		if (num3 < negNo )

			negNo = negNo + 1;

		if (num4 < negNo )

			negNo = negNo + 1;

		if (num5 < negNo )

			negNo = negNo + 1;

				if (num1 > posNo )

					posNo = posNo + 1;

				if (num2 > posNo )

					posNo = posNo + 1;

				if (num3 > posNo )

					posNo = posNo + 1;

				if (num4 > posNo )

					posNo = posNo + 1;

				if (num5 > posNo )

					posNo = posNo + 1;

		if (num1 == zero )

			zero = zero + 1;

		if (num2 == zero )

			zero = zero + 1;

		if (num3 == zero )

			zero = zero + 1;

		if (num4 == zero )

			zero = zero + 1;

		if (num5 == zero )

			zero = zero + 1;


System.out.printf("%d Negative numbers", negNo);

System.out.printf("%d Positive numbers", posNo);

System.out.printf("%d Zero numbers", zero);

}


}