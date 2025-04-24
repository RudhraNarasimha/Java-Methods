package com.poly;

public class MethodOverLoading {

	void add() {

		System.out.println("add Without any Parameters");
	}

	void add(int a, int b) {
		System.out.println("Add With Two int Parameter");
	}

	void add(float a, float b) {

		System.out.println("Add With Two Float Parameter");
	}

	void add(float a, int b) {

		System.out.println("Add With one Float, int Parameters");
	}

	void add(int a, float b) {

		System.out.println("Add With one int, and float Parameters");
	}

	public static void main(String[] args) {

		MethodOverLoading obj = new MethodOverLoading();

		obj.add();
		obj.add(29.90f, 56.65f);
		obj.add(21.78f, 56);
		obj.add(37, 90.52f);
		obj.add(10, 20);

	}

}
