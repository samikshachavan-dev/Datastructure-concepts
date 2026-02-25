package com.recursion;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		f(0, arr, n);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private static void f(int i, int[] arr, int n) {
		if (i >= n / 2) {
			return;
		}
		swap(arr, i, n - i - 1);
		f(i + 1, arr, n);
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
