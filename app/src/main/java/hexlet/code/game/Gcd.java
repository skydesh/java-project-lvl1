package hexlet.code.game;

import hexlet.code.Engine;

public class Gcd {
    public static final String GCD_TASK = "Find the greatest common divisor of given numbers.";
    public static final int RANGE_NUMBER = 100;
    public static int evalGcd (int a, int b) {
        int num = Math.min(a, b);
        while(!(a % num == 0 && b % num == 0)) {
            num--;
        }
        return num;
    }
    public static void taskExpression(int a, int b) {
        System.out.println(Engine.QUESTION + a + " " + b);
    }
    public static void game() {
        int count = 0;
        Engine.greet();
        String userName = Engine.getName();
        Engine.explainTask(GCD_TASK);
        while(count < 3) {
            int a = (int)(Math.random() * RANGE_NUMBER);
            int b = (int)(Math.random() * RANGE_NUMBER);
            taskExpression(a, b);
            String answer = Integer.toString(evalGcd(a, b));
            String userAnswer = Engine.getUserAnswer();
            boolean correct = Engine.checkAnswer(answer, userAnswer, userName);
            if (!correct) {
                return;
            }
            count++;
        }
        Engine.printCongratulations(userName);
    }
}
