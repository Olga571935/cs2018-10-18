package by.it.astafieva.lesson03;

/*
Lesson 03. Task A1. Калькулятор.
Напишите программу, которая считывает с клавиатуры два целых числа a и b
после этого выводит через пробел:

сумму, разность, произведение, частное и остаток от деления
этих чисел двух чисел (результат выводится как тип int).

после этого еще раз выводит через пробел
сумму, разность, произведение, частное и остаток от деления
этих чисел двух чисел (но результат выводится как тип double).

Для считывания данных с клавиатуры используйте метод nextInt() объекта класса Scanner.
Создать Scanner можно так:
Scanner sc=new Scanner(System.in);

Требования:
1. В программе необходимо создать объект типа Scanner.
2. Программа должна считывать два числа типа int с клавиатуры.
3. Программа должна дважды выводить в строку пять чисел через пробел.
4. Программа должна выводить int сумму, разность, произведение, частное и остаток от деления этих чисел двух чисел.
5. Программа должна выводить double сумму, разность, произведение, частное и остаток от деления этих чисел двух чисел.

Пример:

Ввод:
7 2
Вывод:
9 5 14 3 1
9.0 5.0 14.0 3.5 1.0

 */

import java.util.Scanner;

class TaskA1 {
    public static void main(String[] args) {
        System.out.print("Введите число а: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Введите число b: ");
        Scanner sc1 = new Scanner(System.in);
        int b = sc.nextInt();
        int c = a + b;
        int d = a - b;
        int f = a * b;
        int r = a / b;
        int t = a % b;
        System.out.println(c + " " + d + " " + f + " " + r + " " + t);

        double c1 = (double) c;
        double d1 = (double) d;
        double f1 = (double) f;
        double r1 = (double) r;
        double t1 = (double) t;
        System.out.println(c1 + " " + d1 + " " + f1 + " " + r1 + " " + t1);

    }
    }
