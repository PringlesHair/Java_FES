package ShKang;

import java.util.Scanner;

public class JavaFestival06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;

		while (n > 0) {

			sum += n % 10;

			n /= 10;

		}

		System.out.println("합은 " + sum + "입니다.");
	}

}
