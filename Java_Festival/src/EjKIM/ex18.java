package EjKIM;

import java.util.Scanner;

public class ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int num = sc.nextInt();
		int sum = 0;
		System.out.print("1부터 " + num + "까지의 합은 ");
		for (int i = 1; i <= 60; i++) {
			sum += i;
		}
		System.out.print(sum + "입니다.");
	}
}