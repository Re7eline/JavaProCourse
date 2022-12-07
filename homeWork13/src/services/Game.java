package services;

import enums.GameResult;
import players.Computer;
import players.Player;

public interface Game {
  void  startGame(Player player, Computer computer);
    String playerTurn(Player player);
    String computerTurn(Computer computer);

}
