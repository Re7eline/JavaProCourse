package com.re7eline.players;

import com.re7eline.messages.MessageBuilder;

public class Player {
    private String name;
    private String hand;
    private Integer numberOfGames = 0;
    private Integer numberOfWinGames = 0;
    private Integer numberOfLoseGames = 0;

    public Player() {
    }

    public Player(String name, String hand, Integer numberOfGames, Integer numberOfWinGames, Integer numberOfLoseGames) {
        this.name = name;
        this.hand = hand;
        this.numberOfGames = numberOfGames;
        this.numberOfWinGames = numberOfWinGames;
        this.numberOfLoseGames = numberOfLoseGames;
    }

    @Override
    public String toString() {
        return MessageBuilder.gameStatsMsg();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public Integer getNumberOfGames() {
        return numberOfGames;
    }

    public void setNumberOfGames(Integer numberOfGames) {
        this.numberOfGames = numberOfGames;
    }

    public Integer getNumberOfWinGames() {
        return numberOfWinGames;
    }

    public void setNumberOfWinGames(Integer numberOfWinGames) {
        this.numberOfWinGames = numberOfWinGames;
    }

    public Integer getNumberOfLoseGames() {
        return numberOfLoseGames;
    }

    public void setNumberOfLoseGames(Integer numberOfLoseGames) {
        this.numberOfLoseGames = numberOfLoseGames;
    }
}