package PhonePe;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Test {

	static final int x = 0;

	// i/p : 2,4,2,3,2,4
	public static void maxFrequency(int arr[]) {
		int n = arr.length;
		int max = 0;
		int element = Integer.MAX_VALUE;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
			if (max < map.get(arr[i])) {
				max = map.get(arr[i]);
				if (element > arr[i]) {
					element = arr[i];
				}
			}
		}

//		for (Entry e : map.entrySet()) {
//			int val = (int) e.getValue();
//			if (val > max) {
//				max = val;
//				element = (int) e.getKey();
//			}
//		}
		System.out.println(element + " : " + max);
	}

	public static void main(String[] args) {

		int arr[] = { 2, 4, 5, 6, 2, 3, 2, 1, 1, 1 };
//		maxFrequency(arr);
		System.out.println(x);
//		x = 10;
		System.out.println(x);

	}

}
