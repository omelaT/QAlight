package home_work.homework_week_1;

import home_work.utils.UtilsWeek1;

import java.util.Arrays;

/**
 * 	Дан массив чисел. Создать массив из четных чисел этого массива.
 * Если таких чисел нет, то вывести сообщение об этом факте.
 */
public class Task_5 {
    public static void main(String[] args) {
        int[] arr = {1,5,5,5,5,7,9,7};
        int[] res = UtilsWeek1.createArrEvenNumbers(arr);
        System.out.println(Arrays.toString(res));
    }
}
