package com.kannanrameshrk;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n=input.nextInt();
		int[][] arr=new int[n][n];
		System.out.println("enter values:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=input.nextInt();
			}
			System.out.println();
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.printf("%2d",arr[i][j]);
			}
			System.out.println();
		}
		Matrix mat=new Matrix();
		mat.matrix(arr);

	}

	private void matrix(int[][] arr) {
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i;j<arr.length;j++) {
//				int temp=arr[i][j];
//				arr[i][j]=arr[j][i];
//				arr[j][i]=temp;
//			}
//		}
		
		System.out.println("transpost matrix:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.printf("%2d",arr[j][i]);
			}
			System.out.println();
		}
	}

}
