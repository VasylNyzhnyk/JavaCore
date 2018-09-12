package Exercises;

public class IfSample {
    public static void main(String[] args) {
        int x,y;

        x = 10;
        y = 20;

        if (x < y) System.out.println("x меньше y ");

        x = x * 2;
        if (x == y) System.out.println("х тепер рівне y");

        x = x * 2;
        if (x > y) System.out.println("x тепер більше y");

        if (x==y) System.out.println("цього не побачим");

    }
}
