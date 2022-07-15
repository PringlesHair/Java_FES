package HyKim;

import java.util.Random;

public class ex28 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] rand = new int[5];
		
		for(int i=0; i<5; i++) {
			rand[i]= r.nextInt(100)+1;
			for(int j=0; j<i; j++) {
				if(rand[i]==rand[j]) {
					i-=1;
					break;
				}
			}
		}
		for(int i : rand) {
			System.out.println("행운의숫자 : "+ i);
			
		}
		

	}

}
