package services;

import enums.GameResult;
import players.Computer;
import players.Player;

public interface Game {
    GameResult startGame(Player player, Computer computer);

    Player playerTurn(Player player);

    Computer computerTurn(Computer computer);

}
