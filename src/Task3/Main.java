package Task3;

public class Main {
  //    Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов массива.

  public static void main(String[] args) {
    int[][] array = new int[5][5];
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        array[i][j] = (int) (Math.random() * 15);
      }
    }
    int sum = 0;
    for (int i = 0; i < 5; i++, System.out.println()) {
      for (int j = 0; j < 5; j++) {
        System.out.print(array[i][j] + " ");
        int x = array.length;
        for (int[] ints : array) {
          for (int k = 0; k < x; k++) {
            sum += ints[k];
          }
        }
      }
    }
    System.out.println("Общая сумма всех элементова массива равна: " + sum);
  }
}
