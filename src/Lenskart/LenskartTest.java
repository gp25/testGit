package Lenskart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LenskartTest {

	public static void doMath(String str) {
		int n = str.length();
		List<Integer> help = new ArrayList<>();
		String currstr = "";
		int k = 0;
		for (int i = 0; i < n;) {
			if(i==n-1) {
				help.add(Integer.parseInt(currstr));
			}
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				i++;
			} else {
				if (str.charAt(i) != 32) {
					currstr += str.charAt(i);
					i++;
				} else {
					help.add(Integer.parseInt(currstr));
					currstr = "";
					i++;
				}
			}
		}
		Collections.sort(help);
		for (int i = 0; i < help.size(); i++) {
			System.out.print(help.get(i) + " ");
		}
	}
	

	public static void main(String[] args) {

		String str = "24b6 1a23 x369 89e 900y";
		
		doMath(str);

	}

}
