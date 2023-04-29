/**
 * Пример
 *
 * Лежит ли точка (x, y) внутри окружности с центром в (x0, y0) и радиусом r?
 */
import java.util.Scanner;

import static java.lang.Math.sqrt;
/*Пусть (x, y) – координаты центра круга и r – его радиусть
        Пусть (a, b) – координаты точки А. Точка А лежит внутри круга (включая границы)
(x – a)^2 + (y – b)^2 ≤ r^2 */

public class Main {

    /* public static boolean ferZ(int x1, int y1, int x2, int y2){
        if((x1 == x2) || (y1 == y2) || ((x1 + y1 == x2 + y2) || (x1 - y1 == x2 - y2)))
            return true;
        else return false;
    }*/
    /*public static boolean schastlivoe_pislo (int x)
    {
        if ((x / 1000 + (x / 100) % 10) == ((x / 10) % 10 + x % 10) )
        return true;
        else return false;
    }*/
    /*public static boolean checkPoint (int x, int y, int r, int a, int b){
        //(x – a)2 + (y – b)2 ≤ r2
        if ((sqrt(x-a) + sqrt(y-b)) <= (sqrt(r)))
         return true;
        else
            return false;
    }*/
    public static int colendar (int mes, int god)
    {
        if ((mes != 2) && ((mes <= 7) && (mes % 2 == 1)) || ((mes > 7) && (mes % 2 ==0)))
            return 31;
        else
            if ((mes != 2) && ((mes <= 7) && (mes % 2 == 0)) || ((mes > 7) && (mes % 2 ==1)))
                return 30;
            else
                if (god % 4 == 0)
                    return 29;
                else return 28;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      /*  int x, y, r, a, b;
        x = in.nextInt();
        y = in.nextInt();
        r = in.nextInt();
        a = in.nextInt();
        b = in.nextInt();
        boolean out = checkPoint(x, y, r, a, b);*/

        /**
         * Простая (2 балла)
         *
         * Четырехзначное число назовем счастливым, если сумма первых двух ее цифр равна сумме двух последних.
         * Определить, счастливое ли заданное число, вернуть true, если это так.
         */

        /**
         * Простая (2 балла)
         *
         * На шахматной доске стоят два ферзя (ферзь бьет по вертикали, горизонтали и диагоналям).
         * Определить, угрожают ли они друг другу. Вернуть true, если угрожают.
         * Считать, что ферзи не могут загораживать друг друга.
         */
        /*int pislo;
        pislo = in.nextInt();*/

        /*int x1, y1, x2, y2;

        x1 = in.nextInt();
        y1 = in.nextInt();
        x2 = in.nextInt();
        y2 = in.nextInt();*/
        /**
         * Простая (2 балла)
         *
         * Дан номер месяца (от 1 до 12 включительно) и год (положительный).
         * Вернуть число дней в этом месяце этого года по григорианскому календарю.
         */
        int mes, god;
        do{
            System.out.println("Input month (shouLd be more than 0 and less than 13): ");
            mes = in.nextInt();
            System.out.println("Input year (shouLd be more than 0): ");
            god = in.nextInt();
        }while((mes > 12) || (god <= 0) || (mes < 1));
        System.out.println(colendar(mes, god));
    }

}