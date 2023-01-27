package com.re7eline.enums;

import com.re7eline.messages.EnumNamesBuilder;

import static com.re7eline.services.PlayerService.player;

public enum GameResult {
    WIN(player.getName()+ EnumNamesBuilder.playerWinsMsg()),
    LOSE(EnumNamesBuilder.computerWinsMsg()),
    DRAW(EnumNamesBuilder.drawMsg());
    private String name;

    GameResult(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return EnumNamesBuilder.gameResultMsg() + name;
    }
}
