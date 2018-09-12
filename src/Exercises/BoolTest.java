package Exercises;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b рівне  " + b);
        b = true;
        System.out.println("b рівне  " + b);

        if (b) System.out.println("Цей код виконається");
        b = false;
        if (b) System.out.println("Цей код не виконається");

        System.out.println("10 > 9 рівне " +  (10>9));
    }
}
