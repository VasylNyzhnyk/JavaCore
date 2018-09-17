package TicTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static TicTacToe.Field.arr;
import static TicTacToe.Field.show;

public class GameLogic {
    public void start() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String player1;
        String player2;

        for (int j = 0; j < arr.length; j++) {
            System.out.println("Хід 1 гравця:");
            arr[j] = (char) reader.read();
            if (j % 2 == 0) arr[j] = 'o';
            else arr[j] = 'x';
            System.out.println("Хід компютера  " + (int) (Math.random() * 9));

            show();
        }

    }

}




