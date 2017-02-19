package home_work.homework_week2;

/**
 * 15 Написать программу которая возвращает стоимость покупки с учетом дисконта
 */
public class Task_15 {
    public static void main(String[] args) {
        double sum = 500;

        System.out.println(withDiscount(sum));
    }

    public static double withDiscount (double sum){
        double discount  = 10;
        double resultdisk = (sum*discount)/100;
        double result = sum - resultdisk;
        return  result;
    }
}
