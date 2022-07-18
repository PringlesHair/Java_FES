package EjKIM;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		int startValue = 2;
		int endValue = 1000;
		System.out.print("2~1000까지의 완전수 : ");
		getPerfectNumber(startValue, endValue);
	}

	private static void getPerfectNumber(int startValue, int endValue) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= endValue; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (i == sum) {
				System.out.print(i + " ");
			}
		}
	}
}
