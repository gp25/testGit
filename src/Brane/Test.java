package Brane;

public class Test {

	public static void display(int i) {
		System.out.print(i);
		if (i <= 3) {
//			display(++i);
			display(i+1);
		}
		System.out.print(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(1);
	}

}
