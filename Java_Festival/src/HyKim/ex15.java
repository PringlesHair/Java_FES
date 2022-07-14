package HyKim;
import java.util.Scanner;
public class ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("현재금액 : ");
		int money = sc.nextInt();
		int[] change = {10000, 5000, 1000, 500, 100};
		int c = 0;
		System.out.println("잔돈변환");
		for(int i : change) {
			c=money/i;
			System.out.println(i+"원 : "+c+"개");
			money=money%i;

	}
	}
}
