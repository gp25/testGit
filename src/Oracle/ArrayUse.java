package Oracle;

import java.util.Scanner;

public class ArrayUse {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void printArray(int arr[]) {
		int n = arr.length;
		System.out.print("Array is : ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// Length of longest consecutive ones by at most one swap in a Binary String
	public static int longestConsecutiveOnes(String str) {
		int n = str.length();
		int count_one = 0;
		int max_cnt = 0;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == '1') {
				count_one++;
				temp++;
			} else {
				max_cnt = Math.max(max_cnt, temp);
				temp = 0;
			}
		}
		max_cnt = Math.max(max_cnt, temp);

		int left[] = new int[n];
		int right[] = new int[n];

		if (str.charAt(0) == '1') {
			left[0] = 1;
		} else {
			left[0] = 0;
		}
		if (str.charAt(n - 1) == '1') {
			right[n - 1] = 1;
		} else {
			right[n - 1] = 0;
		}

		for (int i = 1; i < n; i++) {
			if (str.charAt(i) == '1') {
				left[i] = left[i - 1] + 1;
			} else {
				left[i] = 0;
			}
		}
		for (int i = n - 2; i >= 0; i--) {
			if (str.charAt(i) == '1') {
				right[i] = right[i + 1] + 1;
			} else {
				right[i] = 0;
			}
		}

		for (int i = 1; i < n-1; i++) {
			if (str.charAt(i) == '0') {
				int sum = left[i - 1] + right[i + 1];
				if (sum < count_one) {
					max_cnt = Math.max(max_cnt, sum + 1);
				} else {
					max_cnt = Math.max(max_cnt, sum);
				}
			}
		}
		return max_cnt;
	}
	
	//Longest subsegment of ‘1’s formed by changing at most k ‘0’s
//	public static int longestSubsegmentofOnesAtMostK(int arr[],int k) {
//		int n=arr.length;
//		int l=0;
//		int cnt0=0;
//		int max=0;
//	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String str = "111000";
		System.out.println("Longest ones in string on at most one swap : " + longestConsecutiveOnes(str));
	}

}
