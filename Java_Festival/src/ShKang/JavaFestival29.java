package ShKang;

import java.util.Scanner;

public class JavaFestival29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자입력 >> ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		// 2진수의 수를 저장할 배열 생성
		int[] arr = new int[10];

		int i = 0; // 배열의 위치를 지정하기 위한 값

		while (input >= 2) {
			// 배열의 위치가 0인 곳부터 차례로 2로 나누어진 나머지 값을 저장
			arr[i] = input % 2;
			i++;
			// 입력값의 몫을 구할 수 있는 연산
			input /= 2;
		}

		arr[i] = input;

		// 배열의 순서를 거꾸로 하여 출력하기
		for (int j = i; j >= 0; j--) {
			System.out.print(arr[j] + " ");
		}
	}

}
