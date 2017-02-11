package home_work.utils;

/**
 * Created by User on 05.02.2017.
 */
public class UtilsWeek1 {
    public static int[] createAnfFillRandomArray(int size) {
        // create array
        int[] array = new int[size];
        // fill array
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 30);
        }
        return array;
    }

    // Дано два числа. Найти минимальное число из них.
    public static String getMin(int a, int b) {
        if (a > b) {
            return "Smaller is b: " + b;
        }
        return "Smaller is a: " + a;
    }

    //Дан целочисленный массив чисел. Найти сумму элементов, кратных данному числу K.
    public static int getSum(int[] array, int k) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                result += array[i];
            }
        }
        return result;
    }

    // 	В целочисленном массиве есть нулевые элементы. Создать массив из номеров этих элементов.
    public static int[] createArrNull(int[] arr) {
        int[] temp = new int[arr.length]; // создаю новый массив с такой же длиной как входящий
        int count = 0; //cоздаем перменную счетчик сколько раз выполнилось условие в цикле
        for (int i = 0; i < arr.length; i++) { // цикл
            if (arr[i] == 0) { // услловие, ЧТО и-тый эл-т входящего массива равен нулю
                temp[count] = i;// если условие выше выполнилось, записываем в массив темп, в ячейку каунт i
                count++;// увеличиваем каунт
            }
        }
        int[] res = new int[count];
        for (int i = 0; i < res.length; i++) {
            res[i] = temp[i];
        }
        return res;
    }

    // 	Дан целочисленный массив чисел (положительных и отрицательных).
    // Выяснить, какое число встречается раньше – положительное или отрицательное.
    public static String firstNum(int[] arr) {

        if (arr[0] < 0) {
            return "отрицательное";
        } else {
            return "положительное";
        }
    }

    // 	Дан массив чисел. Создать массив из четных чисел этого массива.
    // Если таких чисел нет, то вывести сообщение об этом факте.
    public static int[] createArrEvenNumbers(int[] arr) {
        int[] temp = new int[arr.length]; // создаю новый массив с такой же длиной как входящий
        int count = 0; //cоздаем перменную счетчик сколько раз выполнилось условие в цикле
        for (int i = 0; i < arr.length; i++) { // цикл
            if (arr[i] % 2 == 0) { // услловие, ЧТО и-тый эл-т входящего массива четный
                temp[count] = arr[i];// если условие выше выполнилось, записываем в массив темп, в ячейку каунт i
                count++;// увеличиваем каунт
            }
        }
        if (count == 0) {
            System.out.println("no even elements");
        }
        int[] res = new int[count];
        for (int i = 0; i < res.length; i++) {
            res[i] = temp[i];
        }
        return res;
    }
// 	Дан массив чисел. Выяснить, отсортирован ли он по возрастанию.


    public static boolean isSorted(int[] arr) {
        boolean res = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                res = true;
            } else {
                return false;
            }
        }
        return res;
    }
    //Дан массив чисел. Поменять местами наибольший и наименьший элементы.

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findIndexByValue(int[] arr, int value) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
            }
        }
        return index;
    }

    public static int[] swapMinMax(int[] arr) {
        int maxIndex = findIndexByValue(arr, findMax(arr));
        int minIndex = findIndexByValue(arr, findMin(arr));
        int temp = arr[maxIndex];
        arr[maxIndex] = findMin(arr);
        arr[minIndex] = temp;
        return arr;
    }

    /* новый массив больше на число */

    public static int[] createNewArray(int size) {
        int k = 333;
        // create array
        int[] array = new int[size];
        // fill array
        for (int i = 0; i < array.length+1; i++) {

            array[array.length + 1] = k;

        }
        return array;


    }

}
