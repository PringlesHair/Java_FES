import java.util.Arrays;
import java.util.Random;

public class Question_3 {
    public static void main(String[] args) {
        Random rd = new Random();
        int arr[] = new int[8];
        int max = 0;
        int min = 100;

        loop_ver(rd, arr, max, min); // loop를 이용한 풀이
        // sort_ver(rd, arr); // Arrays.sort를 이용한 방법
    }

    private static void loop_ver(Random rd, int arr[], int max, int min) {
        // for문을 이용한 루프 -- 이쪽이 효율성면에서 우월
        System.out.print("배열에 있는 모든 값 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(99) + 1;
            System.out.print(arr[i] + " ");
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println("가장 큰 값 : " + max);
        System.out.println("가장 작은 값 : " + min);
    }

    private static void sort_ver(Random rd, int arr[]) {
        // Arrays.sort를 이용한 방법
        // https://crazykim2.tistory.com/462
        System.out.print("배열에 있는 모든 값 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(99) + 1;
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr); // 배열 정렬
        System.out.println();
        System.out.println("가장 큰 값 : " + arr[arr.length - 1]);
        System.out.println("가장 작은 값 : " + arr[0]);
    }

    /*
     * public static void Stream_ver(Random rd, int arr[]){
     * // Stream을 이용한 방법은 나중에 알아보는걸로...
     * // https://mangkyu.tistory.com/111
     * // https://mangkyu.tistory.com/112?category=872426
     * }
     */
}
