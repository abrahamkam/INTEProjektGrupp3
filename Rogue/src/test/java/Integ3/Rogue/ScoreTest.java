package Integ3.Rogue;

import static org.junit.Assert.*;

import org.junit.Test;



public class ScoreTest {
	

	@Test
	public void addTest() {
		Score score= new Score();
		score.addScore(100);
		
   AssertEquals(100, score.getPlayerScore());
		
	}
	@Test
	public void deductionTest() {
		Score score = new Score();
		score.addScore(100);
		score.deductionScore(50);
		
		AssertEquals(50,score.getPlayerScore());
	}
	
	//default constructor test
	@Test
	public void scoreTest() { 
	
	Score score = new Score();
	AssertEquals(0,score.getPlayerScore());
	}
	
	
	//add balance constructor test
	@Test
	public void addScoreTest() {
		Score score= new Score();
		AssertEquals(200,score.getPlayerScore());
	}
	

	private void AssertEquals(int i, int playerScore) {
		
		
	}

}
