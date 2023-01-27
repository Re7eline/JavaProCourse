package com.re7eline.services;

import com.re7eline.enums.GameResult;
import com.re7eline.players.Computer;
import com.re7eline.players.Player;

public interface Game {
    GameResult startGame(Player player, Computer computer);

    Player playerTurn(Player player);

    Computer computerTurn(Computer computer);
}
