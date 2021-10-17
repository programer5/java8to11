package me.whiteship.java8to11;

import java.util.function.*;

public class Foo {

    public static void main(String[] args) {
//        Function<Integer, Integer> plus10 = (number) -> number + 10;
//        Function<Integer, Integer> multiply2 = (i) -> i * 2;
//
//        System.out.println(plus10.andThen(multiply2).apply(2));

//        Consumer<Integer> printT = (i) -> System.out.println(i);
//        printT.accept(10);

//        Supplier<Integer> get10 = () -> 10;
//
//        System.out.println("get10 = " + get10);

//        Predicate<String> startsWithMinseo = (s) -> s.startsWith("minseo");
//        Predicate<Integer> isEven = (i) -> i % 2 == 0;

        UnaryOperator<Integer> plus10 = (i) -> i + 10;
        UnaryOperator<Integer> multiply2 = (i) -> i * 2;

        System.out.println(plus10.andThen(multiply2).apply(2));

    }
}
