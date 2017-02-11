package home_work.homework_week_1;

import java.util.Arrays;

/**
 * Дан массив чисел, среди которых имеется один нуль. Вывести на печать все числа, включительно до нуля.
 */
public class Task_13 {
    public static void main(String[] args) {

        int[] arr = {-3, 2, 3, 0, 8, 1, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                break;
            }
            System.out.println(arr[i]);
        }
    }
}
