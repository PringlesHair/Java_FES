package ShKang;

import java.util.Scanner;

public class JavaFestival07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("행 개수 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int j = num; j >= 1; j--) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}