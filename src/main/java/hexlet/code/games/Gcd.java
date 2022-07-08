package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    private static final String GCD_TASK = "Find the greatest common divisor of given numbers.";
    private static final int MAX_RANGE = 100;
    private static final int MIN_RANGE = 1;

    public static int evalGcd(int a, int b) {
        int num = Math.min(a, b);
        while (!(a % num == 0 && b % num == 0)) {
            num--;
            if (num == 0) {
                return 1;
            }
        }
        return num;
    }

    public static String taskNumbers(int a, int b) {
        return a + " " + b;
    }

    public static String[][] gameParameters() {
        String[][] gameParam = new String[Engine.NUM_OF_ATTEMPTS][Engine.NUM_OF_PARAM];
        for (int i = 0; i < Engine.NUM_OF_ATTEMPTS; i++) {
            int a = Utils.random(MIN_RANGE, MAX_RANGE);
            int b = Utils.random(MIN_RANGE, MAX_RANGE);
            gameParam[i] = new String[]{taskNumbers(a, b), Integer.toString(evalGcd(a, b))};
        }
        return gameParam;
    }

    public static void startGame() {
        Engine.game(GCD_TASK, gameParameters());
    }
}
