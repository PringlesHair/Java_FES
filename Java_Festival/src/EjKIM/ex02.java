package EjKIM;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력 >> ");
		int num = sc.nextInt();

		if (num % 4 == 0 && num % 100 != 0) {
			System.out.println("윤년");
		} else if (num % 400 == 0) {
			System.out.println("윤년");
		} else {
			System.out.println("윤년 아님");
		}
	}

}
