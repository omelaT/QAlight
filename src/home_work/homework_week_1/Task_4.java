package home_work.homework_week_1;

import home_work.utils.UtilsWeek1;

/**
 * •	Дан целочисленный массив чисел (положительных и отрицательных).
 * Выяснить, какое число встречается раньше – положительное или отрицательное.
 */
public class Task_4 {
    public static void main(String[] args) {
        int[] arr = {-1, -6, 0, 5, -10, 7, 8, 0};
        System.out.println(UtilsWeek1.firstNum(arr));
    }
}

