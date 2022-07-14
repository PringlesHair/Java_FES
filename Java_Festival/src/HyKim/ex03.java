package HyKim;
import java.util.Random;
public class ex03 {
	
	public static void main(String[] args) {
		int[] num = new int[8];
		Random r = new Random();
		
		for(int i=0; i<num.length; i++) {
			num[i]=r.nextInt(99)+1;
		}
		
		for(int i=0; i<num.length-1; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i]>num[j]) {
					int tmp=num[i];
					num[i]=num[j];
					num[j]=tmp;
				}
			}
		}
		
		System.out.println("가장 큰 값 : "+num[num.length-1]);
		System.out.println("가장 작은 값 : "+num[0]);

	}

}
