package home_work.homework_week_1;

import home_work.utils.UtilsWeek1;

import java.util.Arrays;

/**

 - В целочисленном массиве есть нулевые элементы. Создать массив из номеров этих элементов.
 */
public class Task_3 {
    public static void main(String[] args) {
        int[] arr = {1,6,0,5,0,7,8,0};
        int[] res = UtilsWeek1.createArrNull(arr);
        System.out.println(Arrays.toString(res));
    }
}
