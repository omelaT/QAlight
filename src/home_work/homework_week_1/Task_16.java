package home_work.homework_week_1;

import home_work.utils.UtilsWeek1;

import java.util.Arrays;

/**
 * •	Дан массив положительных и отрицательных чисел.
 * Заменить нулями те числа, величина которых по модулю больше максимального числа
 * (|a[i]| > max{ a[0], a[1], ..., a[n]})
 * Math.abs(n) — возвращает модуль числа n.
 */
public class Task_16 {
    public static void main(String[] args) {

        int[] arr = {3, 2, 5, -6, 2, -7};

        int max = UtilsWeek1.findMax(arr);

        for (int i = 0; i <arr.length ; i++) {
            if ( Math.abs(arr[i])> max){
            arr[i]=0;
        }
    }
        System.out.println(Arrays.toString(arr));
}}
