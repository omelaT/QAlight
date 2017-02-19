package home_work.homework_week2;

/**
 * Написать буленовский метод принимающий на вход 3 переменных типа int которые обозначают длину
 * стороны для треугольника и возвращает правда или ложь (может ли существовать треугольник с заданными сторонами)
 * Вспоминаем свойство треугольника ни одна сторона не должна быть длиннее суммы  двух других
 */
public class Task_3 {
    public static void main(String[] args) {
        System.out.println(triangle(28, 10, 19));

    }
    public static boolean triangle(int a, int b, int c){
        if (a< b+c && b< a+c && c< b+a){
            return true;
        }else{
            return false;
        }
    }
}
