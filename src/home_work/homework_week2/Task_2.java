package home_work.homework_week2;

/**
 * 2 написать статический метод double getDistance(x1, y1, x2, y2).
 * Он должен вычислять расстояние между точками. Посмотреть в учебнике геометрии или в интернете
 */
public class Task_2 {
    public static void main(String[] args) {
        double x1= 4;
        double x2 = 7;
        double y1= 8;
        double y2 = 10;
        System.out.println(getDistance(x1, y1, x2, y2));
    }

    public static double  getDistance(double x1, double y1, double x2,  double y2) {

        double pow1 = (x2-x1)*(x2-x1);
        double pow2 = (y2-y1)* (y2-y1);
        double length = Math.sqrt(pow1+ pow2);

        return length;
    }}
