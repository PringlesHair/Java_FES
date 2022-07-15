package EjKIM;

import java.util.Scanner;

public class ex27 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("1번째 입력 : ");
		arr[0] = sc.nextInt();
		System.out.print("2번째 입력 : ");
		arr[1] = sc.nextInt();
		System.out.print("3번째 입력 : ");
		arr[2] = sc.nextInt();
		System.out.print("4번째 입력 : ");
		arr[3] = sc.nextInt();
		System.out.print("5번째 입력 : ");
		arr[4] = sc.nextInt();
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " : ");
			for (int i = 1; i <= arr[j]; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}