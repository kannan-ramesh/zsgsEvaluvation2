package com.kannanrameshrk;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter String");
		String str=input.next();
		System.out.println("Enter col:");
		int col=input.nextInt();
		int row=str.length()/col;
		char[][] arr =new char[row][col];
		
		System.out.println("ENter sub string:");
		String sub=input.next();
		
		pattern(arr,str,row,col,sub);

	}

	private static void pattern(char[][] arr, String str,int row,int col,String sub) {
	int k=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=str.charAt(k++);
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		k=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(arr[i][j]==sub.charAt(k)) {
					
				}
			}
		}
		
	}

}
