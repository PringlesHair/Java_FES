package EjKIM;

import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사려는 상품 개수를 입력하세요 >> ");
		int num = sc.nextInt();
		if (num >= 11) {
			System.out.print("가격은 " + (int) (10000 * num * 0.9) + "원 입니다.");
		} else {
			System.out.print("가격은 " + 10000 * num + "원 입니다.");
		}
	}

}