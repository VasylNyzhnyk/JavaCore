package TicTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static TicTacToe.Field.arr;
import static TicTacToe.Field.getUserMessage;
import static TicTacToe.Field.show;

public class GameLogic {


    public void start() {
        getUserMessage();
        for (int j = 0; j < arr.length; j++) {
            if (j % 2 == 0) {
                System.out.println("Ходить O");
                int number = getNumber();
                arr[number] = (char) number;
                arr[number] = 'o';
                show();
            } else {
                System.out.println("Хід компютера X ");
                randomNumder();
                show();
            }
        }


    }

    static void randomNumder() {
        int number = (char) (Math.random() * 9);
        arr[number] = (char) number;
        arr[number] = 'x';
    }

    static int getNumber() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                int n = Integer.parseInt(reader.readLine());
                if (n >= 0 && n <= arr.length && arr[n] == 0) {
                    return n;
                }
                System.out.println("Виберіть відьну комірку і введіть її номер");
            } catch (NumberFormatException e) {
                System.out.println("Виберіть відьну комірку і введіть її номер");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Будь ласка, введіть номер");
            } catch (IOException e) {
            }
        }
    }

    /*static void checkWinner(){
        for ( int n = 0; n < arr.length - 3; n = n + 3){
            if (arr[n] == arr[n+1] & arr[n] == arr[n+2] & arr[n] != 0){
                System.out.println("Переміг гравець " +(j%2+1));

            }
        }
        for ( int n = 0; n < 3; n++){
            if (arr[n] == arr[n+3] & arr[n] == arr[n+6] & arr[n] != 0){
                System.out.println("Переміг гравець " +(j%2+1));

            }
        }
        int n = 0;
        if (arr[n] == arr[n+4] & arr[n] == arr[n+8] & arr[n] != 0){
            System.out.println("Переміг гравець " +(j%2+1));

        }
        if (arr[n+2] == arr[n+4] & arr[n+2] == arr[n+6] & arr[n+2] != 0){
            System.out.println("Переміг гравець " +(j%2+1));

        }
        //Умова нічиї;
        if ( j == 8){
            System.out.println("Нічия");

        }*/
}







