package home_work.homework_week2;

/**
 *  Написать метод возвращающий факториал заданного числа N
 */
public class Task_1 {
    public static void main(String[] args) {
        int k = 5;
        System.out.println( factorial(k));

    }

    public static int factorial(int k){
        int count =1;
        for (int i = 1; i <= k; i++) {
            count*=i;
        }
        return count;
    }
}

