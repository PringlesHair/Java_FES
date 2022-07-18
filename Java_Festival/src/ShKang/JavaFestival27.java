package ShKang;

import java.util.Scanner;

public class JavaFestival27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + "번째 입력 : ");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " : ");
			for (int j = 1; j <= arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
