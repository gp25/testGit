package Mphasis;

import java.util.*;

public class StringUse {

	public static int checkSubString(String str1, String str2) {
		int n1 = str1.length();
		int n2 = str2.length();
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					if (str2.substring(j, j + str1.length()).equals(str1)) {
						return j;
					}
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter string 1 : ");
		String str1 = s.nextLine();
		System.out.println("Enter string 2 : ");
		String str2 = s.nextLine();
		System.out.println("Is " + str1 + " present in " + str2 + " : " + checkSubString(str1, str2));
	}

}
