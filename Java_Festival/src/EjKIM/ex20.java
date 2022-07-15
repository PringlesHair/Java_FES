package EjKIM;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.print("java 점수 : ");
		arr[0] = sc.nextInt();
		System.out.print("web 점수 : ");
		arr[1] = sc.nextInt();
		System.out.print("and 점수 : ");
		arr[2] = sc.nextInt();
		int sum = arr[0] + arr[1] + arr[2];
		System.out.println("java : " + arr[0]);
		System.out.println("web : " + arr[1]);
		System.out.println("and : " + arr[2]);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + sum / arr.length);
	}

}