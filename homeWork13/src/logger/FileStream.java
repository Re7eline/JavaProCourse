package logger;

import enums.GameResult;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static colours.MessageColours.ANSI_GREEN;
import static colours.MessageColours.ANSI_RESET;
import static services.GameImpl.gameResult;
import static services.PlayerService.computer;
import static services.PlayerService.player;

public class FileStream {
    static List<GameResult> listOfGameResults = new ArrayList<GameResult>();
    static Date date = new Date();

    public static void logWrite() {
        FileStream.logger();
    }


    public static void arrayFilling() {
        listOfGameResults.add(gameResult);
    }


    private static void logger() {

        FileWriter fileWriter = null;
        File file = new File("log.txt");

        try {
            System.out.println(ANSI_GREEN + "Results of the game saved: " + ANSI_RESET + file.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        {
            try {
                fileWriter = new FileWriter(file, true);

                for (GameResult line : listOfGameResults) {
                    fileWriter.write("\n" + date + "\n" + gameResult
                            + "\nPlayer|Computer " + player.getHand() + "|" + computer.getHand()
                            + "\nTotal Games|Win games|Lose games" + "\t"
                            + player.getNumberOfGames() + "|" + player.getNumberOfWinGames()
                            + "|" + player.getNumberOfLoseGames());
                    fileWriter.write(System.getProperty("line.separator"));
                }
                fileWriter.flush();

            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    assert fileWriter != null;
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}