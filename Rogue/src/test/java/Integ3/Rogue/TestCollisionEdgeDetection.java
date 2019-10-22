package Integ3.Rogue;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestCollisionEdgeDetection {

	
	////TEST!!!!!!!

    @Test
    public void truthTest(){
        assertTrue(true);
    }

    private int xCoordinate, yCoordinate;
    ///TEST HALLÅ
    //Antar att spelplan är 500x500
	/*
	@Test
	public void testIsCollisionWithEdgeBigX() {


		xCoordinate = 501;
		yCoordinate = 100;
		assertTrue(Spelplan.isCollisionWithEdge(xCoordinate,yCoordinate));
	}

	@Test
	public void testIsCollisionWithEdgeSmallX() {


		xCoordinate = -1;
		yCoordinate = 100;
		assertTrue(Spelplan.isCollisionWithEdge(xCoordinate,yCoordinate));
	}
	@Test
	public void testIsCollisionWithEdgeBigY() {
		xCoordinate = 100;
		yCoordinate = 501;
		assertTrue(Spelplan.isCollisionWithEdge(xCoordinate,yCoordinate));
	}

	@Test
	public void testIsCollisionWithEdgeSmallY() {
		xCoordinate = 100;
		yCoordinate = -1;
		assertTrue(Spelplan.isCollisionWithEdge(xCoordinate,yCoordinate));
	}

	@Test
	public void testNoCollision() {
		xCoordinate = 100;
		yCoordinate = 100;
		assertFalse(Spelplan.isCollisionWithEdge(xCoordinate,yCoordinate));
	}

	/*@Test
	public void testCollosionEdgeNull() {
		assert()
	}*/
}