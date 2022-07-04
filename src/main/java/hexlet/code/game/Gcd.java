package hexlet.code.game;

import hexlet.code.Engine;

public class Gcd {
    public static final String GCD_TASK = "Find the greatest common divisor of given numbers.";
    public static final int RANGE_NUMBER = 100;

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

    public static String[][] game() {
        String[][] gameParam = new String[Engine.NUM_OF_ATTEMPTS][Engine.NUM_OF_PARAM];
        for (int i = 0; i < Engine.NUM_OF_ATTEMPTS; i++) {
            int a = (int) (Math.random() * RANGE_NUMBER + 1);
            int b = (int) (Math.random() * RANGE_NUMBER + 1);
            gameParam[i] = new String[] {taskNumbers(a, b), Integer.toString(evalGcd(a, b))};
        }
        return gameParam;
    }

    public static void toGame() {
        Engine.startGame(GCD_TASK, game());
    }
}
