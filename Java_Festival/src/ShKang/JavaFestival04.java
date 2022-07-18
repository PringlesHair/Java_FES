package ShKang;

import java.util.Scanner;

public class JavaFestival04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력>>");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 입력>>");
		int num2 = sc.nextInt();

		System.out.println(num1 * (num2 % 10));
		System.out.println(num1 * ((num2 / 10) % 10));
		System.out.println(num1 * (num2 / 100));
		System.out.println(num1 * num2);
	}

}
