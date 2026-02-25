package com.recursion;

import java.util.Scanner;

public class SumofN {

//	public static void f(int i, int sum) {
//		if(i<1) {
//			System.out.println(sum);
//			return;
//		}
//		f(i-1,sum+i);
//	}
//	Parameterized-No Backtracking involved

//	public static int f(int n) {
//		if(n==0) {
//			return 0;
//		}
//		return n+f(n-1);
//	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N:");
		int n=sc.nextInt();
		System.out.println("Factorial "+fact(n));
	}

private static int fact(int n) {
	if(n==0) {
		return 1;
	}
	return n*fact(n-1);
}

	}


