package home_work.homework_week_1;

import java.util.Arrays;

import static home_work.utils.UtilsWeek1.swapMinMax;

/**
 * Дан массив чисел. Поменять местами наибольший и наименьший элементы.
 */
public class Task_9 {
    public static void main(String[] args) {

        int[] arr = {3, 2, 3, 4, 8, 1};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(swapMinMax(arr)));
    }
}

