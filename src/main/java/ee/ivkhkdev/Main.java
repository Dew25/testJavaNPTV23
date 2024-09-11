package ee.ivkhkdev;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static enum MONTH{
        Январь, Февраль, Март, Апрель, Май, Июнь, Июль, Август, Сентябрь, Октябрь, Ноябрь, Декабрь
    }
    public static void main(String[] args) {

        int min = -30;
        int max = 30;
        int[][] myYear = new int[12][];
        myYear[0] = new int[31];
        myYear[1] = new int[28];
        myYear[2] = new int[31];
        myYear[3] = new int[30];
        myYear[4] = new int[31];
        myYear[5] = new int[30];
        myYear[6] = new int[31];
        myYear[7] = new int[31];
        myYear[8] = new int[30];
        myYear[9] = new int[31];
        myYear[10] = new int[30];
        myYear[11] = new int[31];
        Random random = new Random();
        for (int i = 0; i < myYear.length; i++) {
            for (int j = 0; j < myYear[i].length; j++) {
                myYear[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        System.out.println();
        System.out.println("Максимальная погода по дням в году");
        System.out.println();
        System.out.printf("%10s"," ");
        for (int i = 1; i <= 31; i++) {
            System.out.printf("%4d",i);
        }System.out.printf("%9s","-");
        System.out.println();
        for (int i = 1; i < 31*5; i++) {
            System.out.printf("%s","-");
        }
        System.out.println();
        for (int i = 0; i < myYear.length; i++) {
            System.out.printf("%9s:",MONTH.values()[i]);
            for (int j = 0; j < myYear[i].length; j++) {
                System.out.printf("%4d", myYear[i][j]);
            }
            System.out.println();
        }
    }
}