package Integ3.Rogue;




import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class colorTest {

	Color color = new Color();

	@Test
	public void test1() {
		Color color = new Color();
	//Player player = new Player(GREEN);
	//Enemy enemy = new Enemy(RED);
		
		color.playerColor(g);
		//color.paintColor(player, enemy)
		assertEquals(g,color.getColor());
		
	}

}
