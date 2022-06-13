package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final String MESSAGE_CORRECT = "Correct!";
    public static final String GREETING = "Welcome to the Brain Games!";
    private static final String CONGRATULATIONS = "Congratulations, ";
    public static final String QUESTION = "Question: ";
    private static String name;
    public static String getName() {
        return name;
    }
    public static void greet() {
        System.out.println(GREETING);
        Scanner scn = new Scanner(System.in);
        System.out.print("May I have your name? ");
        name = scn.next();
        System.out.println("Hello, " + name + "!");
    }
    public static void explainTask(String task) {
        System.out.println(task);
    }
    public static void errorMessage(String answer, String userAnswer, String name) {
        System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                + "'" + answer + "'" + ".\n" + "Let's try again, " + name);
    }
    public static String getUserAnswer() {
        System.out.print("Your answer: ");
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();
    }
    public static boolean checkAnswer(String answer, String userAnswer, String name) {
        if (userAnswer.equals(answer)) {
            System.out.println(MESSAGE_CORRECT);
            return true;
        } else {
            errorMessage(answer, userAnswer, name);
        }
        return false;
    }
    public static void printCongratulations(String name) {
        System.out.println(CONGRATULATIONS + name + "!");
    }
    public static int random(int range) {
        return (int) (Math.random() * range);
    }
}
