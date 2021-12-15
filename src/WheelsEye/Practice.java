package WheelsEye;

import java.util.*;

public class Practice {

//	Find the smallest window in a string containing all characters of another string
//	public static void subStringContainingAllCharacters(String str, String subStr) {
//		int n = str.length();
//		for (int i = 0; i < n; i++) {
//			for (int j = i + 1; j < n + 1; j++) {
//				if (checkCharacters(str.substring(i, j), subStr)) {
//					System.out.println(str.subSequence(i, j));
//				}
//			}
//		}
//	}

//	public static boolean checkCharacters(String str, String subStr) {
//		int strLength=str.length();
//		int subStrLength=subStr.length();
//		for(int i=0;i<subStrLength;i++) {
//			if(str.contentEquals(subStr.charAt(i)))
//		}
//		return false;
//	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter String : ");
		String str = s.nextLine();
//		subStringContainingAllCharacters(str);

	}

}
