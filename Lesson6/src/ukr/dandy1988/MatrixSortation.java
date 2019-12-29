package ukr.dandy1988;

import java.util.Arrays;
import java.util.Random;

public class MatrixSortation {

        public static void main(String[] args) {
            int[][] vector = new int[10][10];

            for (int i = 0; i < vector.length; i++) {
                for (int j = 0; j < vector[i].length; j++) {
                    vector[i][j] = new Random().nextInt(100);
                }
            }
            System.out.println("Unsorted matrix:");
            printArray(vector);
            sortMatrix(vector);
            System.out.println("Output sorted matrix:");
            printArray(vector);

        }

        public static void printArray(int[][] inputVector) {
            for (int i = 0; i < inputVector.length; i++) {
                for (int j = 0; j < inputVector[i].length; j++) {
                    System.out.print(inputVector[i][j] + " | ");
                }
                System.out.println();
            }
        }

        public static int[][] sortMatrix(int[][] vector) {

            int[] matrixLine = new int[vector.length*vector[0].length];
            int index = 0;
            for (int i = 0; i < vector.length; i++) {
                for (int j = 0; j < vector[i].length; j++) {
                    matrixLine[index] = vector[i][j];
                    index++;
                }
            }
//            System.out.println(Arrays.toString(matrixLine));

            for (int i = 0; i < matrixLine.length; i++) {
                for (int j = 0; j < matrixLine.length - i - 1; j++) {
                    if (matrixLine[j] > matrixLine[j + 1]) {
                        swap(matrixLine, j, j + 1);
                    }
                }
            }
//            System.out.println(Arrays.toString(matrixLine));

            int[][] outputVector = vector;
            int n = 0;
            for (int i = 0; i < outputVector.length; i++) {
                for (int j = 0; j < outputVector[i].length; j++) {
                    outputVector[i][j] = matrixLine[n];
                    n++;
                }
            }

            return outputVector;

        }

        private static void swap(int[] vector, int leftIdx, int rightIdx) {
            int tmp = vector[rightIdx];
            vector[rightIdx] = vector[leftIdx];
            vector[leftIdx] = tmp;
        }

}
