package TCS_Digital;

import java.util.Scanner;

public class JarCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		int n=10;
		System.out.println("Enter Total number of candies : "+ n);
		System.out.println("Number of minimum candies in jar : ");
		int k=s.nextInt();
		if(k<=0) {
			System.out.println("INVALID INPUT...");
			System.out.println("Number of Candies available : "+n);
		}else {
			System.out.println("Number of candies sold : "+k);
			System.out.println("Number of candies left in jar : "+ (n-k));
		}
		
	}

}
