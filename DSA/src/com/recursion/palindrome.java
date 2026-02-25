package com.recursion;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="MADAM";
		int n=str.length();
		System.out.println(f(0,str,n));
	}

	private static boolean f(int i, String str, int n) {
		if(i>=n/2) {
			return true;
		}
		if(str.charAt(i)!=str.charAt(n-i-1)) {
			return false;
		}
		
		return f(i+1,str,n);
	}

}
