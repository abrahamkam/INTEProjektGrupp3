package Integ3.Rogue;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GameTileTest {
	




	@Test
	public void getGameActorTest() {
		GameTile gameTile= new GameTile();
		Player player = new Player(5,5);
		Enemy enemy = new Enemy(2,3);
		gameTile.addActor(enemy);
		gameTile.addActor(player);
		assertTrue(gameTile.getGameActors().get(0).equals(enemy) && gameTile.getGameActors().get(1).equals(player));
	}

}


