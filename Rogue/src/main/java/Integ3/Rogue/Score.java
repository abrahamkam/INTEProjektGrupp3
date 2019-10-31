package Integ3.Rogue;

public class Score {

    private int playerScore = 0;


    public int getPlayerScore() {
        return playerScore;
    }

    public void changeScore(int score) {
        playerScore += score;
    }
}