package CKjung;
import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        // 이건 입맛에 맞게 구현하시는게...
        Scanner sc = new Scanner(System.in);
        String gisa_class[] = { "class1", "class2", "class3", "class4", "class5" }; // 소프트웨어 설계 , 개발 ...
        int score[] = new int[gisa_class.length];

        for (int i = 0; i < gisa_class.length; i++) {
            System.out.print((i + 1) + " " + gisa_class[i] + " >> ");
            score[i] = sc.nextInt();
        }

        int score_sum = 0;
        boolean flag = true;

        for (int i : score) {
            if (i < 8) {
                System.out.println("you failed");
                flag = false;
            }
            score_sum += i;
        }
        if (flag) {
            if (score_sum >= 60) {
                System.out.println("you passed");
            } else {
                System.out.println("you failed");
            }
        }

        sc.close();
    }
}
