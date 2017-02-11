package home_work.homework_week_1;

/**
 * Дан массив чисел с положительными и отрицательными элементы.
 * Вычислить произведение отрицательных элементов P1 и произведение положительных элементов Р2.
 * Сравнить модуль Р2 с модулем Р1 и указать, какое из произведений по модулю больше.
 *
 * Math.abs(n) — возвращает модуль числа n.
 */
public class Task_17 {
    public static void main(String[] args) {

        int[] arr = {3, 2, -10, 2, -3,-1};

        int multip1 = 1;
        int multip2 = 1;
// произведение положительных
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                multip1 = multip1 * arr[i];
            }
        }
        System.out.println(multip1);
// произведение отрицательных
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                multip2 = multip2 * arr[i];
            }
        }
        System.out.println(multip2);
// сравниваю по модулю
        if  (Math.abs(multip1) > Math.abs(multip2)){
            System.out.println("это число по  модулю больше " + multip1 );
        } else
        {
            System.out.println("это число по  модулю больше  " + multip2 );
        }
    }
}