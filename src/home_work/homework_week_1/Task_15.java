package home_work.homework_week_1;

/**
 * Дан массив целых положительных чисел.
 * Найти произведение только тех чисел, которые больше заданного числа М.
 * Если таких нет, то выдать сообщение об этом.
 */
public class Task_15 {
    public static void main(String[] args) {

        int[] arr = {3, 2, 5, 4, 2, 1};
        int m = 3;
        int multip = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > m) {
                multip = multip * arr[i];
            }
        }
        System.out.println(multip);
    }
}
