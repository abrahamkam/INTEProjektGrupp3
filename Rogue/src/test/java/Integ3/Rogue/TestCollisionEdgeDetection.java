package Integ3.Rogue;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

import org.junit.Test;
import Integ3.Rogue.GameScreen;

public class TestCollisionEdgeDetection {


    private int xCoordinate, yCoordinate;
	private GameScreen gameScreen;
    ////////RIGHT SIDE
	
	//Assuming Gamescreen is 500x500
    
	@Test
	public void testIsCollisionWithEdgeBigX() {
		
		xCoordinate = 500;
		yCoordinate = 100;
		
		gameScreen = new GameScreen(xCoordinate,yCoordinate,0,0);
		
		assertTrue(gameScreen.isCollisionWithEdge());
	}
	
	@Test
	public void testNoCollisionWithEdgeBigX() {
		xCoordinate = 499;
		yCoordinate = 100;
		gameScreen = new GameScreen(xCoordinate,yCoordinate,0,0);
		
		assertFalse(gameScreen.isCollisionWithEdge());
	}

	//// LEFT SIDE
	
	@Test
	public void testIsCollisionWithEdgeSmallX() {

		xCoordinate = 0;
		yCoordinate = 100;
		gameScreen = new GameScreen(xCoordinate,yCoordinate,0,0);
		assertTrue(gameScreen.isCollisionWithEdge());
	}
	
	@Test
	public void testNoCollisionWithEdgeSmallX() {
		xCoordinate = 1;
		yCoordinate = 100;
		gameScreen = new GameScreen(xCoordinate,yCoordinate,0,0);
		assertFalse(gameScreen.isCollisionWithEdge());
	}
	
	///BOTTOM SIDE
	
	@Test
	public void testIsCollisionWithEdgeBigY() {
		xCoordinate = 100;
		yCoordinate = 500;
		gameScreen = new GameScreen(xCoordinate,yCoordinate,0,0);
		assertTrue(gameScreen.isCollisionWithEdge());
	}
	
	@Test
	public void testNoCollisionWithEdgeBigY() {
		xCoordinate = 100;
		yCoordinate = 499;
		gameScreen = new GameScreen(xCoordinate,yCoordinate,0,0);
		assertFalse(gameScreen.isCollisionWithEdge());
	}

	//TOP SIDE
	
	@Test
	public void testIsCollisionWithEdgeSmallY() {
		xCoordinate = 100;
		yCoordinate = 0;
		gameScreen = new GameScreen(xCoordinate,yCoordinate,0,0);
		assertTrue(gameScreen.isCollisionWithEdge());
	}

	@Test
	public void testNoCollisionWithEdgeSmallY() {
		xCoordinate = 100;
		yCoordinate = 1;
		gameScreen = new GameScreen(xCoordinate,yCoordinate,0,0);
		assertFalse(gameScreen.isCollisionWithEdge());
	}
	
}