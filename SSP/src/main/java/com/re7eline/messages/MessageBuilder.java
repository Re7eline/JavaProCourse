package com.re7eline.messages;

import com.re7eline.services.PlayerService;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import static com.re7eline.colours.MessageColours.*;

public abstract class MessageBuilder {
    public static ResourceBundle resourceBundle;


    public static void getBundle(Locale locale) {
        resourceBundle = ResourceBundle.getBundle("message", locale);

    }
    public static String setLanguage(){
        return resourceBundle.getString("lang");
    }
    public static String setCountry(){
        return resourceBundle.getString("country");
    }

    public static String helloMsg() {
        return MessageFormat.format("{0}{1}", resourceBundle.getString("hello"), PlayerService.player.getName());
    }

    public static String userNameMsg() {
        return MessageFormat.format("{0}{1}{2}", ANSI_BLUE, resourceBundle.getString("name"), ANSI_RESET);
    }

    public static String gamesQuantityMsg() {
        return MessageFormat.format(
                "{0}{1}{2}", ANSI_BLUE, resourceBundle.getString("gamesQuantity"), ANSI_RESET);
    }

    public static String exitMsg() {
        return MessageFormat.format("{0}{1}{2}", ANSI_RED, resourceBundle.getString("exit"),ANSI_RESET);
    }

    public static String attemptsMsg(int quantity) {
        return MessageFormat.format(
                "{0}{1}{2}{3}", ANSI_RED, resourceBundle.getString("attempts"), quantity, ANSI_RESET);
    }

    public static String gameStatsMsg() {
        return MessageFormat.format(
                resourceBundle.getString("gameStat"),
                PlayerService.player.getName(),
                PlayerService.player.getNumberOfGames(),
                PlayerService.player.getNumberOfLoseGames(),
                PlayerService.player.getNumberOfWinGames());
    }

    public static String winRateMsg() {
        return MessageFormat.format(
                resourceBundle.getString("winRate"),
                (double) PlayerService.player.getNumberOfWinGames() / PlayerService.player.getNumberOfGames() * 100);
    }

    public static String noAttemptsErrMsg() {
        return MessageFormat.format(
                "{0}{1}{2}", ANSI_RED, resourceBundle.getString("noAttemptsErr"), ANSI_RESET);
    }

    public static String playerChooseMsg(String hand) {
        return MessageFormat.format(
                "{0}{1}{2}", PlayerService.player.getName(), resourceBundle.getString("playerChoose"), hand);
    }

    public static String computerChooseMsg(String hand) {
        return MessageFormat.format("{0}{1}", resourceBundle.getString("computerChoose"), hand);
    }

    public static String selection() {
        return MessageFormat.format(
                "{0}{1}{2}", ANSI_BLUE, resourceBundle.getString("selection"), ANSI_RESET);
    }
}
