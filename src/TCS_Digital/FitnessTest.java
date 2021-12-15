package TCS_Digital;

import java.util.Scanner;

public class FitnessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Oxygen level : ");
		// int n=s.nextInt();
		int arr[] = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = s.nextInt();
			if (arr[i] <= 1 || arr[i] >= 100) {
				System.out.println("INVALID INPUT...");
				i--;
			}
		}
		int t1 = 0, t2 = 0, t3 = 0;

		for (int i = 0; i < 9; i++) {
			if (i % 3 == 0) {
				t1 += arr[i];
			} else {
				if (i % 3 == 1) {
					t2 += arr[i];
				} else {
					t3 += arr[i];
				}
			}
		}
		int a1 = 0, a2 = 0, a3 = 0;
		a1 = t1 / 3;
		a2 = t2 / 3;
		a3 = t3 / 3;
		if (a1 < 70 && a2 < 70 && a3 < 70) {
			System.out.println("All Trainees are unfit...");
		}
		if (a1 >= a2 && a1 >= a3) {
			System.out.println("Trainee Number : " + 1);
		}
		if (a2 >= a1 && a2 >= a3) {
			System.out.println("Trainee Number : " + 2);
		}
		if (a3 >= a1 && a3 >= a2) {
			System.out.println("Trainee Number : " + 3);
		}

	}

}
