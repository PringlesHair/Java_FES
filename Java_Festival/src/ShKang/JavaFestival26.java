package ShKang;

import java.util.Scanner;

public class JavaFestival26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("n 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int n = 1;

		for (int i = 1; i <= num; i++) {
			System.out.print(n + " ");

			n += i;
		}
	}

}
