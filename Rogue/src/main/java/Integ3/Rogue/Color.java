package Integ3.Rogue;

public class Color extends Actor{
	
      private String color;

	
	private final String g ="GREEN";
	
	private final String r = "RED";
	
	
	public Color(int x, int y) {
		super(x,y);
		
	}
	
	
	public Color() {
		
	}


	//public boolean getColor() {
		
	//	return true;
	//}

	public void setPlayerColor(String GREEN) {
		this.color = GREEN;
	}

	public void setEnemtColor(String RED) {
		this.color = RED;
	}


	public void getPlayerColor(String g) {
		this.color = g;
			
	}
	
	public void getEnemyColor(String r) {
		this.color = r;
	}
	
			}
	
	


