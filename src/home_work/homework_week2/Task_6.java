package home_work.homework_week2;

import java.util.Scanner;

/**
 * 6  Составить алгоритм определяющий, есть ли среди цифр введенного трехзначного числа — одинаковые.
 * Число вводится с клавиатуры.   Кто не нагуглит как вводить с клавиатуры можно просто принимать int на
 * вход и определять
 * есть ли в нем одинаковые цифры Использовать изученные операторы Метод буленовский возвращает правда или ложь
 */
public class Task_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  number");
        int number = scan.nextInt();
        System.out.println(equalNumbers(number));


    }

    public static boolean equalNumbers (int number) {

        int first = number /100;
        int second = number /10%10;
        int third = number % 10;
  if (first == second || second== third || first ==third ){
      return  true;
    }
        return false;
}}
