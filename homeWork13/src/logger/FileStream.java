package logger;

import enums.GameResult;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static colours.MessageColours.ANSI_GREEN;
import static colours.MessageColours.ANSI_RESET;
import static services.GameImpl.gameResult;
import static services.PlayerService.computer;
import static services.PlayerService.player;

public class FileStream {
    static List<GameResult> listOfGameResults = new ArrayList<GameResult>();
    static Date date = new Date();

    public static void logWriteAccept() {
        Scanner sc = new Scanner(System.in);
        System.out.println(ANSI_GREEN + "Do you want to write results in file?[Y/N]" + ANSI_RESET);
        String choose = sc.next();
        if (choose.equalsIgnoreCase("y")) {
            FileStream.logger();
        }
    }


    public static void arrayFilling() {
        listOfGameResults.add(gameResult);
    }


    private static void logger() {

        FileWriter fileWriter = null;
        File file = new File("homeWork13/src/logger/log.txt");

        try {
            System.out.println(file.getCanonicalPath() + " file exists? " + file.exists());
        } catch (IOException e) {
            e.printStackTrace();
        }

        {
            try {
                fileWriter = new FileWriter(file, true);

                for (GameResult line : listOfGameResults) {
                    fileWriter.write(date + "\t|| " + line + "\t|| Player choose: " + player.getHand()
                            + "\t|| Computer choose: " + computer.getHand());
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