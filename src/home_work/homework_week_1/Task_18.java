package home_work.homework_week_1;

import home_work.utils.UtilsWeek1;

import java.util.Arrays;

/**
 * Дан массив чисел. Среди них есть равные. Найти первый максимальный элемент массива и заменить его нулем
 */
public class Task_18 {
    public static void main(String[] args) {

        int[] arr = {3, 2, 10, 2, 10, -1};
        int  n = 0;

        int max = UtilsWeek1.findMax(arr);

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==max){
                arr[i] = 0;
                break;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
