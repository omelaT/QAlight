package home_work.homework_week_1;

import home_work.utils.UtilsWeek1;

import java.util.Arrays;

/**
 * 	Дан целочисленный массив чисел. Найти сумму элементов, кратных данному числу K.
 */
public class Task_2 {
    public static void main(String[] args) {
        int[] array= UtilsWeek1.createAnfFillRandomArray(10);
        System.out.println(Arrays.toString(array));
        int res = UtilsWeek1.getSum(array, 2);
        System.out.println(res);
    }


}

