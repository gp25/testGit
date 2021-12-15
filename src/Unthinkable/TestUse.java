package Unthinkable;

public class TestUse {

	public static void reverseString(char str[], int l, int r) {
		int n = str.length;
		while (l < r) {
			char temp = str[l];
			str[l] = str[r];
			str[r] = temp;
			l++;
			r--;
		}
		System.out.println(str);
	}

	public static void reverseStringM2(String str) {
		int n = str.length();
		String res = "";
		for (int i = n - 1; i >= 0; i--) {
			res += str.charAt(i);
		}
		for (int i = 0; i < res.length(); i++) {
			System.out.print(res.charAt(i) + "");
		}
	}

	public static String reverseStringM3(String str) {
		if (str.length() == 1) {
			return str;
		}
		String res = "";
		res += reverseStringM3(str.substring(1)) + str.charAt(0);
		return res;
	}

	public static void pattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
				if(j!=n-i-1) {
					System.out.print("_");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		String str = "gauravpal";
//		char strArr[] = str.toCharArray();
//		reverseString(strArr, 0, strArr.length - 1);

//		reverseStringM2(str);

//		String res = reverseStringM3(str);
//		for (int i = 0; i < res.length(); i++) {
//			System.out.print(res.charAt(i) + "");
//		}
		
//		pattern(4);
		
		int i=5;
		System.out.println(i++ + ++i + i++);

	}

}
