package Synoriq;

import java.util.Scanner;

public class MainUse {

	public static void printPattern(int n) {
		n=n/2;
		for (int i = 0; i < n; i++) {
//			int first=n/2;
			for (int j = 0; j < (n) - i; j++) {
				System.out.print("*");
			}
			for(int j=0;j<(2*i);j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(n)-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			for(int j=0;j<(2*(n-i-1));j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter number of lines : ");
		int n = s.nextInt();
		printPattern(n);
	}

}
