package com.poly;

public class MainMethodOverLoading {
	static void show() {
		System.out.println("show");
		show();
	}

	public static void main(String[] args) {
		show();

	}

}