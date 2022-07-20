package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

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

    public static void startGame() {
        String[][] gameParams = new String[Engine.ROUNDS_NUMBER][Engine.PARAMETERS_NUMBER];
        for (int i = 0; i < Engine.ROUNDS_NUMBER; i++) {
            int random = Utils.random(NUMBERS_RANGE);
            String answer = isPrimeNumber(random) ? "yes" : "no";
            gameParams[i] = new String[] {Integer.toString(random), answer};
        }
        Engine.game(PRIME_TASK, gameParams);
    }

}
