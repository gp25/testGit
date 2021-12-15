package TCS_Digital;

import java.util.Scanner;

public class FacePrepCodingQuestions {

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

	public static String takeInputString() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = s.nextLine();
		return str;
	}

	public static void printString(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}

	public static int fibonacciSeries(int n) {
		if (n < 2) {
			return n;
		}
		return fibonacciSeries(n - 2) + fibonacciSeries(n - 1);
	}

	public static void primeSeries(int n) {
		int count = 0;
		for (int i = 2; i < Integer.MAX_VALUE; i++) {
			if (isPrime(i)) {
				if (++count == n) {
					System.out.print(i + " ");
					break;
				}
			}
		}
		System.out.println();
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Given a series whose even term creates a separate geometric series and
	// odd term creates another geometric series.
	public static void seperateGPSeries() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter total number of elments : ");
		int n = s.nextInt();
		System.out.println("Enter ratio for GP -1 :");
		int r1 = s.nextInt();
		System.out.println("Enter ratio for GP -2 : ");
		int r2 = s.nextInt();
		int a = 1;
		int b = 1;
		if (n % 2 == 0) {
			for (int i = 0; i < n / 2; i++) {
				System.out.print(a + " ");
				a = a * r1;
				System.out.print(b + " ");
				b = b * r2;
			}
		} else {
			for (int i = 0; i < n / 2; i++) {
				System.out.print(a + " ");
				a = a * r1;
				System.out.print(b + " ");
				b = b * r2;
			}
			System.out.println(a);
		}
	}

	public static void seperateGPseriesPrac() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter total number of elements : ");
		int n = s.nextInt();
		System.out.println("Enter ratio one : ");
		int r1 = s.nextInt();
		System.out.println("Enter ratio second : ");
		int r2 = s.nextInt();
		int a = 1;
		int b = 1;
		if (n % 2 == 0) {
			for (int i = 0; i < n / 2; i++) {
				System.out.print(a + " ");
				a = a * r1;
				System.out.print(b + " ");
				b = b * r2;
			}
		} else {
			for (int i = 0; i < n / 2; i++) {
				System.out.print(a + " ");
				a = a * r1;
				System.out.print(b + " ");
				b = b * r2;
			}
			System.out.println(a);
		}
	}

	public static int fibonacciSeriesPrac(int n) {
		if (n < 2) {
			return n;
		}
		return fibonacciSeriesPrac(n - 2) + fibonacciSeriesPrac(n - 1);
	}

	public static int fibonacciSeriesPrac11(int n) {
		if (n < 2) {
			return n;
		}
		return fibonacciSeriesPrac11(n - 2) + fibonacciSeriesPrac11(n - 1);
	}

	public static void primeSeriesPrac(int n) {
		int count = 0;
		for (int i = 2; i < Integer.MAX_VALUE; i++) {
			if (isPrimePrac(i)) {
				if (++count == n) {
					System.out.print(i + " ");
				}
			}
		}
	}

	public static boolean isPrimePrac(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int factorial(int n) {
		if (n <= 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static double areaOfCicle(int n) {
		if (n <= 0) {
			return 0;
		}
		return 3.14 * n * n;
	}

	public static void leapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("leap year.");
				} else {
					System.out.println("not a leap year.");
				}
			} else {
				System.out.println("leap year.");
			}
		} else {
			System.out.println("not a leap year.");
		}
	}

	public static int GCD(int a, int b) {
		if (b != 0) {
			return GCD(b, a % b);
		} else {
			return a;
		}
	}

	public static int gcdPrac(int a, int b) {
		if (b != 0) {
			return gcdPrac(b, a % b);
		} else {
			return a;
		}
	}

	public static boolean isPrimePrac1(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrimePrac11(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void printPrimeInRange(int a, int b) {

	}

	public static int multipleDigits(int n) {
		int temp = n;
		int product = 1;
		while (temp != 0) {
			product = product * (temp % 10);
			temp = temp / 10;
		}
		return product;
	}

	public static String remove756(String str) {
		char strArray[] = str.toCharArray();
//		String res="";
		char res[] = new char[str.length()];
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] == 7) {
				continue;
			} else {
				if (strArray[i] == 5 && strArray[i + 1] == 6) {
					i++;
					continue;
				} else {
					res[i] = strArray[i];
				}
			}
		}
		String strr = res.toString();
		return strr;
	}

	public static String remove7561(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '7') {
				continue;
			} else {
				if ((str.length() - i) >= 2 && str.charAt(i) == '5' && str.charAt(i + 1) == '6') {
					i++;
					continue;
				} else {
					res = res + str.charAt(i);
				}
			}
		}
		return res;
	}

	public static void decimalToBinary(int n) {
		int res[] = new int[10000];
		int k = 0;
		while (n != 0) {
			res[k] = n % 2;
			k++;
			n = n / 2;
		}
		for (int i = k - 1; i >= 0; i--) {
			System.out.print(res[i] + "");
		}
		System.out.println();
	}

	public static String reverseString(String str) {
//		int i=0;
		int j = str.length();
		String res = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			res = res + str.charAt(i);
		}
		return res;
	}

	public static String reverseStringRecursion(String str) {
		if (str.length() < 2) {
			return str;
		}
		return reverseStringRecursion(str.substring(1)) + str.charAt(0);
	}

	public static String reverseStringRecursionM2(String str) {
		if (str == null || str.isEmpty()) {
			return str;
		}
		return str.charAt(str.length() - 1) + reverseStringRecursionM2(str.substring(0, str.length() - 1));
	}

	public static boolean isArmstrongNumber(int n) {
		int numb = n;
		int sum = 0;
		while (numb != 0) {
			int temp = numb % 10;
			sum = sum + (temp * temp * temp);
			numb = numb / 10;
		}
		if (sum == n) {
			return true;
		}
		return false;
	}

	public static boolean isPallindrome(String str) {
		if (str == null || str.length() == 1) {
			return true;
		}
		if (str.equals(reverseStringRecursionM2(str))) {
			return true;
		}
		return false;
	}

	public static int multiplyDigitsPrac(int n) {
		int temp = n;
		int product = 1;
		while (temp != 0) {
			product = product * (temp % 10);
			temp = temp / 10;
		}
		return product;
	}

	public static void stockProfit(int arr[]) {

		// int sum=0;
		int i = 0;
		int j = i + 1;
		int n = arr.length;
		while (j < n) {
			if (arr[j] < arr[j - 1]) {
				int diff = arr[j - 1] - arr[i];
				System.out.print(diff + " ");
				i = j;
			}
			if (j == n - 1) {
				System.out.print(arr[j] - arr[i]);
				break;
			}

			j++;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = s.nextInt();

//		for(int i=1;i<=n;i++) {
//		System.out.println("Fibonacci series is : "+ i+" : "+ fibonacciSeries(i));
//		}
//		System.out.println("Is this number prime : "+ isPrime(n));
//		primeSeries(n);

		// Print 1, 2, 1, 3, 2, 5, 3, 7, 5, 11, 8, 13, 13, 17, ...
		// This series is a mixture of 2 series - all the odd terms in this series form
		// a Fibonacci series
		// and all the even terms are the prime numbers in ascending order.
//		if(n%2==0) {
//			primeSeries(n/2);
//		}else {
//			System.out.print(fibonacciSeries((n+1)/2)+" ");
//		}
//		seperateGPSeries();
//		for (int i = 1; i <= n; i++) {
//			System.out.println("fibonacci series : " + fibonacciSeries(i));
//		}
//		primeSeriesPrac(n);
//		if(n%2==0) {
//			primeSeriesPrac(n/2);
//		}else {
//			System.out.print(fibonacciSeriesPrac((n+1)/2));
//		}
//		seperateGPseriesPrac();
//		System.out.println("Factorial of "+n+" is : "+factorial(n));
//		System.out.println("Area of radius "+n+" is : "+ areaOfCicle(n));
//		leapYear(n);
//		System.out.println("Enter two numbers a and b : ");
//		int a = s.nextInt();
//		int b = s.nextInt();
//		System.out.println("GCD of a and b is : " + GCD(a, b));
//		System.out.println("is " + n + " prime number : " + isPrimePrac1(n));
//		System.out.println("gcd of a and b is : "+ gcdPrac(a, b));
//		System.out.println("Fibonacci Series : "+ fibonacciSeriesPrac11(n));
//		for(int i=0;i<n;i++) {
//			System.out.print(fibonacciSeriesPrac11(i)+" ");
//		}
//		System.out.println(multipleDigits(n));
//		String str=takeInputString();
//		printString(remove7561(str));
//		printString(reverseString(str));
//		printString(reverseStringRecursion(str));
//		printString(reverseStringRecursionM2(str));
//		System.out.println("Is Armstrong number : "+ isArmstrongNumber(n));
		// decimalToBinary(n);
//		System.out.println("Is Pallindrome : "+ isPallindrome(str));
//		System.out.println(multiplyDigitsPrac(n));
		int arr[]=takeInput();
		stockProfit(arr);

	}

}
