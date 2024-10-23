import java.util.Scanner;

public class LessonThree {

    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        taskFive();
        taskSix();
        taskSeven();
        taskEight();


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("введите число:");
//        int a = scanner.nextInt();
//        System.out.println("a=" + a);


    }

    public static void taskOne() {

        /**
         * Ввести с консоли любое число от 1 до 12. В зависимости от введённого числа вывести в
         * консоль соответствующую пору года по номеру месяца. При решении использовать
         * switch.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число от 1 до 12:");
        int a = scanner.nextInt();

        switch (a) {
            case 1 -> System.out.println("январь");
            case 2 -> System.out.println("февраль");
            case 3 -> System.out.println("март");
            case 4 -> System.out.println("апрель");
            case 5 -> System.out.println("май");
            case 6 -> System.out.println("июнь");
            case 7 -> System.out.println("июль");
            case 8 -> System.out.println("август");
            case 9 -> System.out.println("сентябрь");
            case 10 -> System.out.println("октябрь");
            case 11 -> System.out.println("ноябрь");
            case 12 -> System.out.println("декабрь");
        }

/**
 * Задача 2:
 *      * Используя while вывести все числа от 0 до 25 в одну строку через пробел.
 */


    }

    public static void taskTwo() {

        int i = 0;
        while (i <= 25) {

            System.out.print(i + " ");
            i++;
        }


    }

    /**
     * * Задача 3:
     * * Используя for вывести каждое четное число от 2 до 20 включительно и больше 10.
     */

    public static void taskThree() {

        for (int j = 2; j <= 20; j++) {
            if (j % 2 == 0 || j > 10) {

                System.out.println("j = " + j);
            }


        }

    }

    /**
     * Напишите программу, которая будет принимать на вход число из консоли и на выход
     * будет выводить сообщение четное число или нет. Для определения четности числа
     * используйте операцию получения остатка от деления (операция выглядит так: '% 2').
     */
    public static void taskFour() {
        Scanner s = new Scanner(System.in);
        System.out.println("введите число:");
        int b = s.nextInt();
        if (b % 2 == 0) {
            System.out.println("число является четным");
        } else {
            System.out.println("число является нечетным");
        }

    }

    /**
     * * Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
     * Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».
     */
    public static void taskFive() {
        Scanner t = new Scanner(System.in);
        System.out.println("введите температуру на улице:");
        int c = t.nextInt();
        if (c > -5) {
            System.out.println("Warm");
        } else if (c <= -5 && c > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }

    }

    /**
     * Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
     */
    public static void taskSix() {

        int k = 10;
        while (k <= 20) {
            int l = k * k;

            System.out.print(l + " ");
            k++;
        }


    }

    /**
     * Необходимо, чтоб программа выводила на экран вот такую последовательность:
     * 7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
     */
    public static void taskSeven() {

        int m = 7;
        while (m <= 98) {


            System.out.print(m + " ");
            m = m + 7;
        }


    }

    /**
     * Напишите программу, где пользователь вводит любое целое положительное число. А
     * программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
     * числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
     * ввести некорректные данные.
     */

    public static void taskEight() {
        Scanner n = new Scanner(System.in);
        System.out.println("введите целое положительное число:");
        int d = n.nextInt();
        if (d <= 0) {
            System.out.println("Число введено некорректно");
        } else {


                int e = 1;

                int sum = 0;

                while (e <= d) {
                    sum += e;
                    e++;
                }
                System.out.println("Сумма чисел от 1 до " + d + " равна " + sum);







            }

        }
    }



