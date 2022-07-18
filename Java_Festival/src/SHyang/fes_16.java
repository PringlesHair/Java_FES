package SHyang;

public class fes_16 {
	public static void main(String[] args) {
		
		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);
	}
	
	public static void getPerfectNumber(int startValue, int endValue) {
		System.out.print(startValue+"~"+endValue+"까지의 완전수 : ");
		
		
		for(int r=1; r<=endValue; r++) {
			int sum = 0;
			for(int i=1; i<r; i++) {
				if(r%i==0) {
					sum+=i;
				}
			}
			if(sum==r) {
				System.out.print(r+" ");
			}
		}
	}
}