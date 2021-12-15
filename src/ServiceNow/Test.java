package ServiceNow;

public class Test {

	public static int maximumNumber(int num) {
		if (num < 6) {
			return num;
		}
		int max = 0;
		for (int i = num - 3; i >= 1; i--) {
			int temp = (num - i - 1) * maximumNumber(i);
			if (temp > max) {
				max = temp;
			}
		}
		return max;
	}

	public static void main(String[] args) {

		System.out.println("result : " + maximumNumber(11));

	}

}
