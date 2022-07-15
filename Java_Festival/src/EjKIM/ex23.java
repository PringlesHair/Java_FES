package EjKIM;

import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		int pro = 1;
		for (int i = 1; i <= num; i++) {
			pro *= i;
		}
		System.out.print("출력 : " + pro);
	}

}