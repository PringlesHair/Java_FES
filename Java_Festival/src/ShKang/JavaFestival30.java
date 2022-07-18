package ShKang;

import java.util.Scanner;

public class JavaFestival30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		int n = sc.nextInt();

		int[][] arr = new int[n][n];

		int cnt = 1;

		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				arr[i][j] = cnt;
				cnt++;
			}
		}

		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}
	}

}
