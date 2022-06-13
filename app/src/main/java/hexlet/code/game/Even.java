package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    private static final String RULES = "Answer 'yes' if number even otherwise answer 'no'.";
    public static void game () {
        System.out.println(Engine.GREETING);
        System.out.println(RULES);
        Scanner scn = new Scanner(System.in);
        Engine.greet();
        String name = Engine.getName();
        int count = 0;
        while (count < 3) {
            int random = (int) Math.floor(Math.random() * 100 + 1);
            String answer = random % 2 == 0 ? "yes" : "no";
            System.out.println("Question: " + random);
            System.out.print("Your answer: ");
            String userAnswer = scn.nextLine();
            boolean correct = Engine.checkAnswer(answer, userAnswer, name);
            if (!correct) {
                return;
            }
            count++;
        }
        Engine.printCongratulations(name);
    };
}
