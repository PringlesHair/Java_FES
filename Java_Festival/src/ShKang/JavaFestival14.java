package ShKang;

import java.util.Scanner;

public class JavaFestival14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("정수 입력 >> ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] arr = new int[n][n];

		int cnt = 1;

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = cnt;
					cnt++;
				}
			} else {
				for (int j = n - 1; j >= 0; j--) {
					arr[i][j] = cnt;
					cnt++;
				}
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
