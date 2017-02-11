package home_work.homework_week_1;

/**
 * 	Дан массив. Вывести на печать только те числа, для которых выполняется условие arr[i] ≤ i.
 */
public class Task_10 {
    public static void main(String[] args) {

        int[] arr = {-3, 2, 3, 4, 8, 1};

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<=i)
                System.out.println(arr[i]);

        }
    }
}