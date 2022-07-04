package hexlet.code.game;

import hexlet.code.Engine;

public class Prime {
    private static final String PRIME_TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int NUMBERS_RANGE = 100;

    public static boolean isPrimeNumber(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String[][] game() {
        String[][] gameParam = new String[Engine.NUM_OF_ATTEMPTS][Engine.NUM_OF_PARAM];
        for (int i = 0; i < Engine.NUM_OF_ATTEMPTS; i++) {
            int random = Engine.random(NUMBERS_RANGE);
            String answer = isPrimeNumber(random) ? "yes" : "no";
            gameParam[i] = new String[] {Integer.toString(random), answer};
        }
        return gameParam;
    }

    public static void toGame() {
        Engine.startGame(PRIME_TASK, game());
    }
}
