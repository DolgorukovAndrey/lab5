package ru.Dolgorukov.main;

import java.util.*;

import ru.Dolgorukov.Cat.Cat;
import ru.Dolgorukov.Cat.MeowCount;
import ru.Dolgorukov.Cat.MethodsCat;
import ru.Dolgorukov.Methods.ClassMethods;
import ru.Dolgorukov.point.Line;
import ru.Dolgorukov.point.MethodsPoint;
import ru.Dolgorukov.point.Point;
import ru.Dolgorukov.point.Polyline;
import ru.Dolgorukov.point.MethodsPoint;

public class Main {
    public static void main(String[] args) {
        ClassMethods method = new ClassMethods();
        System.out.println("Работа метода task4:");
        System.out.println("Люди с самой большой суммой баллов:");
        method.task4();
        System.out.println();
        System.out.println("Работа метода deleteList:");
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,1, -3, 7,3,5,6,7,3,4,5,1,2,1,12,2));
        System.out.println("Исходный список: " + numbers);
        System.out.println("Удаляем все элементы со значением 1");
        numbers = method.deleteList(numbers,1);
        System.out.println(numbers);
        System.out.println();
        System.out.println("Работа метода task6:");
        Queue<String> queue = new LinkedList<>(Arrays.asList("A", "B", "B", "B", "C", "D"));
        System.out.println("Исходная очередь: " + queue);
        System.out.println("Проверяем в промежутке [1;3]");
        System.out.println(method.task6(queue,1,3));
        System.out.println("Проверяем в промежутке [0;4]");
        System.out.println(method.task6(queue,0,4));
        System.out.println();
        System.out.println("Работа метода task5:");
        method.task5();
        System.out.println();
        MethodsCat m = new MethodsCat();
        Cat cat = new Cat("Павлик");
        MeowCount meowCount = new MeowCount(cat);
        meowCount.meow();
        m.meowing(meowCount, meowCount);
        System.out.println(meowCount.getCatName() + " - кол-во мяуканий: " + meowCount.getCaountMeow());
        Point point1 = new Point(10,2);
        Point point2 = new Point(2,3);
        Point point3 = new Point(-11,-12);
        Point point4 = new Point(2,3);
        Point point5 = new Point(-10,2);
        Point point6 = new Point(2,-3);
        Point point7 = new Point(2,2);
        Point point8 = new Point(34,3);
        Point point9 = new Point(20,2);
        Point point10 = new Point(0,0);
        Point[] array = {point1,point2,point3,point4,point5,point6,point7,point8,point9,point10};
        System.out.println();
        System.out.println("Работа метода task7");
        System.out.print("Набор точек: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i].toString() + " ");
        }
        System.out.println();
        MethodsPoint method1 = new MethodsPoint();
        method1.task7(array);
        System.out.println();
        System.out.println("Работа метода task72");
        method.task72();
    }
}



