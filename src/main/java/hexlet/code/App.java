package hexlet.code;

import hexlet.code.game.Calc;
import hexlet.code.game.Even;
import hexlet.code.game.Gcd;
import hexlet.code.game.Prime;
import hexlet.code.game.Progression;

import java.util.Scanner;

public class App {
    private static final String GAME_SELECTOR =
            "Please enter the game number and press Enter.";

    public static void main(String[] args) {
        Scanner scn = Engine.scanner();
        System.out.println(GAME_SELECTOR);
        System.out.print("""
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);
        System.out.print("Your choice: ");
        String userChoice = scn.nextLine();

        switch (userChoice) {
            case "1" -> Cli.greet();
            case "2" -> Even.toGame();
            case "3" -> Calc.toGame();
            case "4" -> Gcd.toGame();
            case "5" -> Progression.toGame();
            case "6" -> Prime.toGame();
            case "0" -> System.exit(0);
            default -> {
                System.err.println("'" + userChoice + "' "
                    + "is wrong number. Please choose a number from the list when the game is started.");
                System.exit(1);
            }
        }
        scn.close();
    }
}
