package home_work.homework_week_1;

import home_work.utils.UtilsWeek1;

/**
 *Дан массив чисел. Найти  mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1]). Сумму минимального и максимальноjuj
 */
public class Task_14 {
    public static void main(String[] args) {

        int[] arr = {3, 2, 5, 4, 2, 1};
         int sum= UtilsWeek1.findMax(arr) +UtilsWeek1.findMin(arr);

        System.out.println(sum);









    }
}
