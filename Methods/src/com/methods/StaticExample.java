package com.methods;

public class StaticExample {

	static int x;

	static {
		System.out.println("This is Block 3");

	}

	static {

		System.out.println("This is Block 2 to display x");

		System.out.println(x);
	}

	static {
		System.out.println("This is block 1 to Initialize x value");
		x = 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is main()");
	}

}
