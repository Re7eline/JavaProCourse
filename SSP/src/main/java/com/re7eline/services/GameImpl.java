package com.re7eline.services;

import com.re7eline.enums.GameResult;
import com.re7eline.enums.RSP;
import com.re7eline.messages.MessageBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.re7eline.players.Computer;
import com.re7eline.players.Player;

import java.util.Random;
import java.util.Scanner;

public class GameImpl implements Game {

    private static final Logger console = LoggerFactory.getLogger("console");
    private static final Logger logger = LoggerFactory.getLogger("logger");

    public static GameResult gameResult;

    @Override
    public GameResult startGame(Player player, Computer computer) {
        String computerHand = computer.getHand();
        String playerHand = player.getHand();

        console.info(MessageBuilder.playerChooseMsg(playerHand));
        console.info(MessageBuilder.computerChooseMsg(computerHand));
        System.out.println();

        if ((playerHand.equals(RSP.ROCK.toString()) && computerHand.equals(RSP.PAPER.toString()))
                || (playerHand.equals(RSP.PAPER.toString()) && computerHand.equals(RSP.SCISSORS.toString()))
                || (playerHand.equals(RSP.SCISSORS.toString()) && computerHand.equals(RSP.ROCK.toString()))) {
            player.setNumberOfLoseGames(player.getNumberOfLoseGames() + 1);
            console.info(String.valueOf(gameResult = GameResult.LOSE));
        } else if ((playerHand.equals(RSP.PAPER.toString()) && computerHand.equals(RSP.ROCK.toString()))
                || (playerHand.equals(RSP.SCISSORS.toString()) && computerHand.equals(RSP.PAPER.toString()))
                || (playerHand.equals(RSP.ROCK.toString()) && computerHand.equals(RSP.SCISSORS.toString()))) {
            player.setNumberOfWinGames(player.getNumberOfWinGames() + 1);
            console.info(String.valueOf(gameResult = GameResult.WIN));
        } else console.info(String.valueOf(gameResult = GameResult.DRAW));

        player.setNumberOfGames(player.getNumberOfGames() + 1);
        System.out.println();
        logger.info(String.valueOf(gameResult));
        return gameResult;
    }

    @Override
    public Player playerTurn(Player player) {
        Scanner sc = new Scanner(System.in);
        console.info(MessageBuilder.selection());
        String userChoose = sc.nextLine();
        if (userChoose.equals("1")
                || userChoose.equals("2")
                || userChoose.equals("3")
                || userChoose.equalsIgnoreCase("E")) {
            switch (userChoose) {
                case "1" -> player.setHand(String.valueOf(RSP.ROCK));
                case "2" -> player.setHand(String.valueOf(RSP.SCISSORS));
                case "3" -> player.setHand(String.valueOf(RSP.PAPER));
                case "E", "e" -> {
                    console.info(MessageBuilder.exitMsg());
                    System.exit(0);
                }
            }
            logger.info(MessageBuilder.playerChooseMsg(player.getHand()));
            return player;
        }
        return playerTurn(player);
    }

    @Override
    public Computer computerTurn(Computer computer) {
        Random random = new Random();
        int computerChoose = random.nextInt(3);
        switch (computerChoose) {
            case 0 -> computer.setHand(String.valueOf(RSP.ROCK));
            case 1 -> computer.setHand(String.valueOf(RSP.SCISSORS));
            case 2 -> computer.setHand(String.valueOf(RSP.PAPER));
        }
        logger.info(MessageBuilder.computerChooseMsg(computer.getHand()));
        return computer;
    }
}