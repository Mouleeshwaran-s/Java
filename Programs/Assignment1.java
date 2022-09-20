package com.demo.calculator;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "MoUleesHwARaN";//sc.next();
		System.out.println(str+"\n");
		
		System.out.println(reverseString(str));
		System.out.println(lowerString(str));
		System.out.println(lowerCaseString(str));
	}

	private static String lowerCaseString(String str) {
		// TODO Auto-generated method stub
		String str1="";
		char chArr[]=str.toCharArray();
		Boolean booArr[]=new Boolean[str.length()];
		for (int i = 0; i < chArr.length; i++) {
			if((int)chArr[i]<97) {
				booArr[i]=true;
			}else {
				booArr[i]=false;
			}
		}
		for (int i = 0; i < chArr.length; i++) {
			if((int)chArr[i]<97) {
				chArr[i]=(char)((int)chArr[i]+32);
			}
		}
		for (int i = chArr.length-1; i >=0; i--) {
			str1+=chArr[i];
		}
		char chArr1[]=str1.toCharArray();
		for (int i = 0; i < booArr.length; i++) {
			if(booArr[i]) {
				chArr1[i]=(char)((int)chArr1[i]-32);
			}
		}
		String str2="";
		for (int i = 0; i < chArr1.length; i++) {
			str2+=chArr1[i];
		}
		return str2;
	}

	private static String lowerString(String str) {
		// TODO Auto-generated method stub
		String str1="";
		char chArr[]=str.toCharArray();
		for (int i = 0; i < chArr.length; i++) {
			if((int)chArr[i]<97) {
				chArr[i]=(char)((int)chArr[i]+32);
			}
		}
		for (int i = 0; i < chArr.length; i++) {
			str1+=chArr[i];
		}
		return str1;
	}

	private static String reverseString(String str) {
		// TODO Auto-generated method stub
		String str1="";
		char chArr[]=str.toCharArray();
		for (int i = chArr.length-1; i >=0; i--) {
			str1+=chArr[i];
		}
		return str1;
	}
}
