package Integ3.Rogue;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class GetMetodTest {
	
	int playerx =5,playery=7,enemyx=6,enemyy=8;
	GameScreen gameScreen = new GameScreen(playerx,playery,enemyx,enemyy);	
	Score score= new Score();
	Player actor = new Player(10,20);
	
	
	@Test
	
	public void getXTest() {
	int a = actor.getX();
	assertEquals(10,a);
		
}
	
	@Test
	public void getYTest() {
		int b = actor.getY();
		assertEquals(20,b); 
	}
	
	@Test 
	public void getLengthTest() {
		int length = actor.getLength();
		assertEquals(50,length);
	}
	
	
	@Test
	public void getGameWidthTest() {
	    int width =gameScreen.getGameWidth();
	    assertEquals(500,width);
	  	
	}
	@Test
	public void getGameHeightTest() {
	    int width =gameScreen.getGameHeight();
	    assertEquals(500,width);
	  	
	}
	
	@Test
	public void getPlayer() {
		int x = gameScreen.getPlayer().getX();
		int y = gameScreen.getPlayer().getY();
		assertEquals(playerx,x);
		assertEquals(playery,y);
	}

		
	@Test
	public void getEnemy() {
		int x = gameScreen.getEnemy().getX();
		int y = gameScreen.getEnemy().getY();
		assertEquals(enemyx,x);
		assertEquals(enemyy,y);
	}
	@Test
	public void getScoreTest() {
		score.changeScore(100);
		int s = score.getPlayerScore();
		assertEquals(100,s);
	}


	
		
		
	}



	

