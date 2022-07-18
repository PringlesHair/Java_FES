package ShKang;

import java.util.Scanner;

public class JavaFestival17_ {

	public static void main(String[] args) {

		// 10000원짜리 구입

		// 11개 이상 구입시 10%할인

		Scanner sc = new Scanner(System.in);

		System.out.print("사려는 상품개수를 입력하세요 >> ");

		int num = sc.nextInt();
        int price = 10000;
        int price2 = 1;
        price2 = price * num;

		if (num >= 11) {

			price2 = price2 - (price2 / 10);

		}

		System.out.println("가격은 " + price2 + "원 입니다.");

	}

}