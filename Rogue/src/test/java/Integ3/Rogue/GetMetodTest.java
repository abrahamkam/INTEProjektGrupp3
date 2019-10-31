package Integ3.Rogue;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import Integ3.Rogue.Player.direction;


public class GetMetodTest {
	
	int playerx =5,playery=7,enemyx=6,enemyy=8;
	GameScreen gameScreen = new GameScreen(playerx,playery,enemyx,enemyy);	
	Score score= new Score(100);
	Actor actor = new Actor(10,20,60);
	
	
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
		assertEquals(60,length);
	}
	
	
	@Test
	public void getGameWidthTest() {
	    int width =gameScreen.getGameWidth();
	    assertEquals(200,width);
	  	
	}
	@Test
	public void getGameHeightTest() {
	    int width =gameScreen.getGameHeight();
	    assertEquals(300,width);
	  	
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
		int s = score.getPlayerScore();
		assertEquals(100,s);
	}


	
		
		
	}



	

