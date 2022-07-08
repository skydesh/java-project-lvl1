package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String EVEN_TASK = "Answer 'yes' if number even otherwise answer 'no'.";
    private static final int NUM_RANGE = 100;

    public static boolean isEven(int random) {
        return random % 2 == 0;
    }

    public static String[][] gameParameters() {
        String[][] gameParam = new String[Engine.NUM_OF_ATTEMPTS][Engine.NUM_OF_PARAM];
        for (int i = 0; i < Engine.NUM_OF_ATTEMPTS; i++) {
            int random = Utils.random(Even.NUM_RANGE);
            String answer = isEven(random) ? "yes" : "no";
            gameParam[i] = new String[] {Integer.toString(random), answer};
        }
        return gameParam;
    }

    public static void startGame() {
        Engine.game(EVEN_TASK, gameParameters());
    }
}
