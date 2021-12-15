package TCS_Digital;
import java.util.Scanner;
public class Fibonacci {
	
	public static void fiboMethod1(int n) {
		 int a=1;
		 int b=1;
		 int count=0;
		 int c=0;
		 int even=0;
		 int odd=0;
		 while(count < n) {
			 if(a%2==0) {
				 even++;
			 }else {
				 odd++;
			 }
			 System.out.print(a+" ");
			 c=a+b;
			 a=b;
			 b=c;
			 count++;
		 }
		 System.out.println();
		 System.out.println("Even number : "+ even);
		 System.out.println("Odd number : "+ odd);
	}
	
	//fibo series contain n elements .................
	public static void fiboLinear(int n) {
		int a=1;
		int b=1;
		int c=0;
		int count=0;
		while(count <n) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			count++;
		}
		
	}
	
	//fibo series contain upto Nth number ............
	public static void fiboLinearUptoN(int n) {
		int a=0;
		int b=1;
		int c=0;
		while(a <= n) {
			
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
	
	public static int fiboRecursive(int n) {
		if(n<=1) {
			return n;
		}
		return fiboRecursive(n-1)+fiboRecursive(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
//		int a=1,b=1;
		System.out.println("Enter number : ");
		int n=s.nextInt();
//		fiboMethod1(n);
//		fiboLinear(n);
//		fiboLinearUptoN(n);
		int even=0;
		int odd=0;
		for(int i=1;i<=n;i++) {
			if(fiboRecursive(i)%2==0) {
				even++;
			}else {
				odd++;
			}
			System.out.print(fiboRecursive(i)+" ");
		}
		System.out.println();
		System.out.println("Even number in series : "+ even);
		System.out.println("Odd number in series : "+ odd);
		

	}

}
