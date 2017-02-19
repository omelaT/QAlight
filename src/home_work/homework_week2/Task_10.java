package home_work.homework_week2;

/**
 *  Вывести на экран строку S указанное количество раз N
 */
public class Task_10
{
    public static void main(String[] args) {
        int number = 3;
        String str ="string1";

        stringNum(number, str);
    }

    public static void stringNum (int number, String  str) {

        for (int i = 0; i <number; i++) {
            System.out.println(str);

        }
    }
}
