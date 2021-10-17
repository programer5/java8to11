package me.whiteship.java8to11;

public class Foo {

    public static void main(String[] args) {

        int baseNumber = 10;

        RunSomething runSomething = new RunSomething() {

            @Override
            public int doIt(int number) {
                return number + baseNumber;
            }
        };
    }
}
