package CKjung;

import java.util.Scanner;

public class Question_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int n = sc.nextInt();

        // String result = use_loop(n); // 단순 반복문을 이용한 풀이인데 보니까 재귀로도 풀겠네용 한번 해보시는 것두.. 저는 재귀를 못해서
        String result = use_func(n); 

        System.out.println(result);
        sc.close();
    }

    private static String use_loop(int n){
        String answer = "";
        while (n > 0) {
            answer = n%2 + answer;
            n /= 2;
        }
        return answer;
    }

    private static String use_func(int n){
        // Integer class의 toBinaryString 함수 이용
        return Integer.toBinaryString(n);
    }
}
