package Synoriq;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {

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

	public static int problem(int arr[]) {
		int count = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count % 2 != 0) {
				return arr[i];
			}
		}
		return 0;
	}

	public static int problemOpt(int arr[]) {
		int count = 0;
		int n = arr.length;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			int key = (int) e.getKey();
			int val = (int) e.getValue();
			if ((val % 2) != 0) {
				return key;
			}
		}
		return 0;
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

//		int arr[] = takeInput();
//		print(arr);

//		System.out.println("Unpaired element is : " + problem(arr));
//		System.out.println("Unpaired element is : "+ problemOpt(arr));

		System.out.println("Enter number of rows : ");
		int n = s.nextInt();
		pattern(n);

	}

}
