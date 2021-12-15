package Synoriq;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pattern {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void print(int arr[]) {
		System.out.println("Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void pattern(int n) {
		int odd = 1;
		for (int i = 1; i <= n; i++) {
			if (odd > 9) {
				odd = 1;
			}
			for (int j = 0; j < n; j++) {
				if (i == 1 || i == n) {
					System.out.print(odd + "");
				} else {
					if (j == 0 || j == n - 1) {
						System.out.print(odd + "");
					} else {
						System.out.print(" ");
					}
				}
			}
			odd += 2;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("Enter number of rows : ");
		int n = s.nextInt();
		pattern(n);

	}

}
