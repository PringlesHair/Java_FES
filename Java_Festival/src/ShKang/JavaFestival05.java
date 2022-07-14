package ShKang;

import java.util.Scanner;

public class JavaFestival05 {

	public static void main(String[] args) {

		// 공배수

		// 5 = 5,10,15,20,25,30,~~

		// 6 = 6,12,18,24, 30, ~~

		// 공약수

		// 12 = 1,2,3,4,6,12

		// 28 = 1,2,4,7,12,14,28

		// 두 수입력

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 1 입력 : ");

		int num1 = sc.nextInt();

		System.out.print("숫자 2 입력 : ");

		int num2 = sc.nextInt();

		int min = 0;

		int max = 0;

		for (int i = 2; i <= num1 && i <= num2; i++) {

			// System.out.print(i+"\t");

			// 두값이 0으로 겹칠때가 되면

			if (num1 % i == 0 && num2 % i == 0) {

				max = i;

				// System.out.print(i+"\t");

			}

		}

		// 최소공배수 공식( a * b / 최대공약수 )

		min = num1 * num2 / max;

		System.out.println("최대 공약수 : " + max);

		System.out.println("최소 공배수 : " + min);

	}

}
