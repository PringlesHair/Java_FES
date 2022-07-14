package JisuAn;

import java.util.Scanner;

public class ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int num1 = sc.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= 60; i++) {
			sum += i;
		}
		System.out.println("1부터 " + num1 +"까지의 합은 " +sum + "입니다.");
		System.out.println(num1 * (num1 + 1) / 2);
	}
}