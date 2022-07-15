package EjKIM;

import java.util.Random;

public class ex03 {

	public static void main(String[] args) {
		int[] arr = new int[8];
		Random rd = new Random();
		int number = rd.nextInt(99) + 1;
		int max = 0;
		int min = 100;

		for (int i = 0; i <= 7; i++) {
			arr[i] = rd.nextInt(99) + 1;
		}
		System.out.print("배열에 있는 모든 값 : ");

		for (int i = 0; i <= 7; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print("가장 큰 값 : ");
		for (int i = 0; i <= 7; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.print(max);
		System.out.println();
		System.out.print("가장 작은 값 : ");
		for (int i = 0; i <= 7; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.print(min);
	}
}
