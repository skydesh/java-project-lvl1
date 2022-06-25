package hexlet.code.game;

import hexlet.code.Engine;

public class Calc {
    private static final int SUM = 1;
    public static final int SUBTRACTION = 2;
    public static final String MATH_SUM = " + ";
    public static final String MATH_SUBTRACTION = " - ";
    public static final String MATH_MULTIPLICATION = " * ";
    private static final String CALC_TASK = "What is the result of the expression?";
    public static final int RANGE_NUMBER = 11;
    public static final int NUM_OF_OPERATIONS = 3;
    private static int a;
    private static int b;

    private static int taskExpression(int y, int z, String mathOperator) {
        System.out.println(Engine.QUESTION + y + mathOperator + z);
        return switch (mathOperator) {
            case MATH_SUM -> y + z;
            case MATH_SUBTRACTION -> y - z;
            default -> y * z;
        };
    }

    private static int taskSelector() {
        int expressionNum = (int) (Math.random() * NUM_OF_OPERATIONS);
        return switch (expressionNum) {
            case SUM -> taskExpression(a, b, MATH_SUM);
            case SUBTRACTION -> taskExpression(a, b, MATH_SUBTRACTION);
            default -> taskExpression(a, b, MATH_MULTIPLICATION);
        };
    }

    public static void game() {
        int count = 0;
        String userName = Engine.greetGetName(CALC_TASK);
        while (count < Engine.NUM_OF_ATTEMPTS) {
            a = (int) (Math.random() * RANGE_NUMBER);
            b = (int) (Math.random() * RANGE_NUMBER);
            String answer = Integer.toString(taskSelector());
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