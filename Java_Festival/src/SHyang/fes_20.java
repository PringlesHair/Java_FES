package SHyang;

import java.util.Scanner;

public class fes_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("java 점수 : ");
		int ja = sc.nextInt();
		System.out.print("web 점수 : ");
		int we = sc.nextInt();
		System.out.print("and 점수 : ");
		int an = sc.nextInt();
		
		int sum = ja+we+an;
		System.out.print("java : "+ja+"\n");
		System.out.print("web : "+we+"\n");
		System.out.print("and : "+an+"\n");
		System.out.print("sum : "+sum+"\n");
		System.out.print("avg : "+sum/3);
	}

}
