package ShKang;

public class JavaFestival12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
				sum1 += i;
			} else {
				System.out.print(-i + " ");
				sum2 -= i;
			}
		}
		System.out.println();
		System.out.println("결과 : " + (sum1 + sum2));
	}

}
