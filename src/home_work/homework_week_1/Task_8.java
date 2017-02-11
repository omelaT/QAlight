package home_work.homework_week_1;

/**
 * Дан массив чисел. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */
public class Task_8 {
    public static void main(String[] args) {

        int[] arr = {3, 0, -5, -2, 0, 2, 3, 4, 8, 1};
        int countMinus = 0;
        int countZero = 0;
        int countPlus = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) countMinus++;
            if (arr[i] == 0) countZero++;
            if (arr[i] > 0) countPlus++;
        }
        System.out.println(countMinus);
        System.out.println(countZero);
        System.out.println(countPlus);
    }
}
