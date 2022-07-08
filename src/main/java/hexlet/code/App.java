package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    private static final String GAME_SELECTOR =
            "Please enter the game number and press Enter.";

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
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
            case "2" -> Even.startGame();
            case "3" -> Calc.startGame();
            case "4" -> Gcd.startGame();
            case "5" -> Progression.startGame();
            case "6" -> Prime.startGame();
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
