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

    public static void startGame() {
        String[][] gameParams = new String[Engine.ROUNDS_NUMBER][Engine.PARAMETERS_NUMBER];
        for (int i = 0; i < Engine.ROUNDS_NUMBER; i++) {
            int a = Utils.random(MIN_RANGE, MAX_RANGE);
            int b = Utils.random(MIN_RANGE, MAX_RANGE);
            gameParams[i] = new String[]{String.format("%d %d", a, b), Integer.toString(evalGcd(a, b))};
        }
        Engine.game(GCD_TASK, gameParams);
    }
}
