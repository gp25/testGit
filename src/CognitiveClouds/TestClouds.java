package CognitiveClouds;

import java.util.HashSet;

public class TestClouds {

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static void missingNumber(int arr[]) {
		int n=arr.length;
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<n;i++) {
			set.add(arr[i]);
		}
		for(int i=1;i<=10;i++) {
			if(!set.contains(i)) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("Factorial : "+ factorial(5));

//		System.out.println("Fibonacci number : "+ fibonacci(3));
//		for (int i = 0; i < 10; i++) {
//			System.out.print(fibonacci(i) + " ");
//		}
		
		int arr[]= {};
		missingNumber(arr);

	}

}
