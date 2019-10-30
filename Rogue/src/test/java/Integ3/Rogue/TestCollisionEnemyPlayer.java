package Integ3.Rogue;

import static org.junit.Assert.*;

import org.junit.Test;
import Integ3.Rogue.GameScreen;

public class TestCollisionEnemyPlayer {


    private int playerXCoordinate, playerYCoordinate, enemyXCoordinate, enemyYCoordinate;
    private GameScreen gameScreen;
    ///Assuming that the total length of player is 100 (50 on each side of coordinate in the middle)
		

    /// LEFT SIDE
    
	@Test
	public void testIsCollisionWithEnemyXLeft() {
		
		playerXCoordinate = 100;
		playerYCoordinate = 100;
		enemyXCoordinate = 51;
		enemyYCoordinate = 100;
		
		gameScreen = new GameScreen(playerXCoordinate,playerYCoordinate,enemyXCoordinate,enemyYCoordinate);

		assertTrue(gameScreen.isCollisionWithEnemy());

	}
	
	@Test
	public void testNoCollisionWithEnemXLeft() {


		playerXCoordinate = 100;
		playerYCoordinate = 100;
		enemyXCoordinate = 49;
		enemyYCoordinate = 100;

		gameScreen = new GameScreen(playerXCoordinate,playerYCoordinate,enemyXCoordinate,enemyYCoordinate);
		
		assertFalse(gameScreen.isCollisionWithEnemy());
	}

	//// RIGHT SIDE
	
	@Test
	public void testIsCollisionWithEnemyXRight() {


		playerXCoordinate = 100;
		playerYCoordinate = 100;
		enemyXCoordinate = 149;
		enemyYCoordinate = 100;

		gameScreen = new GameScreen(playerXCoordinate,playerYCoordinate,enemyXCoordinate,enemyYCoordinate);
		
		assertTrue(gameScreen.isCollisionWithEnemy());

	}
	
	@Test
	public void testNoCollisionWithEnemXRight() {


		playerXCoordinate = 100;
		playerYCoordinate = 100;
		enemyXCoordinate = 151;
		enemyYCoordinate = 100;

		gameScreen = new GameScreen(playerXCoordinate,playerYCoordinate,enemyXCoordinate,enemyYCoordinate);
		
		assertFalse(gameScreen.isCollisionWithEnemy());
	}

	//// TOP
	
	@Test
	public void testIsCollisionWithEnemyYTop() {

		playerXCoordinate = 120;
		playerYCoordinate = 100;
		enemyXCoordinate = 100;
		enemyYCoordinate = 51;

		gameScreen = new GameScreen(playerXCoordinate,playerYCoordinate,enemyXCoordinate,enemyYCoordinate);
		
		assertTrue(gameScreen.isCollisionWithEnemy());

	}
	
	@Test
	public void testNoCollisionWithEnemYTop() {


		playerXCoordinate = 120;
		playerYCoordinate = 100;
		enemyXCoordinate = 100;
		enemyYCoordinate = 49;

		gameScreen = new GameScreen(playerXCoordinate,playerYCoordinate,enemyXCoordinate,enemyYCoordinate);
		
		assertFalse(gameScreen.isCollisionWithEnemy());
	}
	
	///// BOTTOM
	
	
	@Test
	public void testIsCollisionWithEnemyYBottom() {

		playerXCoordinate = 120;
		playerYCoordinate = 100;
		enemyXCoordinate = 100;
		enemyYCoordinate = 149;

		gameScreen = new GameScreen(playerXCoordinate,playerYCoordinate,enemyXCoordinate,enemyYCoordinate);
		
		assertTrue(gameScreen.isCollisionWithEnemy());

	}
	
	@Test
	public void testNoCollisionWithEnemYBottom() {

		playerXCoordinate = 120;
		playerYCoordinate = 100;
		enemyXCoordinate = 100;
		enemyYCoordinate = 151;

		gameScreen = new GameScreen(playerXCoordinate,playerYCoordinate,enemyXCoordinate,enemyYCoordinate);
		
		assertFalse(gameScreen.isCollisionWithEnemy());
	}

}