package SirionLabs;

import java.util.*;

public class ArraysUse {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void print(int arr[]) {
		int n = arr.length;
		System.out.println("Array is : ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// Trapping Rain Water
	// TC : O(n^2)... SC : O(1)
	public static int trappingRainWater(int arr[]) {
		int n = arr.length;
		int leftMax = 0;
		int rightMax = 0;
		int res = 0;
		for (int i = 0; i < n - 1; i++) {
			leftMax = leftMax(arr, 0, i);
			rightMax = rightMax(arr, i + 1, n - 1);
			int diff = Math.min(leftMax, rightMax) - arr[i];
			if (diff < 0) {
				res += 0;
			} else {
				res += diff;
			}
		}
		return res;
	}

	public static int leftMax(int arr[], int l, int h) {
		int max = 0;
		if (l == h) {
			return arr[l];
		}
		while (l < h) {
			if (arr[l] >= arr[h]) {
				if (arr[l] > max) {
					max = arr[l];
				}
				l++;
			} else {
				if (arr[l] < arr[h]) {
					if (arr[h] > max) {
						max = arr[h];
					}
					h--;
				}
			}
		}
		return max;
	}

	public static int rightMax(int arr[], int l, int h) {
		int max = 0;
		if (l == h) {
			return arr[l];
		}
		while (l < h) {
			if (arr[l] >= arr[h]) {
				if (arr[l] > max) {
					max = arr[l];
				}
				l++;
			} else {
				if (arr[l] < arr[h]) {
					if (arr[h] > max) {
						max = arr[h];
					}
					h--;
				}
			}
		}
		return max;
	}

	// Trapping Rain Water Method 2
	// Using 2 arrays
	// TC : O(n)+O(n)+O(n) = O(n).... SC : O(2n)
	public static int trappingRainWaterMethod2(int arr[]) {
		int n = arr.length;
		int pre[] = new int[n];
		int suff[] = new int[n];
		int preMax = Integer.MIN_VALUE;
		int suffMax = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] > preMax) {
				preMax = arr[i];
			}
			pre[i] = preMax;
		}
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] > suffMax) {
				suffMax = arr[i];
			}
			suff[i] = suffMax;
		}
		int res = 0;
		for (int i = 0; i < n; i++) {
			int diff = Math.min(pre[i], suff[i]) - arr[i];
			if (diff < 0) {
				res += 0;
			} else {
				res += diff;
			}
		}
		return res;
	}

	// Trapping Rain Water Method 3
	// Using two pointers
//	public static int trappingRainWaterUsingTwoPointer(int arr[]) {
//		int n=arr.length;
//		int i=0;
//		int j=n-1;
//		int leftMax=Integer.MIN_VALUE;
//		int rightMax=Integer.MIN_VALUE;
//		while(i<=j) {
//			if(arr[i]<arr[j]) {
//				
//			}
//		}
//	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int arr[] = takeInput();
		print(arr);

//		System.out.println("Trapping Rain Water : " + trappingRainWater(arr));

		System.out.println("Trapping Rain Water Method 2 : " + trappingRainWaterMethod2(arr));
	}

}
