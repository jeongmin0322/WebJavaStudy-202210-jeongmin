package backjoon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = -10000;
        int min = 10000;
        int cnt = 0;
        cnt = scanner.nextInt();
        int[] arr = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            arr[i] = scanner.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }

        }
        System.out.println(max+" "+min);
    }
}
