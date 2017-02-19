package home_work.homework_week2;

/**
 * 14 Написать программу вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class Task_14 {

    public static void main(String[] args) {
        int sum = getSumOfOddFactorial();
        System.out.println(sum);
    }

    public static int getSumOfOddFactorial(){
        int sum = 0;
        for (int i = 1; i < 9; i++) {
            if (i%2 != 0) {
                sum += factorial(i);
            }

        }
        return sum;
    }

        public static int factorial(int num){
            int count = 1;
            for (int i = 1; i <= num; i++) {
                count*=i;
            }
            return count;
        }
    }