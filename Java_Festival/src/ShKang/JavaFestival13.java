package ShKang;

import java.util.Scanner;

public class JavaFestival13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("총금액 입력 : ");
		int money = sc.nextInt();
		System.out.println();

		System.out.println("잔돈 : " + money + "원");
		System.out.println("10000원 : " + money / 10000 + "개");
		System.out.println("5000원 : " + money % 10000 / 5000 + "개");
		System.out.println("1000원 : " + money % 10000 % 5000 / 1000 + "개");
		System.out.println("500원 : " + money % 10000 % 5000 % 1000 / 500 + "개");
		System.out.println("100원 : " + money % 500 / 100 + "개");
	}

}
