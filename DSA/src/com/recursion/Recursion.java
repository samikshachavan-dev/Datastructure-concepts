package com.recursion;

public class Recursion {

	public static int cnt=0;
	
	public static void f() {
		if(cnt==4) return;
		System.out.println(cnt);
		cnt++;
		f();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f();
	}

}
