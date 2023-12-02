package com.kannanrameshrk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FrequencyString {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String str=input.nextLine();
		
		frequency(str);
	}
	private static void frequency(String str) {
		List<String> arr =new ArrayList<>();
		String s="";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				arr.add(s);
				s="";
			}else {
				s+=str.charAt(i);
			}
		}
		print(arr);
	}
	private static void print(List<String> arr) {
		List<String> ans = new ArrayList<>();
		int count=1;
		for(int i=0;i<arr.size();i++) {
			for(int j=i+1;j<arr.size()-1;j++) {
				if(arr.get(i).equals(arr.get(j))) {
					count++;
					arr.set(j,"");
				}
			}
			ans.add(arr.get(i)+"-"+count);
			count=1;
		}
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i)+",");
		}
	}
}
