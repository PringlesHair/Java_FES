package CKjung;

public class Question_9 {
    public static void main(String[] args) {
        // 단순 메소드 구현 문제

        int num1 = 10;
        int num2 = 2;

        boolean result = isDivide(num1, num2);
        System.out.println("결과 확인 : " + result);
    }

    private static boolean isDivide(int num1, int num2){
        if (num1%num2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
