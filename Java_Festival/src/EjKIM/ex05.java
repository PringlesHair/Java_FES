package EjKIM;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("최대 공약수 & 최소 공배수 구하기");
		System.out.print("숫자 1입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("숫자 2입력 >> ");
		int num2 = sc.nextInt();
		int ans1 = 0;
		for(int i = 1; i <= num1; i++) {
			if(num1%i == 0 && num2%i == 0) {
				ans1 = i;
			}
		}
		int ans2 = num1*num2/ans1;
		System.out.println("최대공약수 : " + ans1);
		System.out.println("최소공배수 : " + ans2);
	}

}
