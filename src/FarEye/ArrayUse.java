package FarEye;

import java.util.*;

public class ArrayUse {

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

	public static void printArray(int arr[]) {
		System.out.println("Array is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// Write a program to find palindrome number
	public static boolean isNumberPalindrome(int n) {
		int help[] = new int[10];
		int i = 0;
		if (n < 0 || (n % 10 == 0 && n != 0)) {
			return false;
		}
		while (n > 0) {
			help[i] = n % 10;
			n = n / 10;
			i++;
		}
		int j = i - 1;
		int k = 0;
		while (k < j) {
			if (help[k] != help[j]) {
				return false;
			}
			k++;
			j--;
		}
		return true;
	}

	public static boolean ispalindromePracAgain(int n) {
		if (n < 0 || (n != 0 && n % 10 == 0)) {
			return false;
		}
		int rev = 0;
		while (n != 0) {
			rev = rev * 10 + n % 10;
			n = n / 10;
		}
		return (n == rev || n == rev / 10);
	}

	// Write a program to find palindrome number// less number of lines
	public static boolean isPalindromtNumbLessLine(int n) {
		if (n < 0 || (n != 0 && n % 10 == 0)) {
			return false;
		}
		int rev = 0;
		while (n > rev) {
			rev = rev * 10 + n % 10;
			n = n / 10;
		}
		return (n == rev || n == rev / 10);
	}

	// Palindrome Practice
	public static boolean isPalindromeNumberPrac(int n) {
		if (n < 0 || (n != 0 && n % 10 == 0)) {
			return false;
		}
		int reverse = 0;
		while (n > reverse) {
			reverse = reverse * 10 + n % 10;
			n = n / 10;
		}
		return (n == reverse || n == reverse / 10);
	}

	// reverse integer
	public static int reverseInteger(int x) {
		if (x == 0) {
			return 0;
		}
		long reverse = 0;
		while (x != 0) {
			reverse = reverse * 10 + x % 10;
			x = x / 10;
		}
		if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
			return 0;
		} else {
			return (int) reverse;
		}
	}

	public static int reverseIntegerPrac(int n) {
		if (n == 0) {
			return 0;
		}
		long rev = 0;
		while (n != 0) {
			rev = rev * 10 + n % 10;
			n = n / 10;
		}
		if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
			return 0;
		} else {
			return (int) rev;
		}
	}

	// Best Time to Buy and Sell Stock
	// Brute force
	// TC : O(n^2)... SC : O(1)
	public static int bestTimeBuySellStock(int arr[]) {
		int n = arr.length;
		int profit = Integer.MIN_VALUE;
		for (int i = 0; i < n - 1; i++) {
			int diff = 0;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] > arr[i]) {
					diff = arr[j] - arr[i];
					if (diff > profit) {
						profit = diff;
					}
				}
			}
		}
		return profit;
	}

	// Optimized method of Best Time to Buy and Sell Stock
	public static int bestTimeBuySellStockOptimized(int arr[]) {
		int n = arr.length;
		int profit = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			min = Math.min(min, arr[i]);
			profit = Math.max(profit, arr[i] - min);
		}
		return profit;
	}

	public static int bestButSellPrac(int arr[]) {
		int n = arr.length;
		int max = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[j] - arr[i] > max) {
					max = arr[j] - arr[i];
				}
			}
		}
		return max;
	}

	public static int bestTimeBuySellStockOptimizedPrac(int arr[]) {
		int n = arr.length;
		int profit = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			min = Math.min(arr[i], min);
			profit = Math.max(profit, arr[i] - min);
		}
		return profit;
	}

	// Sort an array of 0s and 1s in one traversal
	public static int[] sort0s1s(int arr[]) {
		int n = arr.length;
		int i = 0;
		int j = n - 1;
		while (i < j) {
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

	public static int[] sort0s1s2s(int arr[]) {
		int n = arr.length;
		int i = 0;
		int k = 0;
		int j = n - 1;
		while (k <= j) {
			if (arr[k] == 0) {
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				k++;
				i++;
			} else {
				if (arr[k] == 1) {
					k++;
				} else {
					if (arr[k] == 2) {
						int temp = arr[k];
						arr[k] = arr[j];
						arr[j] = temp;
						j--;
					}
				}
			}
		}
		return arr;
	}

	// Find 2nd largest element in an array (in one traversal)
	public static int secondLargest(int arr[]) {
		int n = arr.length;
		int first = 0;
		int second = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			}
		}
		return second;
	}

	// Write a program to find the sum of the digits of a number.
	public static int sumOfDigitsOfNumber(int n) {
//		int sum = 0;
//		while (n != 0) {
//			sum += n % 10;
//			n = n / 10;
//		}

		// OR

//		int sum;
//		for (sum = 0; n > 0; sum += n % 10, n /= 10)
//			;

		// OR

		return n == 0 ? 0 : n % 10 + sumOfDigitsOfNumber(n / 10);

//		return sum;
	}

	// Kadane's Algorithm or maximum sum subarray
	public static int kadanesAlgorithm(int arr[]) {
		int n = arr.length;
		int sumTillHere = 0;
		int sumSoFar = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			sumTillHere += arr[i];
			if (sumSoFar < sumTillHere) {
				sumSoFar = sumTillHere;
			}
			if (sumTillHere < 0) {
				sumTillHere = 0;
			}
		}
		return sumSoFar;
	}

	public static int kadanesAlgo(int arr[]) {
		int n = arr.length;
		int sumHere = 0;
		int sumSoFar = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			sumHere += arr[i];
			if (sumSoFar < sumHere) {
				sumSoFar = sumHere;
			}
			if (sumHere < 0) {
				sumHere = 0;
			}
		}
		return sumSoFar;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int arr[] = takeInput();
		printArray(arr);

//		System.out.println("Palindrome number : ");
//		System.out.println("Enter number : ");
//		int n = s.nextInt();
//		System.out.println("Is number palindrome : " + isNumberPalindrome(n));
//		System.out.println("Is number palindrome less number of lines : " + isPalindromtNumbLessLine(n));

//		System.out.println("Reverse Integer is : " + reverseInteger(n));
//		System.out.println("Reverse Integer Prac is : " + reverseIntegerPrac(n));

//		System.out.println("Best Time to Buy and Sell Stock : " + bestTimeBuySellStock(arr));
//		System.out.println("Best Time to Buy and Sell Stock Optimized : " + bestTimeBuySellStockOptimized(arr));

//		System.out.println("Best time to buy and sell stock : " + bestButSellPrac(arr));
//		System.out.println("Best time to buy and sell stock optimized : " + bestTimeBuySellStockOptimizedPrac(arr));

//		System.out.println("Sort 0s 1s : ");
//		int sort[] = sort0s1s(arr);
//		printArray(sort);

//		System.out.println("Sort 0s 1s 2s : ");
//		int sort[] = sort0s1s2s(arr);
//		printArray(sort);

//		System.out.println("2nd largest element in an array (in one traversal) : " + secondLargest(arr));

//		System.out.println("Enter number : ");
//		int n = s.nextInt();
//		System.out.println("Sum of Digits : " + sumOfDigitsOfNumber(n));

		System.out.println("Kadane's Alogrithm : " + kadanesAlgorithm(arr));

	}

}
