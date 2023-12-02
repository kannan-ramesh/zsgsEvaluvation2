package com.kannanrameshrk;

import java.util.Arrays;
import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Array elements:");
		
		for(int i=0;i<n;i++) {
			arr[i] = input.nextInt();
		}
		
		SubArray sub=new SubArray();
		System.out.println(Arrays.toString(arr));
		sub.subArray(arr);
	}

	private void subArray(int[] arr) {
		int sum=Integer.MIN_VALUE;
		int start=0;
		int end=0;
		
		for(int i=0;i<arr.length;i++) {
			int maxSum=0;
			for(int j=i;j<arr.length;j++) {
				maxSum+=arr[j];
				if(maxSum>sum) {
					sum=maxSum;
					start=i;
					end=j;
				}
			}
		}
		System.out.print("{");
		for(int i=start;i<=end;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println("}");
	}
}
