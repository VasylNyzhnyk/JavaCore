package Exercises;

public class Promote {
    public static void main(String[] args) {
        byte b = 40;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result  = (f*b) + (i/c) - (d*s);
        System.out.println((f*d) + " + " + (i/c) + " - " + (d*s));
        System.out.println("result = " + result);
/*
        char c1 = 'h';
        char c2 = 'a';
        char c3 = 'l';
        char c4 = 'l';
        char c5 = 'o';
        int sume = c1 + c2 + c3 + c4 + c5;
        System.out.println("c1 = " + c1 + "  c2 = " + c2 + "  c3= " + c3 + "  c4= " + c4 + " c5 =  "+ c5);
        System.out.println(c1);
        System.out.println(sume);*/


    }
}
