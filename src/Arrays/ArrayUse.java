package Arrays;

import java.util.Arrays;
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
		System.out.println("Elements are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int linearSearch(int arr[], int x) {
		for (int i = 0; i < arr.length; i++) {
			if (x == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {// for pass
			for (int j = 0; j < n - i - 1; j++) {// for sort
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void mergeSort(int arr[], int l, int r) {
		if (l >= r) {
			return;
		}
		int mid = (l + r) / 2;
		mergeSort(arr, l, mid);
		mergeSort(arr, mid + 1, r);
		merge(arr, l, mid, r);

	}

	private static void merge(int[] arr, int l, int mid, int r) {
		int n1 = mid - l + 1;
		int n2 = r - mid;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i) {
			L[i] = arr[l + i];
		}
		for (int j = 0; j < n2; ++j) {
			R[j] = arr[mid + 1 + j];
		}

		int i = 0;
		int j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
	}

	public static void mergeSort1(int arr[], int l, int r) {
		if (l >= r) {
			return;
		}
		int m = (l + r) / 2;
		mergeSort1(arr, l, m);
		mergeSort1(arr, m + 1, r);
		merge1(arr, l, m, r);
	}

	public static void merge1(int arr[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = arr[l + i];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = arr[m + 1 + j];
		}

		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
				k++;
			} else {
				arr[k] = R[j];
				j++;
				k++;
			}
		}

		while (i < n1) {
			arr[k] = L[i];
			k++;
			i++;
		}
		while (j < n2) {
			arr[k] = R[j];
			k++;
			j++;
		}
	}

	public static int binarySearch(int arr[], int l, int r, int x) {
		mergeSort(arr, 0, r);

		if (l <= r) {
			int mid = (l + r) / 2;

			if (arr[mid] == x) {
				return mid;
			}

			if (arr[mid] > x) {
				return binarySearch(arr, l, mid - 1, x);
			} else {
				return binarySearch(arr, mid + 1, r, x);
			}
		}

		return -1;
	}

	public static int[] insertionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > x) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = x;
		}
		return arr;
	}

	public static int[] selectionSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int minInd = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[minInd] > arr[j]) {
					minInd = j;
				}
			}
			int temp = arr[minInd];
			arr[minInd] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

	public static int[] reverseArray(int arr[]) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return arr;
	}

	public static void decimalToBinary(int n) {
		int res[] = new int[10];
		int k = 0;
		while (n > 0) {
			res[k] = n % 2;
			n = n / 2;
			k++;
		}
		for (int i = k - 1; i >= 0; i--) {
			System.out.print(res[i]);
		}
		System.out.println();
	}

	// GFG find indexes of subarray whose elements sum is x
	public static void subArraySum(int arr[], int x) {
		int n = arr.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = arr[i];
			for (int j = i + 1; j < n; j++) {
				if (sum == x) {
					System.out.println((i + 1) + " " + j);
					return;
				}
				if (sum > x || j == n) {
					break;
				}
				sum = sum + arr[j];
			}
		}
		System.out.println("No sub array is present : ");
		return;
	}

	// Method 2 for subarray whose elements sum is x..
	public static void subArraySum1(int arr[], int x) {
		int n = arr.length;
		int sum = arr[0];
		int start = 0;
		for (int i = 1; i < n; i++) {

			while (sum > x && start < i - 1) {
				sum = sum - arr[start];
				start++;
			}
			if (sum == x) {
				System.out.println(start + 1 + " " + i);
			}
			if (i < n) {
				sum = sum + arr[i];
			}
		}
	}

	// GFG find triplets such that sum of two elements equals the third element..
	public static int countTriplets(int arr[]) {
		int n = arr.length;
		mergeSort(arr, 0, n - 1);
		int count = 0;
		for (int i = n - 1; i >= 0; i--) {
			int j = 0;
			int k = i - 1;
			while (j < k) {
				if (arr[j] + arr[k] == arr[i]) {
					count++;
				}
				if (arr[j] + arr[k] < arr[i]) {
					j++;
				} else {
					k--;
				}
			}
		}
		return count;
	}

	// GFG Kadane's Algorithm..find the contiguous sub array with maximum sum.
	public static int maxSubarraySum(int arr[]) {
		int n = arr.length;
		int max_so_far = Integer.MIN_VALUE;
		int max_ending_here = 0;
		for (int i = 0; i < n; i++) {
			max_ending_here = max_ending_here + arr[i];
			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}
			if (max_ending_here < 0) {
				max_ending_here = 0;
			}
		}
		return max_so_far;

	}

	public static int maximumSum(int arr[]) {
		int n = arr.length;
		int small = Integer.MIN_VALUE;
		int max = 0;
		for (int i = 0; i < n; i++) {
			max = max + arr[i];
			if (small < max) {
				small = max;
			}
			if (max < 0) {
				max = 0;
			}
		}
		return small;
	}

	public static int missingElementInArray(int arr[]) {
		int n = arr.length;
		int sum = ((n + 1) * (n + 2)) / 2;
		int arraySum = 0;
		for (int i = 0; i < n; i++) {
			sum -= arr[i];
		}
		return sum;
	}

	public static int missingElementInArray1(int arr[]) {
		int a = arr[0];
		int b = 1;
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			a = a ^ arr[i];
		}
		for (int i = 2; i <= n + 1; i++) {
			b = b ^ i;
		}
		return (a ^ b);
	}

	public static int[] mergeTwoSortedArrays(int arr1[], int arr2[]) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		// mergeSort(arr1, 0, n1);
		// mergeSort(arr2, 0, n2);
		int result[] = new int[n1 + n2];
		int i = 0, j = 0;
		int k = 0;
		while (i < n1 && i < n2) {
			if (arr1[i] < arr2[j]) {
				result[k] = arr1[i];
				i++;
				k++;
			} else {
				if (arr1[i] > arr2[j]) {
					result[k] = arr2[j];
					j++;
					k++;
				}
			}
			if (i == n1) {
				while (j < n2) {
					result[k] = arr2[j];
					j++;
					k++;
				}
			} else {
				if (j == n2) {
					while (i < n1) {
						result[k] = arr1[i];
						i++;
						k++;
					}
				}
			}
		}
		return result;

	}

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	public static void mergeTwoArraysWithoutExtraSpace(int arr1[], int arr2[]) {
		int n = arr1.length;
		int m = arr2.length;
		for (int i = 0; i < n; i++) {
			if (arr1[i] > arr2[0]) {
				int temp = arr1[i];
				arr1[i] = arr2[0];
				arr2[0] = temp;
			}
			int firstElementOfArr2 = arr2[0];
			int k;
			for (k = 1; k < m && arr2[k] < firstElementOfArr2; k++) {
				arr2[k - 1] = arr2[k];
			}
			arr2[k - 1] = firstElementOfArr2;
		}
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int j : arr2) {
			System.out.print(j + " ");
		}

	}

	public static void rearrange(int arr[]) {
		int n = arr.length;
		int i;
		int j = 0;
		while (j < n) {
			int large = arr[n - 1];
			for (i = n - 2; i >= j; i--) {
				arr[i + 1] = arr[i];

			}
			arr[i + 1] = large;
			j = j + 2;
			printArray(arr);
		}
	}

	public static void rearrangeMethod2(int arr[]) {
		int n = arr.length;
		int temp[] = new int[n];
		int p = 0;
		int q = n - 1;
		for (int i = 0; i < n;) {
			temp[i] = arr[q];
			q--;
			i++;

			temp[i] = arr[p];
			p++;
			i++;
		}
		printArray(temp);
	}

	public static void rearrangeMethod3(int arr[]) {
		int n = arr.length;
		int min = 0;
		int max = n - 1;
		int maxElement = arr[max] + 1;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				arr[i] += (arr[max] % maxElement) * maxElement;
				max--;
			} else {
				arr[i] += (arr[min] % maxElement) * maxElement;
				min++;
			}
		}
		for (int i = 0; i < n; i++) {
			arr[i] = arr[i] / maxElement;
		}
		printArray(arr);
	}

	public static void reverseArray1(int arr[]) {
		int n = arr.length;
		int i = 0;
		int j = n - 1;
		while (i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		for (int k : arr) {
			System.out.print(k + " ");
		}
		System.out.println();
	}

	// Given two arrays X and Y of positive integers, find the number of pairs such
	// that xy > yx (raised to power of) where x is an element from X and y is an
	// element from Y.
	public static int numberOfPairs(int arr1[], int arr2[]) {
		int n = arr1.length;
		int m = arr2.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (Math.pow(arr1[i], arr2[j]) > Math.pow(arr2[j], arr1[i])) {
					count++;
				}
			}
		}
		return count;
	}

	// Important Do again..........................................................
	public static int numberOfPairsMethod2(int x[], int y[]) {
		int n = x.length;
		int m = y.length;
		int count = 0;
		int numberInYLessThanFive[] = new int[5];
		for (int i = 0; i < m; i++) {
			if (y[i] < 5) {
				numberInYLessThanFive[y[i]]++;
			}
		}
		Arrays.sort(y);
		for (int i = 0; i < n; i++) {
			count += countPairs(x[i], y, m, numberInYLessThanFive);
		}
		return count;

	}

	public static int countPairs(int x, int y[], int m, int NoInY[]) {
		if (x == 0) {
			return 0;
		}
		if (x == 1) {
			return NoInY[0];
		}

		int idx = Arrays.binarySearch(y, x);
		int count;
		if (idx < 0) {
			idx = Math.abs(idx + 1);
			count = y.length - idx;
		} else {
			while (idx < m && y[idx] == x) {
				idx++;
			}
			count = y.length - idx;
		}
		count += (NoInY[0] + NoInY[1]);
		if (x == 2) {
			count -= (NoInY[3] + NoInY[4]);
		}
		if (x == 3) {
			count += (NoInY[2]);
		}
		return count;
	}

	// GFG INVERSION OF ARRAY.............TC: O(n^2)
	public static int inversionOfArray(int arr[]) {
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					count++;
				}
			}
		}
		return count;
	}

	// inversionOfArray Method2...........TC: O(nlogn)....
	public static int inversionOfArrayMergeSort(int arr[], int l, int r) {

		int count = 0;
		if (l < r) {
			int mid = (l + r) / 2;
			count += inversionOfArrayMergeSort(arr, 0, mid);
			count += inversionOfArrayMergeSort(arr, mid + 1, r);
			count += inversionOfArrayMerge(arr, l, mid, r);
		}
		return count;
	}

	public static int inversionOfArrayMerge(int arr[], int l, int mid, int r) {
		int left[] = Arrays.copyOfRange(arr, l, mid + 1);
		int right[] = Arrays.copyOfRange(arr, mid + 1, r + 1);
		int i = 0;
		int j = 0;
		int count = 0;
		int k = l;
		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
				count += (mid + 1) - (l + i);
			}
		}
		return count;
	}

	// Sort 0's and 1's.....................
	public static int[] sortZeroesOnes(int arr[]) {
		int n = arr.length;
		int i = 0;
		int j = n - 1;
		while (i <= j) {
			if (arr[i] == 0) {
				i++;
			} else {
				if (arr[j] == 1) {
					j--;
				} else {
					arr[i] = 0;
					arr[j] = 1;
					i++;
					j--;
				}
			}
		}
		return arr;
	}

	public static int[] sortZeroesOnesTwos(int arr[]) {
		int n = arr.length;
		int i = 0;
		int k = 0;
		int j = n - 1;
		while (k < j) {
			if (arr[i] == 0) {
				i++;
				k++;
			} else {
				if (arr[k] == 1) {
					k++;
				} else {
					if (arr[j] == 2) {
						j--;
					}
				}
			}

			if (arr[j] == 0) {
				arr[j] = 2;
				arr[i] = 0;
				i++;
				k++;
				j--;
			} else {
				if (arr[j] == 1) {
					arr[j] = 2;
					arr[k] = 1;
					j--;
					k++;
				}
			}
		}
		return arr;
	}

	public static int[] sortZeroesOnesTwosMethod2(int arr[]) {
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		while (mid <= high) {
			if (arr[mid] == 0) {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
			} else {
				if (arr[mid] == 1) {
					mid++;
				} else {
					if (arr[mid] == 2) {
						int temp = arr[mid];
						arr[mid] = arr[high];
						arr[high] = temp;
						high--;
					}
				}
			}
		}
		return arr;
	}

	// Max Consecutive Ones.. leetcode
	public static int maxConsecutiveOnes(int arr[]) {
		int n = arr.length;
		int count = Integer.MIN_VALUE;
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 1) {
				count++;
			}
			if (arr[i] == 0) {
				count = 0;
			}
			if (max < count) {
				max = count;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int arr[] = takeInput();
		printArray(arr);
		// System.out.println("Array's length : "+ arr.length);
		// System.out.println("Enter element for linear search : ");
		// int x = s.nextInt();
		// int i = linearSearch(arr, x);
		// System.out.println("Element " + x + " present at " + i + " position. ");
		// System.out.println("Bubble Sort : ");
		// bubbleSort(arr);
		// System.out.println("Merge Sort : ");
		// mergeSort1(arr, 0, arr.length-1);
		// for(int i=0;i<arr.length;i++) {
		// System.out.print(arr[i]+" ");
		// }
		// System.out.println();
		// System.out.println("Enter an element : ");
		// int x = s.nextInt();
		// int pos=binarySearch(arr, 0, arr.length-1, x);
		// if (pos == -1) {
		// System.out.println("Element is not present.. :( ");
		// }else {
		// System.out.println("Binary Search : " + binarySearch(arr, 0, arr.length - 1,
		// x));
		// }
		// printArray(insertionSort(arr));
		// printArray(selectionSort(arr));
		// printArray(reverseArray(arr));
		// System.out.println("Enter a decimal number : ");
		// int n=s.nextInt();
		// decimalToBinary(n);
		// System.out.println("Enter a number : ");
		// int x = s.nextInt();
		// subArraySum(arr, x);
		// subArraySum1(arr, x);
		// System.out.println("Number of triplets are : " + countTriplets(arr));
		// System.out.println("Number of triplets are : " + countTripletsAgain(arr));
		// System.out.println("Maximum sum of array : "+ maxSubarraySum(arr));
		// System.out.println("Maximum : "+ maximumSum(arr));
		// System.out.println(Integer.MIN_VALUE);
		// System.out.println("Missing Element : "+ missingElementInArray1(arr));
		// int arr1[] = takeInput();
		// printArray(arr1);
		// int mergeArray[] = mergeTwoSortedArrays(arr, arr1);
		// printArray(mergeArray);
		// mergeTwoArraysWithoutExtraSpace(arr, arr1);
		// rearrange(arr);
		// rearrangeMethod2(arr);
		// rearrangeMethod3(arr);
		// System.out.println("Number of Pairs : " + numberOfPairs(arr, arr1));
		// System.out.println("Number of Pairs : "+ numberOfPairsMethod2(arr, arr1));
		// System.out.println("Inversion of Array : "+ inversionOfArray(arr));
		// System.out.println("Inversion of Array : "+ inversionOfArrayMergeSort(arr, 0,
		// arr.length-1));
		// int sortZerosAndOnes[]=sortZeroesOnes(arr);
		// printArray(sortZerosAndOnes);
		// int sortZeroesOnesAndTwos[]=sortZeroesOnesTwos(arr);
		// printArray(sortZeroesOnesTwos(arr));
//		int sortZeroesOnesAndTwos1[] = sortZeroesOnesTwosMethod2(arr);
//		printArray(sortZeroesOnesAndTwos1);

		System.out.println("Max Consecutive Ones : " + maxConsecutiveOnes(arr));
	}

}
