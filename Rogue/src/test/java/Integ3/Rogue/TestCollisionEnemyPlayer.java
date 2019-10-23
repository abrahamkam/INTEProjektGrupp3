package Integ3.Rogue;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCollisionEnemyPlayer {


    private int playerXCoordinate, playerYCoordinate, enemyXCoordinate, enemyYCoordinate;

    ///Assuming that the total lengt of player is 100 (50 on each side of coordinate in the middle)
		

    /// LEFT SIDE
    
	@Test
	public void testIsCollisionWithEnemyXLeft() {


		playerXCoordinate = 100;
		playerYCoordinate = 100;
		enemyXCoordinate = 51;
		enemyYCoordinate = 100;

		assertTrue(GameScreen.isCollisionWithEnemy(playerXCoordinate,playerYCoordinate,enemyXCoordinate,enemyYCoordinate));

	}
	
	@Test
	public void testNoCollisionWithEnemXLeft() {


		playerXCoordinate = 100;
		playerYCoordinate = 100;
		enemyXCoordinate = 49;
		enemyYCoordinate = 100;

		assertFalse(GameScreen.isCollisionWithEnemy(playerXCoordinate,playerYCoordinate,enemyXCoordinate,enemyYCoordinate));
	}

	//// RIGHT SIDE
	
	@Test
	public void testIsCollisionWithEnemyXRight() {


		playerXCoordinate = 100;
		playerYCoordinate = 100;
		enemyXCoordinate = 149;
		enemyYCoordinate = 100;

		assertTrue(GameScreen.isCollisionWithEnemy(playerXCoordinate,playerYCoordinate,enemyXCoordinate,enemyYCoordinate));

	}
	
	@Test
	public void testNoCollisionWithEnemXRight() {


		playerXCoordinate = 100;
		playerYCoordinate = 100;
		enemyXCoordinate = 151;
		enemyYCoordinate = 100;

		assertFalse(GameScreen.isCollisionWithEnemy(playerXCoordinate,playerYCoordinate,enemyXCoordinate,enemyYCoordinate));
	}

	//// TOP
	
	@Test
	public void testIsCollisionWithEnemyYTop() {

		playerXCoordinate = 120;
		playerYCoordinate = 100;
		enemyXCoordinate = 100;
		enemyYCoordinate = 51;

		assertTrue(GameScreen.isCollisionWithEnemy(playerXCoordinate,playerYCoordinate,enemyXCoordinate,enemyYCoordinate));

	}
	
	@Test
	public void testNoCollisionWithEnemYTop() {


		playerXCoordinate = 120;
		playerYCoordinate = 100;
		enemyXCoordinate = 100;
		enemyYCoordinate = 49;

		assertFalse(GameScreen.isCollisionWithEnemy(playerXCoordinate,playerYCoordinate,enemyXCoordinate,enemyYCoordinate));
	}
	
	///// BOTTOM
	
	
	@Test
	public void testIsCollisionWithEnemyYBottom() {

		playerXCoordinate = 120;
		playerYCoordinate = 100;
		enemyXCoordinate = 100;
		enemyYCoordinate = 149;

		assertTrue(GameScreen.isCollisionWithEnemy(playerXCoordinate,playerYCoordinate,enemyXCoordinate,enemyYCoordinate));

	}
	
	@Test
	public void testNoCollisionWithEnemYBottom() {

		playerXCoordinate = 120;
		playerYCoordinate = 100;
		enemyXCoordinate = 100;
		enemyYCoordinate = 151;

		assertFalse(GameScreen.isCollisionWithEnemy(playerXCoordinate,playerYCoordinate,enemyXCoordinate,enemyYCoordinate));
	}

}