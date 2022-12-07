import services.Game;
import services.GameImpl;
import services.PlayerService;

import java.util.Scanner;

import static colours.MessageColours.ANSI_BLUE;
import static colours.MessageColours.ANSI_RESET;
import static services.PlayerService.computer;
import static services.PlayerService.player;

public class GameMain {

    public static void main(String[] args) {
        String continueGame = "Y";
        int gamesQuantity;
        Scanner sc = new Scanner(System.in);
        PlayerService ps = new PlayerService();
        Game game = new GameImpl();
        System.out.println(ANSI_BLUE + "Enter the quantity of games" + ANSI_RESET);
        gamesQuantity = sc.nextInt();

        game.startGame(ps.addPlayer(), ps.addComputer());
        gamesQuantity--;

        while (!continueGame.equalsIgnoreCase("N")) {
            if (gamesQuantity > 0) {
                game.startGame(player, computer);
                System.out.println("Attempts left: " + --gamesQuantity);
            } else {
                System.out.println(player.getName() + " played " + player.getNumberOfGames() + " games." +
                        "\nYou lose: " + player.getNumberOfLoseGames() + " games" +
                        "\nYou won: " + player.getNumberOfWinGames() + " games");
                System.out.println("Win rate: " +
                        (double) player.getNumberOfWinGames() / player.getNumberOfGames() * 100 + "%");
                System.out.println();
                System.err.println("No more attempts. Do you want to continue?[Y/N]");
                continueGame = sc.next();

                if (continueGame.equalsIgnoreCase("y")) {
                    System.out.println(ANSI_BLUE + "Enter the quantity of games" + ANSI_RESET);
                    gamesQuantity = sc.nextInt();
                }
            }
        }
    }
}



