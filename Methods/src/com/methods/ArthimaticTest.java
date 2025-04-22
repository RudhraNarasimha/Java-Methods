package com.methods;

public class ArthimaticTest {

	public static void main(String[] args) {
		Arthimatic obj = new Arthimatic();

		obj.add();

		obj.sub(40, -60);

		int mul = obj.mul();
		System.out.println("Multiplication is : " + mul);

		int div = obj.div(14, 7);
		System.out.println("Division is : " + div);
	}

}
