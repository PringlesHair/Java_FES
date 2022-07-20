package CKjung;

import java.util.Scanner;

public class Question_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("구하고 싶은 약수를 입력하시오 : ");
        int num = sc.nextInt();

        use_usual(num); // 출력 형식을 지켜야 한다면 이렇게
        // use_square(num);

        sc.close();
    }

    private static void use_usual(int num){
        System.out.print(num + "의 약수는 : ");
        for (int i = 1; i <= num; i++) {
            if (num%i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // 요런 식으로 약수 구하는 알고리즘은 다른데서도 써먹으세용
    private static void use_square(int num){
        System.out.print(num + "의 약수는 : ");
        for (int i = 1; i < Math.sqrt(num)+1; i++) {
            if (num % i == 0) {
                if (num/i != i) {
                    System.out.print(i + " ");
                    System.out.print(num/i + " ");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
