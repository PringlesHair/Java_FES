package JisuAn;

import java.util.Scanner;

public class ex17 {
	public static void main(String[] args) {
		System.out.print("사려는 상품개수를 입력하세요>> ");
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();

		int price = 10000;
		double discount = price * 0.1;

		if (cnt >= 11) {
			System.out.println("가격은 " + ((price * cnt) - ((int) discount * cnt)) + "원 입니다.");
		} else {
			System.out.println("가격은 " + price * cnt + "원 입니다.");
		}
	}
}
