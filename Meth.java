package com.simplilearn.method;

import java.util.Scanner;

public class Meth {
	static Scanner sc = new Scanner(System.in);
	
	public static void add() {
		System.out.println("Enter the 1st no");
		int a= sc.nextInt();
		System.out.println("Enter the 2nd no");
		int b= sc.nextInt();
		int c=a+b;
		
		System.out.println("addition of 2 numbers:" +c);
		
	}
	
	public void sub() {
		System.out.println("Enter the 1st no");
		int a= sc.nextInt();
		System.out.println("Enter the 2nd no");
		int b= sc.nextInt();
		int c=a-b;
		System.out.println("substraction of 2 numbers:"+c);
		 
	}

	public static void main(String[] args) {
		Meth m =new Meth();
		add();
		m.sub();

	}

}
