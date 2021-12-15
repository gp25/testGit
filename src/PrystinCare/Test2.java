package PrystinCare;

import java.util.HashMap;
import java.util.HashSet;

public class Test2 {

	public static int numberOfPairs(int arr[], int sum) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == sum) {
					count++;
				}
			}
		}
		return count;
	}

	public static int numberOfPairsOptimized(int arr[], int sum) {
		int n = arr.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (map.get(sum - arr[i]) != null) {
				count += map.get(sum - arr[i]);
			}
			if ((sum - arr[i]) == arr[i]) {
				count--;
			}
		}
		System.out.println("count : " + count);
		return count / 2;
	}

	public static void main(String[] args) {
//		int arr[] = { 1, 5, 7, -1 };
		int arr[] = { 1, 5, 7, -1, 5 };
		int sum = 6;
//		System.out.println("Number of pairs : " + numberOfPairs(arr, sum));
		System.out.println("Number of Pairs optimized : " + numberOfPairsOptimized(arr, sum));
	}

}
