package TCS_Digital;

import java.util.Scanner;

public class WashingMachine_24th {

	public static int washingMachineOperation(int weight) {
		if (weight > 0 && weight <= 2000) {
			return 25;
		} else {
			if (weight > 2000 && weight <= 4000) {
				return 35;
			} else {
				if (weight > 4000 && weight < 7000) {
					return 45;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter weight of clothes : ");
		int wt = s.nextInt();
		if (wt > 7000) {
			System.out.println("OVERLOADED");
		}
		int time = washingMachineOperation(wt);
		if (time == -1) {
			System.out.println("INVALID INPUT");
		} else {
			System.out.println(time);
		}

	}

}
