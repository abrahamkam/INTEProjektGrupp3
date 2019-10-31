package Integ3.Rogue;

public class Score {

	private int playerScore;
	
	public Score() {
		this.playerScore=0;
	}	
	
	public Score(int playerScore) {
		addScore(playerScore);
	}
	
	public int getPlayerScore() {
		return playerScore;
	}
	
	public void addScore(int score) {
		if(playerScore<0) {
			return;
		}else {
			playerScore += score;
		}
	}
		
	public void deductionScore(int deductionPoints){
		if(playerScore>0 && playerScore>deductionPoints) {
			playerScore -= deductionPoints;
			}else {
				playerScore=0;
			}
			}			
	}
			
		
		
	

