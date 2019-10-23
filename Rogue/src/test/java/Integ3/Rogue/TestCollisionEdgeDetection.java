package Integ3.Rogue;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestCollisionEdgeDetection {


    private int xCoordinate, yCoordinate;
   
    //Assuming Gamescreen is 500x500
	
    ////////RIGHT SIDE
    
	@Test
	public void testIsCollisionWithEdgeBigX() {


		xCoordinate = 500;
		yCoordinate = 100;
		assertTrue(GameScreen.isCollisionWithEdge(xCoordinate,yCoordinate));
	}
	
	@Test
	public void testNoCollisionWithEdgeBigX() {
		xCoordinate = 499;
		yCoordinate = 100;
		assertFalse(GameScreen.isCollisionWithEdge(xCoordinate,yCoordinate));
	}

	//// LEFT SIDE
	
	@Test
	public void testIsCollisionWithEdgeSmallX() {


		xCoordinate = 0;
		yCoordinate = 100;
		assertTrue(GameScreen.isCollisionWithEdge(xCoordinate,yCoordinate));
	}
	
	@Test
	public void testNoCollisionWithEdgeSmallX() {
		xCoordinate = 1;
		yCoordinate = 100;
		assertFalse(GameScreen.isCollisionWithEdge(xCoordinate,yCoordinate));
	}
	
	///BOTTOM SIDE
	
	@Test
	public void testIsCollisionWithEdgeBigY() {
		xCoordinate = 100;
		yCoordinate = 500;
		assertTrue(GameScreen.isCollisionWithEdge(xCoordinate,yCoordinate));
	}
	
	@Test
	public void testNoCollisionWithEdgeBigY() {
		xCoordinate = 100;
		yCoordinate = 499;
		assertFalse(GameScreen.isCollisionWithEdge(xCoordinate,yCoordinate));
	}

	//TOP SIDE
	
	@Test
	public void testIsCollisionWithEdgeSmallY() {
		xCoordinate = 100;
		yCoordinate = 0;
		assertTrue(GameScreen.isCollisionWithEdge(xCoordinate,yCoordinate));
	}

	@Test
	public void testNoCollisionWithEdgeSmallY() {
		xCoordinate = 100;
		yCoordinate = 1;
		assertFalse(GameScreen.isCollisionWithEdge(xCoordinate,yCoordinate));
	}

}