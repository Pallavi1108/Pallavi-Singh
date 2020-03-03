package cts.number.modification;

import java.util.Scanner;

public class Diff {

	public static void main(String[] args) {

		System.out.println("Enter a number :");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		sc.close();

		Diff df = new Diff();

		df.Display(num);

	}

	public void Display(int num)

	{

		int temp, sum = 0, digit;

		digit = num % 10;

		while (num > 0)

		{

			temp = num % 10;

			sum = temp - sum;

			num /= 10;

		}

		if (sum < 0)

		{

			System.out.println(-sum + "" + digit);

		}

		else

		{

			System.out.println(sum + "" + digit);

		}

	}
}
