package HyKim;
import java.util.Scanner;
public class ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구하고 싶은 약수를 입력하시오 : ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.print(i + " : ");
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}

	}

}
