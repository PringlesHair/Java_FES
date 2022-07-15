package SHyang;

import java.util.Scanner;

public class fes_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("최대 공약수 & 최소 공배수 구하기");
		System.out.print("숫자1 입력 >> ");
		int fr =sc.nextInt();
		System.out.print("숫자2 입력 >> ");
		int se =sc.nextInt();
		
		int max = 0;
		
		for(int y = 2; y<=se; y++) {
			for(int x = 2; x<=fr; x++) {
				if (fr%x==0 && se%y==0) {
					if(x==y) {
						if(max<x) {
							max = x;
						}
					}
				}
			}
		}System.out.print("최대공약수 : "+max+"\n");
		
		int num1 = fr/max;
		int num2 = se/max;
		System.out.print("최소공배수 : "+max*num1*num2);
		
		
	}
}
