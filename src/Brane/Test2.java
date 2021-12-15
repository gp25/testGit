package Brane;

import java.util.Scanner;

public class Test2 {

	public static int power(int x, int y) {
		if (y == 0) {
			return 1;
		} else {
			if (y % 2 == 0) {
				return power(x, y / 2) * power(x, y / 2);
			} else {
				return x * power(x, y / 2) * power(x, y / 2);
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		System.out.println(power(2, 50));
		System.out.println((int)Math.pow(2, 100));
	}

}
