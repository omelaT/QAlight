package home_work.homework_week_1;

import java.util.Arrays;

/**
 * 	Дан массив чисел. Заменить все его элементы, большие данного числа Z, этим числом. Подсчитать количество замен
 */
public class Task_7 {
   public static void main(String[] args) {

        int[] arr = {3, 2, 3, 4, 8, 1};
        int z = 3;
        int count=0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > z){
                arr[i]=z;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
