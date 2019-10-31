package Integ3.Rogue;

import java.util.ArrayList;
import java.util.List;

public class GameTile {

	private ArrayList<Actor> gameActors = new ArrayList<>();

    public void addActor(Actor o) {
    	gameActors.add(o);
    }

    public ArrayList<Actor> getGameActors() {

        return gameActors;
    }
}

