package commonprograms;

import java.util.Scanner;

public class Fibonacci {

	private static int a = 0;
	private static int b = 1;
	private static int sum;

	public static void main(String[] args) {

		System.out.println("Enter the limit of Fibonacci series: ");

		Scanner scan = new Scanner(System.in);
		int limit = scan.nextInt();

		System.out.print(a + " " + b + " ");
		while (true) {

			sum = a + b;

			a = b;

			b = sum;

			if (sum <= limit)
				System.out.print(sum + " ");
			else
				break;
		}
		scan.close();
	}
}
