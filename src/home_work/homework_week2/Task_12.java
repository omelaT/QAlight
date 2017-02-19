package home_work.homework_week2;

/**
 * 12 Вычислить площадь треугольника
 *
 */
public class Task_12 {

    public static void main(String[] args) {
        double a= 10;
        double b = 13;
        double c= 22;

        System.out.println(triangle(a,b,c));

    }

    public static double triangle (double a, double b, double c){
        double p = (0.5*(a+b+c));
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
    }
