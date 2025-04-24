package com.Recursion;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int i = scanner.nextInt();
		
		int fact = Factorial.getFactorial(i);
		System.out.println("Factorial is " + fact);

	}

}
