package TicTacToe;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameRunnerOld {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String player1;
        String player2;
        System.out.println("Введіть імена гравців");
        //System.out.println("");
        player1 = reader.readLine();
        player2 = reader.readLine();
        System.out.println("Грає два гравця! " + player1 + " ПРОТИ " + player2);
        System.out.println("|1| |2| |3| ");
        System.out.println("|4| |5| |6| ");
        System.out.println("|7| |8| |9| ");
        System.out.println("Гравці вводять число від 1 до 9 ");
        System.out.println("Грає гравець   " + player1);

        int[] mas = new int[9];
        for (int j = 0; j < mas.length; j++) {
            int i;
            // i = (char)reader.read();
            i = Integer.parseInt(reader.readLine());
            if (i == 1) {
                mas[0] = i;
            }
            if (i == 2) {
                mas[1] = i;
            }
            if (i == 3) {
                mas[2] = i;
            }
            if (i == 4) {
                mas[3] = i;
            }
            if (i == 5) {
                mas[4] = i;
            }
            if (i == 6) {
                mas[5] = i;
            }
            if (i == 7) {
                mas[6] = i;
            }
            if (i == 8) {
                mas[7] = i;
            }
            if (i == 9) {
                mas[8] = i;
            } else System.out.println("Введено не вірне число");

            if (j % 2 == 0) {

                System.out.println("Грає гравець   " + player2);
            } else {
                System.out.println("Грає гравець  " + player1);
            }


            System.out.println(" " + mas[0] + " | " + mas[1] + " | " + mas[2] + "  ");
            System.out.println(" " + mas[3] + " | " + mas[4] + " | " + mas[5] + "  ");
            System.out.println(" " + mas[6] + " | " + mas[7] + " | " + mas[8] + "  ");
        }


    }
}

