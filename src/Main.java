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
    public static boolean schastlivoe_pislo (int x)
    {
        if ((x / 1000 + (x / 100) % 10) == ((x / 10) % 10 + x % 10) )
        return true;
        else return false;
    }
    /*public static boolean checkPoint (int x, int y, int r, int a, int b){
        //(x – a)2 + (y – b)2 ≤ r2
        if ((sqrt(x-a) + sqrt(y-b)) <= (sqrt(r)))
         return true;
        else
            return false;
    }*/
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

        int pislo;
        pislo = in.nextInt();

        System.out.println(schastlivoe_pislo(pislo));
    }

}