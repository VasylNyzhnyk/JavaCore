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


}







