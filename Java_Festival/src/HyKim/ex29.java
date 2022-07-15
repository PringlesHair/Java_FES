package HyKim;
import java.util.Scanner;
public class ex29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력>>");
		int num = sc.nextInt();
		two(num);
		
	}
	public static void two(int n) {
		if(n==1) {
			System.out.print(n%2);
		}
		else {
			two(n/2);
			System.out.print(n%2);
		}
	}

}
