package Exercises;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d  = 325.255;

        System.out.println("\nПеретворення типу int в тип byte");
        b = (byte) i;
        System.out.println("i та b " + i + " " + b);

        System.out.println("\nПеретворення типу double в тип int");
        i = (int) d;
        System.out.println("d та i " + d + " " + i);

        System.out.println("\nПеретворення типу double в тип int ");
        System.out.println("Hello");
        b = (byte) d;
        System.out.println("d  та b " + d + " "+ b);
    }

}
