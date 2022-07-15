package EjKIM;

import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구하고 싶은 약수를 입력하시오. : ");
		int num = sc.nextInt();
		System.out.print(num + "의 약수는 : ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
