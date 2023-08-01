package com.puzzles;

public class Squares {

    public static void main(String[] args) {
        System.out.println("---------------");
        fullSquare();
        System.out.println("---------------");
        halfSquare();
        System.out.println("---------------");
        countDownByCountingUp();
        System.out.println("---------------");
    }

    private static void countDownByCountingUp() {
        for (int i = 0; i < 5; i++) {
            System.out.print(5 - i);
            System.out.print("\n");
        }
    }

    private static void fullSquare() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }

    private static void halfSquare() {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
