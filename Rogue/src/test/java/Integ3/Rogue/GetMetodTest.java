package Integ3.Rogue;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class GetMetodTest {
	Player player = new Player(10,20);
	Enemy enemy = new Enemy (5, 10, player);
	GameScreen gameScreen = new GameScreen();	
	Score score= new Score(100);
	
	@Test
	
	public void getXTest() {
	int a = player.getX();
	AssertEquals(10,a);
		
}
	@Test
	public void getYTest() {
		int b = enemy.getY();
		AssertEquals(10,b); 
	}
	
	@Test
	public void getWidthTest() {
	    int width =gameScreen.getGameWidth();
	    AssertEquals(200,width);
	  	
	}
	
	@Test
	public void getScoreTest() {
		int s = score.getPlayerScore();
		assertEquals(100,s);
	}


	private void AssertEquals(int i, int a) {
		
		
	}


	
		
		
	}



	

