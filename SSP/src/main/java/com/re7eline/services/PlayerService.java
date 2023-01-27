package com.re7eline.services;

import com.re7eline.messages.MessageBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.re7eline.players.Computer;
import com.re7eline.players.Player;

import java.util.Scanner;

public class PlayerService {
    private static final Logger console = LoggerFactory.getLogger("console");
    public static Player player = new Player();
    public static Computer computer = new Computer();

    public Player addPlayer() {
        console.info(MessageBuilder.userNameMsg());
        Scanner sc = new Scanner(System.in);
        player.setName(sc.next());
        console.info(MessageBuilder.helloMsg());
        return player;
    }

    public Computer addComputer() {
        return computer;
    }
}
