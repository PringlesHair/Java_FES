package HyKim;
import java.util.Scanner;
public class ex27 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] star = new int[5];
		for(int i=0; i<5; i++) {
			System.out.print(i+1+"번째 입력 : ");
			star[i] = sc.nextInt();
		}
		for(int i=0; i<5; i++) {
			System.out.print(i+1+" : ");
			for(int j=0; j<star[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
