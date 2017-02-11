package home_work.homework_week_1;

import java.util.Arrays;

/**
 *Дан массив чисел.  Поменять местами соседние элементы (а[0] и а[1], а[2] и а[3], …)
 */
public class Task_12 {
    public static void main(String[] args) {

        int[] arr = {-3, 2, 3, 4, 8, 1,1};

        for (int i = 0; i <arr.length-1 ; i++) {
           int temp=arr[i];
           arr[i]=arr[i+1];
           arr[i+1]=temp;
           i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
