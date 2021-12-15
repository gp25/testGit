package Amazon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Test {

	public static void sortArray(Integer arr[]) {
		int n = arr.length;
		HashMap<Integer, Integer> mapCount = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> mapIndex = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (mapCount.containsKey(arr[i])) {
				mapCount.put(arr[i], mapCount.get(arr[i]) + 1);
			} else {
				mapCount.put(arr[i], 1);
				mapIndex.put(arr[i], i);
			}
		}
		List<Integer> list = Arrays.asList(arr);
		Collections.sort(list, new Comparator<Integer>() {
			public int compare(Integer n1, Integer n2) {
				int freq1 = mapCount.get(n1);
				int freq2 = mapCount.get(n2);
				if (freq1 != freq2) {
					return freq1 - freq2;
				} else {
					return mapIndex.get(n1) - mapIndex.get(n2);
				}
			}
		});
		System.out.print(list);
	}

	public static void sortListUsingComparatorInterface(List<String> list) {
		Collections.sort(list, new Comparator<String>() {
			public int compare(String n1, String n2) {
				return n2.compareTo(n1);
			}
		});
		System.out.println(list);
	}

	public static void main(String[] args) {
//		Integer arr[] = { 2, 3, 4, 2, 4, 2, 6 };
//		Integer arr[] = { 5, 4, 3, 2, 1 };
		String str[]= {"Bac","Cab","Abc"};
//		sortArray(arr);

		List<String> list = Arrays.asList(str);
		sortListUsingComparatorInterface(list);
	}

}
