package com.methods;

import java.util.Scanner;

public class Arthimatic {

	int a, b, c;
	Scanner scanner = new Scanner(System.in);

// without returntype and without parameters
	void add() {
		System.out.println("Enter A Value : ");
		a = scanner.nextInt();
		System.out.println("Enter B Value : ");
		b = scanner.nextInt();
		c = a + b;
		System.out.println("Addition is : " + c);

	}

	// without returntype and with parameters
	void sub(int x, int y) {
		a = x;
		b = y;
		c = a - b;

		System.out.println("Difference is : " + c);

	}

	int mul() {
		System.out.println("Enter A Value : ");
		a = scanner.nextInt();
		System.out.println("Enter A Value : ");
		b = scanner.nextInt();
		c = a * b;
		return c;

	}

	int div(int x, int y) {

		a = x;

		b = y;

		c = a / b;

		return c;
	}
}
