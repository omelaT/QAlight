package home_work.homework_week2;

/**
 * 5 Задача для тех кто следить за фигурой))) Написать программу которая вычисляет индекс массы тела
 */
public class Task_5 {
    public static void main(String[] args) {
 int m = 70;
 double h = 1.59;

        bodyMassIndex(m,h);

    }

    public static void bodyMassIndex (int m, double h) {
        double bmi =  m / (h * h);
        if ( bmi < 15) {
            System.out.println("У Вас острый дефицит веса!!!");
        } else if ( bmi >= 15 &&  bmi < 20) {
            System.out.println("У Вас дефицит веса!");
        } else if ( bmi >= 20 &&  bmi < 25) {
            System.out.println("нормальный вес");
        } else if ( bmi >= 25 &&  bmi < 30) {
            System.out.println("ожирение");
        } else {
            System.out.println("У Вас ожирение!!!\n" +
                    "Хорошего человека должно быть много...\n" +
                    "но не на столько...");
        }

    }
}
