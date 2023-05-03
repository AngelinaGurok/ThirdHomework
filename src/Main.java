/**
 * Пример
 *
 * Лежит ли точка (x, y) внутри окружности с центром в (x0, y0) и радиусом r?
 */
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
/*Пусть (x, y) – координаты центра круга и r – его радиусть
        Пусть (a, b) – координаты точки А. Точка А лежит внутри круга (включая границы)
(x – a)^2 + (y – b)^2 ≤ r^2 */

public class Main {
    public static int triangleType(int a, int b, int c){
        if (a > b + c || b > a + c || c > a + b) return -1;
        if(a >= b && a >= c){
            if(a * a < b * b + c * c){
                return 0;
            }
            if(a * a == b * b + c * c){
                return 1;
            }
            if(a * a > b * b + c * c){
                return 2;
            }
        } else if (b >= a && b >= c){
            if(b * b < a * a + c * c){
                return 0;
            }
            if(b * b == a * a + c * c){
                return 1;
            }
            if(b * b > a * a + c * c){
                return 2;
            }

        } else {
            if(c * c < a * a + b * b){
                return 0;
            }
            if(c * c == a * a + b * b){
                return 1;
            }
            if(c * c > a * a + b * b){
                return 2;
            }
        }
        return 5;
    }
    /*public static boolean brick(int a, int b, int c, int r, int s){
        if((a <= r && (b <= s || c <= s)) || (b <= r && (a <= s || c <= s)) ||
                (c <= r && (b <= s || a <= s))){
            return true;
        }
        else return false;
    }*/

    /**(a1 - a2)^2 + (b1-b2)^2 < (r-r2)^2*/
    /*public static boolean circles(double x1, double y1, double r1, double x2, double y2, double r2){
        if((pow((x1 - x2), 2) + pow((x1 - x2), 2)) < pow((r1 - r2), 2))
            return true;
        else return false;
    }*/

    /* public static boolean chessQueens(int x1, int y1, int x2, int y2){
        if((x1 == x2) || (y1 == y2) || ((x1 + y1 == x2 + y2) || (x1 - y1 == x2 - y2)))
            return true;
        else return false;
    }*/

    /*public static boolean luckyNum (int x)
    {
        if ((x / 1000 + (x / 100) % 10) == ((x / 10) % 10 + x % 10) )
        return true;
        else return false;
    }*/

    /** (x – a)2 + (y – b)2 ≤ r2 */
    /*public static boolean checkPoint (int x, int y, int r, int a, int b){

        if ((pow((x - a), 2) + pow((y - b), 2) <= (pow(r, 2)))
            return true;
        else
            return false;
    }*/

    /* public static int calendar (int mes, int god)
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

    }*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /**
         * Пример
         *
         * Лежит ли точка (x, y) внутри окружности с центром в (x0, y0) и радиусом r?
         */

        /*  int x, y, r, a, b;
        x = in.nextInt();
        y = in.nextInt();
        r = in.nextInt();
        a = in.nextInt();
        b = in.nextInt();
        System.out.println(chessQueens(checkPoint(x, y, r, a, b)); */

        /**
         * Простая (2 балла)
         *
         * Четырехзначное число назовем счастливым, если сумма первых двух ее цифр равна сумме двух последних.
         * Определить, счастливое ли заданное число, вернуть true, если это так.
         */

        /*int num;
        num = in.nextInt();
        System.out.println(chessQueens(luckyNum(num));*/

        /**
         * Простая (2 балла)
         *
         * На шахматной доске стоят два ферзя (ферзь бьет по вертикали, горизонтали и диагоналям).
         * Определить, угрожают ли они друг другу. Вернуть true, если угрожают.
         * Считать, что ферзи не могут загораживать друг друга.
         */


        /*int x1, y1, x2, y2;

        x1 = in.nextInt();
        y1 = in.nextInt();
        x2 = in.nextInt();
        y2 = in.nextInt();
        System.out.println(chessQueens(x1, y1, r1, x2, y2));*/
        /**
         * Простая (2 балла)
         *
         * Дан номер месяца (от 1 до 12 включительно) и год (положительный).
         * Вернуть число дней в этом месяце этого года по григорианскому календарю.
         */
        /*int month, year;
        do{
            System.out.println("Input month (shouLd be more than 0 and less than 13): ");
            month = in.nextInt();
            System.out.println("Input year (shouLd be more than 0): ");
            year = in.nextInt();
        }while((mes > 12) || (god <= 0) || (mes < 1));
        System.out.println(calendar(month, year));*/

        /**
         * Простая (2 балла)
         *
         * Проверить, лежит ли окружность с центром в (x1, y1) и радиусом r1 целиком внутри
         * окружности с центром в (x2, y2) и радиусом r2.
         * Вернуть true, если утверждение верно
         */

        /*double x1, y1, r1, x2, y2, r2;
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        r1 = in.nextDouble();
        x2 = in.nextDouble();
        y2 = in.nextDouble();
        r2 = in.nextDouble();
        System.out.println(circles(x1, y1, r1, x2, y2, r2));*/

        /**
         * Средняя (3 балла)
         *
         * Определить, пройдет ли кирпич со сторонами а, b, c сквозь прямоугольное отверстие в стене со сторонами r и s.
         * Стороны отверстия должны быть параллельны граням кирпича.
         * Считать, что совпадения длин сторон достаточно для прохождения кирпича, т.е., например,
         * кирпич 4 х 4 х 4 пройдёт через отверстие 4 х 4.
         * Вернуть true, если кирпич пройдёт
         */
        /*int a, b, c, r, s;
         a = in.nextInt();
         b = in.nextInt();
         c = in.nextInt();
         r = in.nextInt();
         s = in.nextInt();
         System.out.println(brick(a, b, c, r, s));*/
        /**
         * Простая (2 балла)
         *
         * Треугольник задан длинами своих сторон a, b, c.
         * Проверить, является ли данный треугольник остроугольным (вернуть 0),
         * прямоугольным (вернуть 1) или тупоугольным (вернуть 2).
         * Если такой треугольник не существует, вернуть -1.
         */
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        System.out.println(triangleType(a, b, c));
    }

}