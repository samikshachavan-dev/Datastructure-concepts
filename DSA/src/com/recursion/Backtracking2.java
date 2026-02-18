package com.recursion;

import java.util.Scanner;

public class Backtracking2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1-N
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N:");
		int n=sc.nextInt();
		
		f(n,n);
		
		

	}

	private static void f(int i, int n) {
		if(i<1) return;
		f(i-1,n);
		System.out.println(i);
	}

}
