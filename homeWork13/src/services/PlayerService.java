package services;

import players.Computer;
import players.Player;

import java.util.Scanner;

import static colours.MessageColours.ANSI_BLUE;
import static colours.MessageColours.ANSI_RESET;

public class PlayerService {
    public static Player player = new Player();
    public static Computer computer = new Computer();


    public Player addPlayer() {
        System.out.println(ANSI_BLUE + "Enter your name please" + ANSI_RESET);
        Scanner sc = new Scanner(System.in);
        player.setName(sc.next());
        return player;
    }

    public Computer addComputer() {
        return computer;
    }

}
