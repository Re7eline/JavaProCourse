package enums;
import static colours.MessageColours.*;
import static services.PlayerService.player;

public enum GameResult {
    WIN(player.getName()+" wins"),
    LOSE("Computer wins"),
    DRAW("Nobody wins");
    private String name;

    GameResult(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GameResult: " + name;
    }
}
