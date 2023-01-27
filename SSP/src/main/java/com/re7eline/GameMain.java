package com.re7eline;

import com.re7eline.locale.LocaleChange;
import com.re7eline.messages.MessageBuilder;
import com.re7eline.services.Game;
import com.re7eline.services.GameImpl;
import com.re7eline.services.PlayerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;
import java.util.Scanner;

import static com.re7eline.locale.LocaleChange.defLocale;
import static com.re7eline.services.PlayerService.computer;
import static com.re7eline.services.PlayerService.player;

public class GameMain {

    private static final Logger console = LoggerFactory.getLogger("console");
    private static final Logger logger = LoggerFactory.getLogger("logger");

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MessageBuilder.getBundle(new Locale("uk", "UA"));


        if (args.length != 0) {
            LocaleChange.changeLocale(args[0],args[1]);
        } else {
            console.info(MessageBuilder.setCountry());
            String country = sc.next().toUpperCase();

            console.info(MessageBuilder.setLanguage());
            String lang = sc.next().toLowerCase();

            LocaleChange.changeLocale(lang,country);
            MessageBuilder.getBundle(defLocale);
        }

        String continueGame = "Y";
        int gamesQuantity;

        PlayerService ps = new PlayerService();
        Game game = new GameImpl();

        console.info(MessageBuilder.gamesQuantityMsg());
        gamesQuantity = sc.nextInt();
        ps.addPlayer();

        while (!continueGame.equalsIgnoreCase("N")) {

            if (gamesQuantity > 0) {
                game.playerTurn(player);
                game.computerTurn(computer);
                game.startGame(player, computer);

                console.info(MessageBuilder.attemptsMsg(--gamesQuantity));

                System.out.println();

            } else {
                console.info(MessageBuilder.gameStatsMsg());
                logger.info(MessageBuilder.gameStatsMsg());

                console.info(MessageBuilder.winRateMsg());
                logger.info(MessageBuilder.winRateMsg());

                System.out.println();

                console.info(MessageBuilder.noAttemptsErrMsg());

                continueGame = sc.next();

                if (continueGame.equalsIgnoreCase("y")) {

                    console.info(MessageBuilder.gamesQuantityMsg());

                    gamesQuantity = sc.nextInt();
                } else {
                    console.info(MessageBuilder.exitMsg());
                    System.exit(0);
                }
            }
        }
    }
}
