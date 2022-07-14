package HyKim;
import java.util.Scanner;
public class ex14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int n = sc.nextInt();
		int [][] arr = new int[n][n];
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=n*j+i+1;
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
