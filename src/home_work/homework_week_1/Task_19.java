package home_work.homework_week_1;

import home_work.utils.UtilsWeek1;

import java.util.Arrays;

/**
 * Дан массив чисел.
 * Образовать новый массив, элементами которого будут элементы исходного, оканчивающиеся на цифру k.
 */
public class Task_19 {
    public static void main(String[] args) {

        int[] arr = {3, 2, 10, 2, -3, -1};
        int k=222;

        int[] arr2 = new  int [arr.length +1];
        arr2[arr2.length-1]= k;

        for (int i = 0; i <arr.length ; i++) {
            arr2[i]=arr[i];
        }
        System.out.println(Arrays.toString(arr2));

    }
}
