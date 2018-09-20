package TicTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static TicTacToe.Field.*;

public class GameLogic {
    public void start() {
        getUserMessage();
        for (int j = 0; j < arr.length; j++) {
            if (j % 2 == 0) {
                System.out.println("Ходить  - 0");
                int number = getNumber();
                arr[number] = USER_SYMBOL;
                checkWinner();
                show();
            } else {
                System.out.println("Хід компютера -  X");
                randomNumder();
                checkWinner();
                show();
            }
        }
    }

    static void randomNumder() {
        while (true) {
            try {
                int n = (int) (Math.random() * 9);
                if (arr[n] == 0) {
                    arr[n] = PC_SYMBOL;
                    return;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
            }
        }
    }

    static int getNumber() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                int n = Integer.parseInt(reader.readLine());
                if (n >= 0 && n <= arr.length && arr[n] == 0) {
                    return n;
                }
                System.out.println("Виберіть вільну комірку і введіть її номер");
            } catch (NumberFormatException e) {
                System.out.println("Виберіть вільну комірку і введіть її номер");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Будь ласка, введіть номер");
            } catch (IOException e) {
            }
        }
    }

    static void getUserMessage() {
        System.out.println(" 0 | 1 | 2 ");
        System.out.println("--- --- ---");
        System.out.println(" 3 | 4 | 5 ");
        System.out.println("--- --- ---");
        System.out.println(" 6 | 7 | 8 ");
    }

    static void checkWinner() {
        for (int n = 0; n < arr.length - 3; n = n + 3) {
            if (arr[n] == arr[n + 1] & arr[n] == arr[n + 2] & arr[n] != 0) {
                System.out.println("Переміг гравець  " + arr[n]);
            }
        }
        for (int n = 0; n < 3; n++) {
            if (arr[n] == arr[n + 3] & arr[n] == arr[n + 6] & arr[n] != 0) {
                System.out.println("Переміг гравець  " + arr[n]);
            }
        }
        int n = 0;
        if (arr[n] == arr[n + 4] & arr[n] == arr[n + 8] & arr[n] != 0) {
            System.out.println("Переміг гравець  " + arr[n]);
            if (arr[n + 2] == arr[n + 4] & arr[n + 2] == arr[n + 6] & arr[n + 2] != 0) {
                System.out.println("Переміг гравець  " + arr[n]);
            }
        }

    }
}



