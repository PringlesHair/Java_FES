package HyKim;

public class ex16 {

	public static void main(String[] args) {
		int start=2;
		int end=1000;
		getPerfectNumber(start, end);

	}
	public static void getPerfectNumber(int start, int end) {
		int sum=0;
		System.out.print(start+"~"+end+"까지의 완전수 : ");
		for(int i=start; i<=end; i++) {
			for(int j=1; j<i; j++) {
				if(i%j==0) {
					sum+=j;
				}
			}
			if(sum==i) {
				System.out.print(i+" ");
			}
			sum=0;
		}
		
	} 
}
