package me.whiteship.java8to11;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        ArrayList<Object> name = new ArrayList<>();
        name.add("minseo");
        name.add("double8");
        name.add("toby");
        name.add("foo");



//        Spliterator<Object> spliterator = name.spliterator();
//        Spliterator<Object> spliterator1 = spliterator.trySplit();
//        while (spliterator.tryAdvance(System.out::println));
//        System.out.println("=====================");
//        while (spliterator1.tryAdvance(System.out::println));

//        name.forEach(System.out::println);
    }
}
