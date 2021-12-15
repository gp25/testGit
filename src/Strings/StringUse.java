package Strings;

import java.util.Scanner;

public class StringUse {
	
	public static String takeInput() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String : ");
		String str=s.nextLine();
		return str;
	}
	
	public static void printString(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
	
	public static String reverseString(String str) {
//		int i=0;
		int j=str.length()-1;
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str=takeInput();
		printString(str);
		String str1=reverseString(str);
		printString(str1);
		

	}

}
