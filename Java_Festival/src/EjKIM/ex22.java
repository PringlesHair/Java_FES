package EjKIM;

import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----다이어트 프로그램----");
		System.out.print("현재 몸무게를 입력하시오 : ");
		int pr = sc.nextInt();
		System.out.print("목표 몸무게를 입력하시오 : ");
		int ob = sc.nextInt();
		int cnt = 0;
		while (pr > ob) {
			cnt++;
			System.out.print(cnt + "주차 감량 몸무게 입력 : ");
			int wht = sc.nextInt();
			pr -= wht;
		}
		System.out.print(cnt + "주차 다이어트 성공!!!");
	}

}