package SHyang;

import java.util.Scanner;

public class fes_22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----다이어트 프로그램----");
		System.out.print("현재 몸무게를 입력하시오 : ");
		int pr = sc.nextInt();
		
		System.out.print("목표 몸무게를 입력하시오 : ");
		int go = sc.nextInt();
		
		int i = 0;
		while(pr>go) {
			i++;
			System.out.print(i+"주차 감량 몸무게 입력 : ");
			int m = sc.nextInt();
			pr=pr-m;
			}
		System.out.println(i+"주차 다이어트 성공!!!");

	}
}
