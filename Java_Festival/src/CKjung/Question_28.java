package CKjung;

import java.util.Random;

public class Question_28 {
    public static void main(String[] args) {
        // 단순 구현문제인데 조금 어려울 수도 있어요
        //  편하신 방식대로 구현해보세요
        Random rd = new Random();

        int lotto [] = new int [6];

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = rd.nextInt(45)+1; // 배열에 랜덤값 저장
            for (int j = 0; j < i; j++) { // 현재 값 전까지 저장한 배열 값을 검사
                if (lotto[j] == lotto[i]) { // 중복값이 있으면
                    i--; // index 값을 줄이고 다시 뽑도록
                    break;
                }
            }
        }

        for (int i = 0; i < lotto.length; i++) {
            System.out.println("행운의 숫자 : " + lotto[i]);
        }
    }
}
