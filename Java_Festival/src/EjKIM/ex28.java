package EjKIM;

import java.util.Random;

public class ex28 {
	public static void main(String[] args) {
		Random r = new Random();
		int [] lotto = new int[6];
		for( int i = 0; i < lotto.length; i++) {
			int rn = r.nextInt(45)+1;
			lotto[i] = rn;
			for (int j = 0; j < i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println("행운의 숫자 : " + lotto[i]);
		}
	}
}
