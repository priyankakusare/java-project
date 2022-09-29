package priya;

import java.util.Scanner;

public class Calc {

	public static void main(String args[]) {

		System.out.println("Calculator");
		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.println("3.Mul");
		System.out.println("4.Div");
		Scanner s = new Scanner(System.in);
		System.out.print("Please select the given option : ");
		int i = s.nextInt();
		System.out.print("Enter the first number : ");
		double a = s.nextDouble();
		System.out.print("Enter the second number : ");
		double b = s.nextDouble();

		if (i == 1) {
			System.out.println(a + b);
		}

		else if (i == 2) {
			System.out.println(a - b);
		}

		else if (i == 3) {

			System.out.println(a * b);
		}

		else if (i == 4) {

			System.out.println(a / b);

		} else {
			System.out.println("wrong input choose");
		}

	}
}