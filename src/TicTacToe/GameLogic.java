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
                System.out.println("Ходить O");
                int number = getNumber();
                arr[number] = (char) number;
                arr[number] = USER_SYMBOL;

                show();
            } else {
                System.out.println("Хід компютера X ");
                randomNumder();
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

    static boolean checkWinner(char n) {
        int row = n - n % 3;
        if (arr[row] == arr[row + 1] && arr[row] == arr[row + 2]) return true;
        int column = n % 3;
        if (arr[column] == arr[column + 3])
            if (arr[column] == arr[column + 6]) return true;
        if (n % 2 != 0) return false;
        if (n % 4 == 0) {
            if (arr[0] == arr[4] && arr[0] == arr[8]) return true;
            if (n != 4) return false;
        }
        return arr[2] == arr[4] && arr[2] == arr[6];
    }

}







