package com.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class LeftRotate {

	public static void reverse(int arr[], int s, int e) {
	    while (s < e) {
	        int temp = arr[s];
	        arr[s] = arr[e];
	        arr[e] = temp;
	        s++;
	        e--;
	    }
	}
	
	public static void reverse1(int arr[], int s, int e) {
	    while (s > e) {
	        int temp = arr[s];
	        arr[s] = arr[e];
	        arr[e] = temp;
	        s--;
	        e++;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = nums.length;
		int k = 3;
		
//		reverse(nums, 0, k-1);
//		reverse(nums,k,n-1);
//		reverse(nums,0,n-1);
		
		reverse(nums, 0, k-1);
		reverse(nums, n-1, 0);
		
		for(int i=0;i<n;i++) {
			System.out.print(nums[i]+" ");
			
		}
		

//		List<Integer> temp = new ArrayList<>();
//		for(int i=0;i<k;i++) {
//			temp.add(nums[i]);
//		}
////		Shifting
//		for(int i=k;i<n;i++) {
//			nums[i-k]=nums[i];
//		}
//		
////		Filling empty
//		for(int i=n-k;i<n;i++) {
//			nums[i]=temp.get(i-(n-k));
//		}
//		
//	
		
	}

}
