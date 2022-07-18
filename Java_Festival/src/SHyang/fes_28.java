package SHyang;

import java.util.Random;

public class fes_28 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] arr = new int[6];
		
			for(int i=0; i<arr.length; i++) {
				int n = rd.nextInt(45)+1;
				arr[i]=n;
			
				for(int r=0; r<i; r++) {
					if(arr[i]==arr[r]) {
						i--;
						break;
					}
				}
			}
			for(int i=0; i<arr.length; i++) {
				System.out.println("행운의 숫자 : "+arr[i]);
		}
	}
}