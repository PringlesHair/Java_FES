package ShKang;

import java.util.Scanner;

public class JavaFestival22_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("현재몸무게 : ");
		int weight = sc.nextInt();

		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();

		int week = 1;

		while (true) {
			System.out.print(week + "주차 감량 몸무게 : ");
			int weight2 = sc.nextInt();
			week++;
			weight -= weight2;

			if (weight <= goal) {
				System.out.println(week - 1 + "주차 다이어트 성공!!!");
				break;
			}
		}
	}

}
