package TicTacToe;

import java.io.IOException;

public class GameRunner {
    public static void main(String[] args) throws IOException {
            GameLogic gameLogic = new GameLogic();
            Field.getUserMessage();
            Field.setStep();
            Field.show();
            gameLogic.start();
    }
}
