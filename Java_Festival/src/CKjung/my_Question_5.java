package CKjung;

import java.util.Scanner;

public class my_Question_5 {
    public static void main(String[] args) {
		// collatz number
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int number = CollatzNumber(n);
		
		System.out.println(number);
	}
	private static int CollatzNumber(int n) {
		int cnt = 0;
		
		while (n != 1) {
			if (n%2 == 0) {
				n /= 2;
			} else {
				n = n*3 +1;
			}
			cnt++;
			
			if (cnt >= 500) {
				cnt = -1;
				break;
			}
		}
		return cnt;
	}
}
