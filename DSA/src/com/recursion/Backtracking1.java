package com.recursion;

import java.util.Scanner;

public class Backtracking1 {

	private static void f(int i, int n) {
		if(i>n) return;
		
		f(i+1,n);
		System.out.println(i);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N");
		int n=sc.nextInt();
		f(1,n);
	}


}
