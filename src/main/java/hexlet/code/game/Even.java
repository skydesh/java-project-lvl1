package hexlet.code.game;

import hexlet.code.Engine;

public class Even {
    private static final String EVEN_TASK = "Answer 'yes' if number even otherwise answer 'no'.";
    private static final int NUM_RANGE = 100;

    public static boolean isEven(int random) {
        return random % 2 == 0;
    }

    public static String[][] game() {
        String[][] gameParam = new String[Engine.NUM_OF_ATTEMPTS][Engine.NUM_OF_PARAM];
        for (int i = 0; i < Engine.NUM_OF_ATTEMPTS; i++) {
            int random = Engine.random(Even.NUM_RANGE);
            String answer = isEven(random) ? "yes" : "no";
            gameParam[i] = new String[] {Integer.toString(random), answer};
        }
        return gameParam;
    }

    public static void toGame() {
        Engine.startGame(EVEN_TASK, game());
    }
}
