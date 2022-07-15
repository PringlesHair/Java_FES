package SHyang;

public class fes_12 {

	public static void main(String[] args) {
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 1; i<=100; i++) {
			if(i%2==0) {
				sum1-=i;
				System.out.print(-i+" ");
			}else {
				sum2+=i;
				System.out.print(i+" ");
			}
		}
		System.out.println("\n"+"결과 : "+(sum1+sum2));
	}

}
