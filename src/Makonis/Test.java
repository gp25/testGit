package Makonis;

import java.util.*;

public class Test {

	// Practice
	public static char[] reverseWordwise(char[] strarr) {
		int n = strarr.length;
		int i = 0;
		for (int j = 0; j < n; j++) {
			if (strarr[j] == ' ') {
				reverse(strarr, i, j - 1);
				i = j + 1;
			}
		}
		reverse(strarr, i, strarr.length - 1);
		reverse(strarr, 0, strarr.length - 1);
		return strarr;
	}

	public static void reverse(char arr[], int i, int j) {
		while (i < j) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	// To delete given character from string
	public static String deleteCharacter(String str, String ch) {
		int n = str.length();
		String newStr = "";
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == ch.charAt(0)) {
				i++;
			}
			newStr += str.charAt(i);
		}
		return newStr;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter String : ");
		String str = s.nextLine();

//		char ch[] = reverseWordwise(str.toCharArray());
//		System.out.println(ch);

		System.out.println("Enter given character : ");
		String ch = s.next();
		String newStr = deleteCharacter(str, ch);
		System.out.println(newStr);

	}

}
