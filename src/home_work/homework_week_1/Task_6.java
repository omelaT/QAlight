package home_work.homework_week_1;

import home_work.utils.UtilsWeek1;

import java.util.Arrays;

/**
 * Дан массив чисел. Выяснить, отсортирован ли он по возрастанию.
 */
public class Task_6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,9,356};
        int[] arr2 = {1,2,36,4,52,7,9,356};
        System.out.println(UtilsWeek1.isSorted(arr));
        System.out.println(UtilsWeek1.isSorted(arr2));

    }

}
