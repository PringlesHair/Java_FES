package JisuAn;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반올림 전 값 : ");
		int num1 = sc.nextInt();
		int num2 = (num1 % 100) % 10;

		if (num2 < 5) {
			System.out.println("반올림 후 값 : " + (num1 - num2));
		} else {
			System.out.println("반올림 후 값 : " + (num1 - num2 + 10));
		}
	}
}
