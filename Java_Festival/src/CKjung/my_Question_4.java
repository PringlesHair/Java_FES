package CKjung;

import java.util.Scanner;

public class my_Question_4 {
    public static void main(String[] args) {
        // hashad number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isHarshad(n));
    }

    private static boolean isHarshad(int n) {
        int tmp = n;
        int sum = 0;
        while (tmp > 0) {
            sum += tmp % 10;
            tmp /= 10;
        }
        return (n % sum == 0) ? true : false;
    }
}
