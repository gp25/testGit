package Amazon;

import java.util.*;

public class MatrixUse {

	public static int[][] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int rows = s.nextInt();
		System.out.println("Enter number of cols : ");
		int cols = s.nextInt();
		int arr[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		return arr;
	}

	public static void printMatrix(int arr[][]) {
		int rows = arr.length;
		int cols = arr[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	// Rotate Matrix By 90 degree
	public static int[][] rotateClockwise(int arr[][]) {
		int rows = arr.length;
		int cols = arr[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		for (int i = 0; i < rows; i++) {
			reverse(arr[i], 0, cols - 1);
		}
		return arr;
	}

	public static int[][] rotateAntiClockwise(int arr[][]) {
		int rows = arr.length;
		int cols = arr[0].length;
		for (int i = rows - 1; i >= 0; i--) {
			for (int j = cols - 1; j >= i; j--) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		reverseAnticlockwise(arr);
		return arr;
	}

	public static void reverseAnticlockwise(int arr[][]) {
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0, k = arr[0].length - 1; j < k; j++, k--) {
				int temp = arr[j][i];
				arr[j][i] = arr[k][i];
				arr[k][i] = temp;
			}
		}
	}

	public static void reverse(int arr[], int i, int j) {
		while (i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int arr[][] = takeInput();
		printMatrix(arr);

//		System.out.println("Rotate Matrix Clockwise by 90 degree : ");
//		int rotateClockwise[][] = rotateClockwise(arr);
//		printMatrix(rotateClockwise);

		System.out.println("Rotate Matrix Anticlockwise by 90 degree : ");
		int rotateAntiClockwise[][] = rotateAntiClockwise(arr);
		printMatrix(rotateAntiClockwise);
	}

}
