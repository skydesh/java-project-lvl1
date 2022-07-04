package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final String MESSAGE_CORRECT = "Correct!";
    private static final String CONGRATULATIONS = "Congratulations, ";
    private static final String QUESTION = "Question: ";
    private static final String USER_ANSWER = "Your answer: ";
    private static final String GREETING = "Welcome to the Brain Games!";
    public static final int NUM_OF_ATTEMPTS = 3;
    public static final int NUM_OF_PARAM = 2;
    public static Scanner scanner() {
        return new Scanner(System.in);
    }
    public static void errorMessage(String answer, String userAnswer, String name) {
        System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                + "'" + answer + "'" + ".\n" + "Let's try again, " + name + "!");
    }
    public static String getUserAnswer() {
        System.out.print(USER_ANSWER);
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();
    }
    public static boolean checkAnswer(String answer, String userAnswer, String name) {
        if (userAnswer.equals(answer)) {
            System.out.println(MESSAGE_CORRECT);
        } else {
            errorMessage(answer, userAnswer, name);
            return false;
        }
        return true;
    }
    public static void printCongratulations(String name) {
        System.out.println(CONGRATULATIONS + name + "!");
    }
    public static int random(int range) {
        return (int) (Math.random() * range);
    }
    public static void getGameTask(String task) {
        System.out.println(task);
    }

    public static String greet() {
        System.out.println(GREETING);
        System.out.print("May I have your name? ");
        String name = getName();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static void getQuestion(String question) {
        System.out.println(QUESTION + question);
    }

    public static String getName() {
        Scanner scn = scanner();
        return scn.nextLine();
    }

    public static void startGame(String task, String[][] game) {
        String name = greet();
        getGameTask(task);
        boolean correctAnswer;
        for (int i = 0; i < NUM_OF_ATTEMPTS; i++) {
            getQuestion(game[i][0]);
            correctAnswer = checkAnswer(game[i][1], getUserAnswer(), name);
            if (!correctAnswer) {
                return;
            }
        }
        printCongratulations(name);
    }
}
