package ShKang;

import java.util.Scanner;

public class JavaFestival21_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("구하고 싶은 약수를 입력하시오 : ");
		int num = sc.nextInt();
		System.out.print(num + "의약수는:");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(" " + i);
			}

		}

	}

}
