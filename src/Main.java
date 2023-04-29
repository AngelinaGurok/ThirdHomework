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

    public static boolean ferZ(int x1, int y1, int x2, int y2){
        if((x1 == x2) || (y1 == y2) || ((x1 + y1 == x2 + y2) || (x1 - y1 == x2 - y2)))
            return true;
        else return false;
    }
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

        int x1, y1, x2, y2;

        x1 = in.nextInt();
        y1 = in.nextInt();
        x2 = in.nextInt();
        y2 = in.nextInt();
        System.out.println(ferZ(x1, y1, x2, y2));
    }

}