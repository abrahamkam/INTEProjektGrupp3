package Integ3.Rogue;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class GameTileTest {
	
	GameTile gameTile;
	Player player;
	Enemy enemy;
	
	private void setup() {
		player = new Player(5,5);
		enemy = new Enemy(2,3, player);
		gameTile = new GameTile();
		gameTile.addActor(player,enemy);
		
	}

	@Test
	public void getGameActorTest() {
		setup();
	//	Assert.assertEquals(new Actor[] {player,enemy}, gameTile);
	}

}


