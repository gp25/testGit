package infoedge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestInfoEdge {

	public static ArrayList<List<Integer>> solution(int arr[]) {
		int n = arr.length;
		Arrays.sort(arr);
		ArrayList<List<Integer>> list = new ArrayList<>();
		for (int i = n - 1; i >= 0; i--) {
			int j = i - 1;
			int k = 0;

			while (k < j) {
				ArrayList<Integer> sublist = new ArrayList<>();
				if (arr[i] == (arr[k] + arr[j])) {
//					System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					sublist.add(arr[i]);
					sublist.add(arr[j]);
					sublist.add(arr[k]);
					list.add(sublist);
					j--;
//					return ;
				} else {
					if (arr[i] < arr[j] + arr[k]) {
						j--;
					} else {
						k++;
					}
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, 7, 6, 8, 9 };

		ArrayList<List<Integer>> list = solution(arr);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}

	}

}
