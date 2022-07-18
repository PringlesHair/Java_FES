package EjKIM;

import java.util.Scanner;

public class ex30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 N 입력 : ");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];

		int a = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i % 2 == 0) {
					arr[i][j] = a;
				} else {
					arr[i][(arr[i].length - 1) - j] = a;
				}
				a++;
			}
			
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
