package com.recursion;

import java.util.Scanner;

public class NamesNTimes {

//	public static int n=10;
//	
//	public static void printName() {
//		if(n==0) return;
//		System.out.println("Samiksha");
//		n--;
//		printName();
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		printName();
//	}
	
	public static void f(int i,int n) {
		if(i>n) return;
		System.out.println("Samiksha");
		f(i+1, n);
	}
	public static void main(String[] args) {
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N:");
		n=sc.nextInt();
		f(1,n);
	}

}
