package home_work.homework_week2;

/**
 * У вас есть доллары. Вы хотите обменять их на uah. Есть информация о стоимости купли-продажи в банках города.
 * В городе N банков. Составьте программу, определяющую, какой банк выбрать, чтобы выгодно обменять доллары на uah.
 */
public class Task_9 {
    public static void main(String[] args) {

       double bank1= 10.05;
       double bank2= 10.09;
       double bank3= 10.00;
       double bank4= 10.55;
       double bank5= 10.99;
       double[] banks = {bank1,bank2,bank3,bank4,bank5};


    double min = chooseBank(banks);
        System.out.println("выгодный курс в bank "+ (findIndexByValue(banks, min)+1));
    }


    public static double chooseBank(double[] banks) {

            double min = banks[0];
            for (int i = 0; i < banks.length; i++) {
                if (banks[i] < min) {
                    min = banks[i];
                }
            }
            return min;

        }
    public static int findIndexByValue(double[] banks, double value) {
        int index = 0;
        for (int i = 0; i < banks.length; i++) {
            if (banks[i] == value) {
                index = i;
            }
        }
        return index;
    }

    }
