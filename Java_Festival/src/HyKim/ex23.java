package HyKim;
import java.util.Scanner;
public class ex23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int n=sc.nextInt();
		int mul=1;
		for(int i=1; i<=n; i++) {
			mul*=i;
		}
		System.out.println("출력 : "+mul);
		
	}

}
