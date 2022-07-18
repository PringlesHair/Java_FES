package SHyang;

import java.util.Scanner;

public class fes_29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력>>");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int i = 0;
		int j = 0;
		while(num !=1) {
			arr[i] = num % 2;
			num /= 2;
			if(num == 1) {
				arr[i+1] = 1;
				j = i + 1;
			}
			i++;
		}
		for(int k = j; k>=0; k--) {
			System.out.print(arr[k]+ " ");
		}
	}
}
