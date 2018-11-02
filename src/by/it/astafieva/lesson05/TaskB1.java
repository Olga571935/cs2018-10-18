package by.it.astafieva.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String a = "Гарри Поттер и философский камень";
        String b = "Гарри Поттер и Тайная комната";
        String c = "Гарри Поттер и узник Азкабана";
        String d = "Гарри Поттер и Кубок огня ";
        String f = "Гарри Поттер и Орден Феникса";
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(f);
        int i = list.size();
        System.out.println (i);
        for (String s : list) {
                System.out.println(s);
        }
    }

}