package CKjung;

public class Question_31 {
    public static void main(String[] args) {
        // 단순구현문제
        int num1 = 50;
        int num2 = 15;
        char oper = '-';

        System.out.println(cal(num1, num2, oper));
    }

    private static int cal(int n, int m, char o){

        if (o == '+') {
            return n+m;
        }else if (o == '-') {
            return n-m;
        }else if (o == '*') {
            return n*m;
        }else {
            return n/m;
        }
    }
}
