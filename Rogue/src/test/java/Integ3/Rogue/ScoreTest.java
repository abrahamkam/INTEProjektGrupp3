package Integ3.Rogue;

import static org.junit.Assert.*;

import org.junit.Test;



public class ScoreTest {
	

	@Test
	public void addTest() {
		Score score= new Score();
		score.changeScore(100);
		
   		assertEquals(100, score.getPlayerScore());
		
	}
	@Test
	public void deductionTest() {
		Score score = new Score();
		score.changeScore(100);
		score.changeScore(-50);
		
		assertEquals(50,score.getPlayerScore());
	}
	
	//default constructor test
	@Test
	public void scoreTest() { 
	
	Score score = new Score();
	assertEquals(0,score.getPlayerScore());
	}


}
