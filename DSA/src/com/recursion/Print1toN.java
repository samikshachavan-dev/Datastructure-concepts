package com.recursion;

import java.util.Scanner;

public class Print1toN {

	public static void f(int i, int n) {
		if(i>n) return;
		System.out.println(i);
		f(i+1,n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N:");
		n=sc.nextInt();
		f(1,n);
	}

}
