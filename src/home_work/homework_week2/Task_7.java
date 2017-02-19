package home_work.homework_week2;

/**
 * 7 написать метод высчитывающий сколько литров нужно чтобы заполнить бассейн Примает на вход 3 величи
 */
public class Task_7 {
    public static void main(String[] args) {
      int h= 3;
      int l = 11;
      int v =5;
        System.out.println(bassein(h,l,v));

    }

    public static int bassein (int h, int l, int v) {
        int obiem = h*l*v;

        return obiem;
    }


}
