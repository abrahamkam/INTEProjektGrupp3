package Integ3.Rogue;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import Integ3.Rogue.Player.direction;


public class GetMetodTest {
	Player player = new Player(10,20);
	Enemy enemy = new Enemy (5, 10, player);
	GameScreen gameScreen = new GameScreen();	
	Score score= new Score(100);
	Actor actor = new Actor(5,5, 60);
	Player plr = new Player(10,5);
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
	
	@Test
	public void getHeightTest() {
	    int width =gameScreen.getGameHeight();
	    AssertEquals(300,width);
	  	
	}
	@Test 
	public void getLengthTest() {
		int length = actor.getLength();
		AssertEquals(60,length);
	}
	
	@Test
	public void getScreen() {
		int height = gameScreen.getGameHeight();
		AssertEquals(400,height);
		
	}

	private void AssertEquals(int i, int a) {
		
		
	}


	
		
		
	}



	

