package home_work.homework_week2;

/**
 * Вычислить площадь правильного шестиугольника со стороной a, используя подпрограмму вычисления площади треугольника
 */
public class Task_13 {
    public static void main(String[] args) {
       int a = 5;
       double hex = 6 * Task_12.triangle(a,a,a);
        System.out.println(hex);
    }
}
