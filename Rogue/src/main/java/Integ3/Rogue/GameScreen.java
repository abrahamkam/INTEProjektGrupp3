package Integ3.Rogue;

public class GameScreen {

	private static int gameWidth = 500;
	private static int gameHeight = 500;
	
	public static boolean isCollisionWithEdge(int xCoordinate, int yCoordinate) {
		boolean isCollision = false;
		
		if(xCoordinate >= gameWidth || xCoordinate <= 0)
			isCollision = true;
		
		if(yCoordinate >= gameHeight || yCoordinate <= 0)
			isCollision = true;
		
		
		return isCollision;
	}
	
	public static boolean isCollisionWithEnemy(int playerXCoordinate, int playerYCoordinate, int enemyXCoordinate, int enemyYCoordinate) {
		boolean isCollision = false;
		
		//Hårdkodad tills vidare (avstånd mellan mitten koordinat och varje kant för spelare
		int playerLength = 50;
		
		if((enemyXCoordinate > (playerXCoordinate - playerLength)) && (enemyXCoordinate < (playerXCoordinate + playerLength)))
			if((enemyYCoordinate > (playerYCoordinate - playerLength)) && (enemyYCoordinate < (playerYCoordinate + playerLength)))
				isCollision = true;
		
				return isCollision;
	}

	public int getGameWidth(){
		return gameWidth;
	}

	public int getGameHeight(){
		return gameHeight;
	}

}
