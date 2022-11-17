import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("11");
        collection.add("18");
        collection.add("33");
        collection.add("11");
        collection.add("99");
        collection.add("33");
        collection.add("57");
        Collections.sort(collection);
        System.out.println(collection);
        System.out.println("__________________________________");
        RemoveDuplicates action = new RemoveDuplicates();
        System.out.println(action.removeDuplicates(collection));


    }
}
//1. Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
//
//        2. Написать итератор по коллекции реализованной в ДЗ №8 - надо заимплементить интерфейс Iterator
//
//        3. написать программу для вычисления корней квадратного уравнения