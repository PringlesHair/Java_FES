package HyKim;
import java.util.Scanner;
public class ex17 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("사려는 상품개수를 입력하세요 >> ");
		int n = sc.nextInt();
		int price=0;
		
		price=n>=10 ? 9000*n : 10000*n;
		System.out.println("가격은 "+price + "원 입니다.");
		

	}

}
