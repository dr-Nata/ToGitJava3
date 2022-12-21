package org.example;

public class Main {
    public static void main(String[] args) {
        new Main().run3();
    }

    private void run3() {
        String name = "Shirt";
        double cost = 450.769204;
        int n = 5;
        System.out.printf("Товар: %s; стоит: %18.2f грн",name,cost);
        System.out.printf("За %d  %s  вы заплатите %18.2f грн", n, name,cost*n);
    }

    private void run2() {
        String name = "Shirt";
        double cost = 450.769204;
        System.out.printf("Товар: %s; стоит: %.2f грн",name,cost);
    }

    private void run1() {
        int nBox = 3;
        int apples = 34;
        System.out.printf("В коробке № %d лежит %d ябл.",nBox,apples);
    }

    private void run() {
        System.out.println("Hello world!");
    }
}
