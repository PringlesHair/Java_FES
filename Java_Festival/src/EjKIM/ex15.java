package EjKIM;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("현재금액 : ");
		int price = sc.nextInt();
		System.out.println("잔돈변환");
		System.out.println("10000원 : " + price / 10000 + "개");
		System.out.println("5000원 : " + price % 10000 / 5000 + "개");
		System.out.println("1000원 : " + price % 10000 % 5000 / 1000 + "개");
		System.out.println("500원 : " + price % 10000 % 5000 % 1000 / 500 + "개");
		System.out.println("100원 : " + price % 10000 % 5000 % 1000 % 500 / 100 + "개");
	}

}