package enums;

import colours.MessageColours;

import static colours.MessageColours.*;
import static services.PlayerService.player;

public enum GameResult {
    WIN(ANSI_GREEN+player.getName()+" wins"+ANSI_RESET ),
    LOSE(ANSI_RED+"Computer wins"+ANSI_RESET),
    DRAW(ANSI_BLUE+"Nobody wins"+ANSI_RESET);
    private String name;

    GameResult(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GameResult: " + name;
    }
}
