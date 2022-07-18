package ShKang;

import java.util.Scanner;

public class JavaFestival23_ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");

		int num = sc.nextInt();

		int factory = 1;

		for (int i = 1; i <= num; i++) {

			factory *= i;

		}

		System.out.print("출력 : " + factory);

	}

}
