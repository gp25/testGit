package PrystinCare;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static boolean anagram(char[] str1, char[] str2) {
		int n1 = str1.length;
		int n2 = str2.length;

		if (n1 != n2) {
			return false;
		}

		Arrays.sort(str1);
		Arrays.sort(str2);
		for (int i = 0; i < n1; i++) {
			if (str1[i] != str2[i]) {
				return false;
			}
		}
		return true;
	}

	// ['AND', 'DAN', 'DDD', 'DDAANN', 'CAT','TAC' ]
	public static ArrayList<String> checkAnagram(String arr[]) {
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < arr.length - 1; i++) {
			String str = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (anagram(str.toCharArray(), arr[j].toCharArray())) {
					list.add(str);
					list.add(arr[j]);
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String str1 = "AND";
//		String str2 = "DAAN";

//		System.out.println("anagram : " + anagram(str1.toCharArray(), str2.toCharArray()));

		String[] inp = { "AND", "DAN", "DDD", "DDAANN", "CAT", "TAC" };
		ArrayList<String> res = checkAnagram(inp);
		System.out.println(res);
	}

}
