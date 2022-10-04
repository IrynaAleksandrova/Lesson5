package Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
//    Создать трехмерный массив из целых чисел. С помощью циклов "пройти" по всему массиву и увеличить каждый
//    элемент на заданное число. Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.

    public static void main(String[] args) {
        int[][][] array = {{{1, 2, 3}, {4, 5, 6, 7}}, {{10, 11, 12, 13}}};
        System.out.println(Arrays.deepToString(array));
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число, на которое необходимо увеличить массив: ");
        int N = console.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += N;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}