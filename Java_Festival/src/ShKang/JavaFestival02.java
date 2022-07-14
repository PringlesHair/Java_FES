package ShKang;

import java.util.Scanner;

public class JavaFestival02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력>>>");
		int input = sc.nextInt();
		if (input % 4 == 0 && input % 100 != 0) {
			System.out.println("윤년");
		} else if (input % 100 != 0 && input % 400 == 0) {
			System.out.println("윤년");
		} else {
			System.out.println("윤년 아님");
		}
	}

}
