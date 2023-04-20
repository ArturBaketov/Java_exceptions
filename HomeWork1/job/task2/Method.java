package task2;

/*
    1. Если передать не коректный по размерам двумерный массив
    (Если arr.length будет больше или меньше 5)
    2. Если в дву мерном массиве будут не целочисленные значения, буквы, символы или null
    3. Если суммарное число будет больше 2 147 483 647 или меньше -2147483647
*/

public class Method {

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
