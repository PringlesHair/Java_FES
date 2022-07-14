package ShKang;

import java.util.Scanner;

public class JavaFestival09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자 입력 : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		System.out.print("반올림 수 : ");
		if (input % 10 < 5) {
			System.out.println(input / 10 * 10);
		} else {
			System.out.println(input / 10 * 10 + 10);
		}
	}
}
