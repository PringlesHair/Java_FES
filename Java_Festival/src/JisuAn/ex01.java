package JisuAn;

import java.util.Scanner;

public class ex01 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수입력 : ");
			int num1 = sc.nextInt();
			
			System.out.print("결과 : " + (num1 - (num1 % 100)));
		}
}
