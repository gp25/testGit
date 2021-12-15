package Amazon;

import java.util.*;

public class ArraysUse {

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
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// Insertion Sort
//	public static int[] insertionSort(int arr[]) {
//		int n=arr.length;
//		for(int i=1;i<n;i++) {
//			int x=arr[i];
//			int j=i-1;
//			while(j>=0 && arr[j]>x) {
//				j--;
//			}
//			arr[j]=x;
//		}
//	}

	// Selection Sort
	public static int[] selectionSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}

	// Bubble Sort
	public static int[] bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	// k largest(or smallest) elements in an array
	// Method 1 : Using Bubble Sort
	// TC : O(n*k)
	public static void kLargestElements(int arr[], int k) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				for (int m = 0; m < n - j - 1; m++) {
					if (arr[m] > arr[m + 1]) {
						int temp = arr[m];
						arr[m] = arr[m + 1];
						arr[m + 1] = temp;
					}
				}
			}
		}
		for (int i = n - k; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// Pythagorean Triplets
	// TC : O(n^3)
	public static void pythagoreanTripletsNaive(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					int first = arr[i] * arr[i];
					int second = arr[j] * arr[j];
					int third = arr[k] * arr[k];
					if (first + second == third || first + third == second || second + third == first) {
						System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
					}
				}
			}
		}
	}

	// Pythagorean Triplets using sorting
	// TC : O(n^2)
	public static boolean isPythagoreanTripletsSorting(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			arr[i] = arr[i] * arr[i];
		}
		Arrays.sort(arr);
		int first = 0;
		int third = n - 1;
		int second = third - 1;
		while (first < second) {
			if (first + second == third || first + third == second || second + third == first) {
				return true;
			}
			if (first + second < third) {
				first++;
			} else {
				third--;
			}
			if (first == second) {
				third--;
				second = third - 1;
				first = 0;
			}
		}
		return false;
	}

	// Arrange an array so that all the even numbers will move right, and odd
	// numbers will move to left.
	public static int[] segregateEvenRightOddLeft(int arr[]) {
		int n = arr.length;
		int i = 0;
		int j = n - 1;
		while (i < j) {
			if (arr[i] % 2 != 0) {
				i++;
			} else {
				if (arr[j] % 2 == 0) {
					j--;
				} else {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i++;
					j--;
				}
			}
		}
		return arr;
	}

	// Kadane's Algorithm for maximum contiguous sum
	public static int kadanesAlgorithm(int arr[]) {
		int n = arr.length;
		int sum_here = 0;
		int sum_sofar = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			sum_here += arr[i];
			if (sum_sofar < sum_here) {
				sum_sofar = sum_here;
			}
			if (sum_here < 0) {
				sum_here = 0;
			}
		}
		return sum_sofar;
	}

	// Buy and Sell Stocks
	public static int buySellStocks(int arr[]) {
		int n = arr.length;
		int profit = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			min = Math.min(arr[i], min);
			profit = Math.max(profit, arr[i] - min);
		}
		return profit;
	}

	// Next Permutation
	public static void nextPermutation(int arr[]) {
		int n = arr.length;
		if (n <= 1 || arr == null) {
			return;
		}
		int i = n - 2;
		while (i >= 0 && arr[i] >= arr[i + 1]) {
			i--;
		}

		if (i >= 0) {
			int j = n - 1;
			while (arr[i] >= arr[j]) {
				j--;
			}
			swap(arr, i, j);
		}
		reverse(arr, i + 1, n - 1);
	}

	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void reverse(int arr[], int i, int j) {
		while (i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	// Grid Unique Paths
	// Using Dynamic programming solution
	public static int gridUsingDPwithExtraSpace(int rows, int cols) {
		int count[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			count[i][0] = 1;
		}
		for (int j = 0; j < cols; j++) {
			count[0][j] = 1;
		}
		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				count[i][j] = count[i - 1][j] + count[i][j - 1];
			}
		}
		return count[rows - 1][cols - 1];
	}
	
	//Using Dynamic programming solution without extra space
	public static int gridUsingDPWithoutExtraSpace(int rows,int cols) {
		int dp[]=new int[cols];
		dp[0]=1;
		for(int i=0;i<rows;i++) {
			for(int j=1;j<cols;j++) {
				dp[j] += dp[j-1];
			}
		}
		return dp[cols-1];
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int arr[] = takeInput();
		printArray(arr);

//		int selectionSort[] = selectionSort(arr);
//		printArray(selectionSort);

//		int bubbleSort[] = bubbleSort(arr);
//		printArray(bubbleSort);

//		System.out.println("k largest(or smallest) elements in an array : ");
//		System.out.println("Enter value of K : ");
//		int k = s.nextInt();
//		kLargestElements(arr, k);

//		System.out.println("Pythagorean Triplets Naive : ");
//		pythagoreanTripletsNaive(arr);
//		System.out.println("Pythagorean Triplets Boolean : "+ isPythagoreanTripletsSorting(arr));

//		System.out.println("Segregate Even and odd elements : ");
//		int sort[] = segregateEvenRightOddLeft(arr);
//		printArray(sort);

//		System.out.println("Kadane's Algorithm : " + kadanesAlgorithm(arr));

//		System.out.println("Buy and Sell Stocks : " + buySellStocks(arr));

//		System.out.println("Next Permutation : ");
//		nextPermutation(arr);
//		printArray(arr);

		System.out.println("Grid Unique paths : "+ gridUsingDPwithExtraSpace(2, 3));
		
	}

}
