package CKjung;

import java.util.Scanner;

public class Question_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("소인수분해 할 수를 입력하세요 : ");
        int num = sc.nextInt();

        String result = use_loop(num); // 반복문을 이용한 풀이
        // 해당문제는 소수를 굳이 구할 필요는 없지만 소수 구하는 알고리즘은 한번쯤은 꼭 찾아보시길 추천드립니다~

        System.out.println(num + " = " + result);

        sc.close();
    }

    private static String use_loop(int num){
        String val = "";
        int prime = 2; // 가장 작은 소수는 2
        while (num > 1) {
            if (num%prime == 0) {
                // 현재 num이 현재 소수로 나눠 떨어진다면 (소수*)을 val에 저장
                val += prime + "*";
                // 현재 num을 소수로 나눠줘서 반복시킴
                num /= prime;
            }else{
                // 나눠 떨어지지 않으면 소수값을 증가시킴
                prime++;
            }
        } // 반복문이 끝났을 때 val == 2*2*5* 형태로 마지막에 별이 들어감

        // String result = use_arr(val); // 배열을 이용해 마지막 별 빼주기
        String result = use_sub(val); // 함수 이용

        return result;
    }

    private static String use_arr(String val){
        // 마지막 별을 빼기 위해 배열을 사용하는 방법
        String val_arr []= val.split(""); // 마지막 *을 빼주기 위해 val를 배열로 만듬
        String result = "";

        for (int i = 0; i < val_arr.length-1; i++) { // 
            result += val_arr[i];
        }

        return result;
    }

    private static String use_sub(String val){
        // 마지막 별을 빼기 위해 String 클래스의 substring함수 이용
        return val.substring(0, val.length()-1);
    }
}
