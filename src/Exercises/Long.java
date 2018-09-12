package Exercises;

public class Long {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 300000;

        days = 1000;

        seconds = days * 24 * 60 * 60;

        distance = lightspeed * seconds;
        System.out.print("За " + days);
        System.out.print(" днів світло пройде близько ");
        System.out.print(distance + " км ");
    }
}
