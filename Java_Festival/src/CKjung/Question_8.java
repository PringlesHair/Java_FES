package CKjung;

import java.util.Arrays;

public class Question_8 {
    public static void main(String[] args) {
        int point[] = { 92, 32, 52, 9, 81, 2, 68 };

        use_loop(point); // 중첩 반복문을 이용한 풀이
        use_sort(point); // 정렬을 이용하는 방법!! (유리씨 도움)
    }

    private static void use_loop(int point[]) {
        int first_idx = 0;
        int second_idx = 0;
        int dist = Math.abs(point[0] - point[1]); // 배열 내 최솟값을 찾는 알고리즘 생각하면 좋을 듯

        /*
         * 더 효율적인 풀이 고민해 봐야 될듯
         * 반복문을 도는 동안 각각의 value 값들끼리의 거리를 계산해서
         * 최소 거리와 비교하여 더 작으면 최소거리를 치환하고 각각의 인덱스를 저장
         */

        for (int i = 0; i < point.length - 1; i++) {
            for (int j = i + 1; j < point.length; j++) {
                int dist_tmp = Math.abs(point[i] - point[j]); // 거리 비교를 위한 계산
                if (dist_tmp < dist) { // 현재 최소 거리보다 작으면
                    dist = dist_tmp; // 거리 치환
                    first_idx = i; // 인덱스 치환
                    second_idx = j;
                }
            }
        }
        System.out.println("result = [" + (first_idx) + ", " + (second_idx) + "]");
    }

    private static void use_sort(int point[]) {
        int first_idx = 0;
        int second_idx = 0;
        int first_val = 0;
        int second_val = 0;

        int sorted_arr[] = point.clone();
        Arrays.sort(sorted_arr);
        int dist = 999;

        for (int i = 0; i < sorted_arr.length - 1; i++) {
            int dist_tmp = Math.abs(sorted_arr[i] - sorted_arr[i + 1]);
            if (dist > dist_tmp) {
                dist = dist_tmp;
                first_val = sorted_arr[i];
                second_val = sorted_arr[i + 1];
            }
        }

        for (int i = 0; i < point.length; i++) {
            if (point[i] == first_val) {
                first_idx = i;
            } else if (point[i] == second_val) {
                second_idx = i;
            }
        }
        System.out.println("result = [" + (first_idx) + ", " + (second_idx) + "]");
    }
}
