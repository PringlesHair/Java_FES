package CKjung;

import java.util.Scanner;

public class Question_20 {
    public static void main(String[] args) {
        // 단순 구현
        Scanner sc = new Scanner(System.in);

        int score [] = new int [3];
        String student_class [] = {"java", "web", "and"};

        for (int i = 0; i < student_class.length; i++) {
            System.out.print(student_class[i] + " 점수 : ");
            score[i] = sc.nextInt();
        }

        int total = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.println(student_class[i] + " : " + score[i]);
            total += score[i];
        }
        System.out.println("sum : " + total);
        System.out.println("avg : " + (int) total/score.length);

        sc.close();
    }
}
