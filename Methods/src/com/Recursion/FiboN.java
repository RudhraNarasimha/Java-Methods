package com.Recursion;

public class FiboN {

	public static void printFibo(int positions) {
		int first = 0;
		int second = 1;

		for (int i = 0; i < positions; i++) {
 
			System.out.print(first + " ");
			int next = first + second;
			first = second;
			second = next;

		}
	}

	public static int fiboWithRecursion(int number) {

		if (number == 0 || number == 1) {

			return number;

		}

		else {
			return fiboWithRecursion(number - 2) + fiboWithRecursion(number - 1);
		}
	}

}
