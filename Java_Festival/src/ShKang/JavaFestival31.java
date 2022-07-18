package ShKang;

public class JavaFestival31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 50; // 숫자1
		int num2 = 15; // 숫자2
		char op = '*'; // 어떤 연산을 수행할 건지 연산자

		System.out.println(cal(num1, num2, op));

	}

	private static int cal(int num1, int num2, char op) {
		// TODO Auto-generated method stub
		int result = 0;
		// 1. 매개변수로 받아온 op가 +라면
		// 2. num1과 num2를 더한 값을 result에 담아주기
		// 3. op가 -라면
		// 4. num1과 num2를 뺀 값을 result에 담아주기
		// 5. op가 *라면
		// 6. num1과 num2를 곱한 값을 result에 담아주기
		// 7. op가 /라면
		// 8. num1과 num2를 나눈 몫을 result에 담아주기
//		if(op=='+') {
//			result = num1+num2;
//		} else if(op=='-') {
//			result = num1>num2 ? num1-num2 : num2-num1;
//		} else if(op=='*') {
//			result = num1*num2;
//		} else if(op=='/') {
//			result = num1/num2;
//		} else {
//			
//		}
		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 > num2 ? num1 - num2 : num2 - num1;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:

		}

		return result;
	}

}