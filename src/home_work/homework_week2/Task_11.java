package home_work.homework_week2;

/**
 * Написать программу нахождения суммы большего и меньшего из 3-х чисел.
 */
public class Task_11 {
    public static void main(String[] args) {
        int[] numbers = {3,22,1};
        int min = findMin(numbers);
        int max = findMax(numbers);
        System.out.println(getSumMaxMin(min,max));
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int getSumMaxMin(int min, int max) {
        return min + max;
    }
}
