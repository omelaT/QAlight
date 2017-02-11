package home_work.homework_week_1;

/**
 * Дан массив чисел. Вывести те числа, у которых остаток от деления на число М равен L.
 */
public class Task_11 {
    public static void main(String[] args) {

        int[] arr = {-3, 2, 3, 4, 8, 1};
        int m= 2;
        int l=1;

        for (int i = 0; i <arr.length; i++) {

            if (arr[i]%m ==l){
                System.out.println(arr[i]);
            }
        }
    }
}
