package Task4;

import java.util.Arrays;

public class Main {
    // Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по возрастанию.

    public static void main(String[] args) {
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random() * 12);
            }
        }
        for (int i = 0; i < 4; i++, System.out.println()) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println();
        for (int[] ints : array) {
            Arrays.sort(ints);
        }
        for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
}

