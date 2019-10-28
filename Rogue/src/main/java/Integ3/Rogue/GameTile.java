package Integ3.Rogue;

public class GameTile {
	
	private Actor[] gameActor = new Actor[2];
	
public Actor[]getGameActors() {
	Actor[] ac= new Actor[gameActor.length];
	for(int i = 0; i<ac.length; i++){ 
		ac[i] =gameActor[i];
	}
	return ac;
	}

public void addActor(Actor...o) {
	for(int i = 0; i<o.length; i++) {
		if(o[i] instanceof Player) {
			gameActor[0]=o[i];
		}
				}
	
}
}

