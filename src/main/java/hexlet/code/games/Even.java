package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String EVEN_TASK = "Answer 'yes' if number even otherwise answer 'no'.";
    private static final int NUM_RANGE = 100;

    public static boolean isEven(int random) {
        return random % 2 == 0;
    }

    public static void startGame() {
        String[][] gameParams = new String[Engine.ROUNDS_NUMBER][Engine.PARAMETERS_NUMBER];
        for (int i = 0; i < Engine.ROUNDS_NUMBER; i++) {
            int random = Utils.random(Even.NUM_RANGE);
            String answer = isEven(random) ? "yes" : "no";
            gameParams[i] = new String[] {Integer.toString(random), answer};
        }
        Engine.game(EVEN_TASK, gameParams);
    }
}
