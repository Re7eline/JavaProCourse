package services;

import players.Computer;
import players.Player;

import java.util.Random;
import java.util.Scanner;

import static colours.MessageColours.*;
import static enums.GameResult.*;
import static enums.RSP.*;

public class GameImpl implements Game {
    @Override
    public void startGame(Player player, Computer computer) {
        String computerHand = computerTurn(computer);
        String playerHand = playerTurn(player);
        System.out.println(ANSI_CYAN + player.getName() + " choose: " + playerHand);
        System.out.println(ANSI_CYAN + "Computer choose: " + computerHand + ANSI_RESET);
        System.out.println();

        if ((playerHand.equals("ROCK") && computerHand.equals("PAPER"))
                || (playerHand.equals("PAPER") && computerHand.equals("SCISSORS"))
                || (playerHand.equals("SCISSORS") && computerHand.equals("ROCK"))) {
            player.setNumberOfLoseGames(player.getNumberOfLoseGames() + 1);
            System.out.println(LOSE);
        } else if ((playerHand.equals("PAPER") && computerHand.equals("ROCK"))
                || (playerHand.equals("SCISSORS") && computerHand.equals("PAPER"))
                || (playerHand.equals("ROCK") && computerHand.equals("SCISSORS"))) {
            player.setNumberOfWinGames(player.getNumberOfWinGames() + 1);
            System.out.println(WIN);
        } else System.out.println(DRAW);
        player.setNumberOfGames(player.getNumberOfGames() + 1);
        System.out.println();

    }

    @Override
    public String playerTurn(Player player) {
        Scanner sc = new Scanner(System.in);
        System.out.print(ANSI_BLUE + "Enter: \n'1' Rock, \n'2' Scissors \n'3' Paper, \n'e' to Exit\n" + ANSI_RESET);
        String userChoose = sc.nextLine();
        if (userChoose.equals("1") || userChoose.equals("2") || userChoose.equals("3")
                || userChoose.equalsIgnoreCase("e")) {
            switch (userChoose) {
                case "1" -> player.setHand(String.valueOf(ROCK));
                case "2" -> player.setHand(String.valueOf(SCISSORS));
                case "3" -> player.setHand(String.valueOf(PAPER));
                case "e" -> {
                    System.out.println(ANSI_RED + "Exiting...");
                    System.exit(0);
                }
            }
            return player.getHand();
        }
        return playerTurn(player);
    }

    @Override
    public String computerTurn(Computer computer) {
        Random random = new Random();
        int computerChoose = random.nextInt(3);
        switch (computerChoose) {
            case 0 -> computer.setHand(String.valueOf(ROCK));
            case 1 -> computer.setHand(String.valueOf(SCISSORS));
            case 2 -> computer.setHand(String.valueOf(PAPER));
        }
        return computer.getHand();
    }
}