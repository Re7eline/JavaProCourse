package services;

import org.junit.Test;

import static enums.GameResult.LOSE;
import static enums.GameResult.WIN;
import static org.junit.Assert.*;
import static services.PlayerService.computer;
import static services.PlayerService.player;


public class GameImplTest {

    @Test
    public void startGame() {
        PlayerService ps = new PlayerService();
        Game game = new GameImpl();
        assertNotNull(ps);
        assertNotNull(player);
        assertNotNull(computer);
        assertNotNull(game);
        player.setName("Alex");
        player.setHand("ROCK");
        computer.setHand("ROCK");
        assertEquals("Alex", player.getName());
        assertEquals("ROCK", player.getHand());
        assertEquals("ROCK", computer.getHand());
        assertEquals(player.getHand(), computer.getHand());
        computer.setHand("PAPER");
        assertNotEquals(player.getHand(), computer.getHand());
        assertNotEquals("1", player.getNumberOfGames());
        assertNotEquals("1", player.getNumberOfWinGames());
        assertEquals(LOSE, game.startGame(player, computer));
        player.setHand("SCISSORS");
        assertEquals(WIN, game.startGame(player, computer));


    }

    @Test
    public void playerTurn() {
        PlayerService ps = new PlayerService();
        Game game = new GameImpl();
        player.setName("Alex");
        assertNotNull(game);
        assertNotNull(ps);
        assertNotNull(player);
        assertEquals("Alex", player.getName());
        player.setHand("PAPER");
        assertNotEquals("SCISSORS", player.getHand());
    }

    @Test
    public void computerTurn() {
        PlayerService ps = new PlayerService();
        Game game = new GameImpl();
        assertNotNull(game);
        assertNotNull(ps);
        assertNotNull(computer);
        computer.setHand("SCISSORS");
        assertEquals("SCISSORS", computer.getHand());
    }
}