package ShKang;

public class JavaFestival25 {

	public static void main(String[] args) {

		int input = 8;

		for (int i = 1; i <= input; i++) {

			System.out.print(fibo(i) + " ");

		}

	}

	public static int fibo(int num) {

		if (num <= 1) {

			return num;

		} else {

			return fibo(num - 2) + fibo(num - 1);

		}

	}

}
