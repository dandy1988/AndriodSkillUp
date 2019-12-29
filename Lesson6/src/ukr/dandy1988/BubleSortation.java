package ukr.dandy1988;

import java.util.Arrays;

public class BubleSortation {

    public static void main(String[] args) {
        int[] vector = {4, 3, 2, 1, 6, 0, 67, -4};
 //       int[] vector = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(vector));
        sortBubble(vector);
        System.out.println(Arrays.toString(vector));
    }

    public static void sortBubble(int[] vector) {
        int loop = 0;
        for (int i = 0; i < vector.length; i++) {
            int exit = 0;
            for (int j = 0; j < vector.length - i - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    exit = 1;
                    swap(vector, j, j + 1);
                }
                loop++;
            }
            if (exit==0) break;
        }
        System.out.println("Loop = " + loop);
    }

    private static void swap(int[] vector, int leftIdx, int rightIdx) {
        int tmp = vector[rightIdx];
        vector[rightIdx] = vector[leftIdx];
        vector[leftIdx] = tmp;
    }
}

