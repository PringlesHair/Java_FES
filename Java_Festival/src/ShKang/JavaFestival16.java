package ShKang;

import java.util.Scanner;

public class JavaFestival16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오:");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {

			sum += i;
		}
		System.out.println("1부터" + " " + num + "까지의 합은" + " " + sum + "입니다.");
	}

}
