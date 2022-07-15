package SHyang;

public class fes_31 {

	public static void main(String[] args) {
        int num1 = 50;
        int num2 = 15;
        char op = '-';

        System.out.println(cal(num1, num2, op));
    }

    private static int cal(int n1, int n2, char o){

        if (o == '+') {
            return n1+n2;
        }else if (o == '-') {
            return n1-n2;
        }else if (o == '*') {
            return n1*n2;
        }else{
            return n1/n2;
        }
    }
}