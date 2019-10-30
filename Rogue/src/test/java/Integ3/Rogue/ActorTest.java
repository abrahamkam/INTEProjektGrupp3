package Integ3.Rogue;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class ActorTest {

    //Cardinal direction tests

    @Test
    public void moveNorthTest() {
        Actor actor = Mockito.mock(Actor.class,
                Mockito.withSettings().useConstructor(30, 30, 10).defaultAnswer(Mockito.CALLS_REAL_METHODS));
        int oldx = actor.getX();
        int oldy = actor.getY();
        actor.move(0, 1);
        assertTrue((actor.getX() == oldx && actor.getY() == oldy + 1));
    }

    @Test
    public void moveSouthTest() {
        Actor actor = Mockito.mock(Actor.class,
                Mockito.withSettings().useConstructor(30, 30, 10).defaultAnswer(Mockito.CALLS_REAL_METHODS));
        int oldx = actor.getX();
        int oldy = actor.getY();
        actor.move(0, -1);
        assertTrue((actor.getX() == oldx && actor.getY() == oldy - 1));
    }

    @Test
    public void moveEastTest() {
        Actor actor = Mockito.mock(Actor.class,
                Mockito.withSettings().useConstructor(30, 30, 10).defaultAnswer(Mockito.CALLS_REAL_METHODS));
        int oldx = actor.getX();
        int oldy = actor.getY();
        actor.move(1, 0);
        assertTrue((actor.getX() == oldx + 1 && actor.getY() == oldy));
    }

    //Combo direction tests

    @Test
    public void moveWestTest() {
        Actor actor = Mockito.mock(Actor.class,
                Mockito.withSettings().useConstructor(30, 30, 10).defaultAnswer(Mockito.CALLS_REAL_METHODS));
        int oldx = actor.getX();
        int oldy = actor.getY();
        actor.move(-1, 0);
        assertTrue((actor.getX() == oldx - 1 && actor.getY() == oldy));
    }

    @Test
    public void moveNorthEastTest() {
        Actor actor = Mockito.mock(Actor.class,
                Mockito.withSettings().useConstructor(30, 30, 10).defaultAnswer(Mockito.CALLS_REAL_METHODS));
        int oldx = actor.getX();
        int oldy = actor.getY();
        actor.move(1, 1);
        assertTrue((actor.getX() == oldx +1 && actor.getY() == oldy+1));
    }
    @Test
    public void moveNorthWestTest() {
        Actor actor = Mockito.mock(Actor.class,
                Mockito.withSettings().useConstructor(30, 30, 10).defaultAnswer(Mockito.CALLS_REAL_METHODS));
        int oldx = actor.getX();
        int oldy = actor.getY();
        actor.move(-1, 1);
        assertTrue((actor.getX() == oldx - 1 && actor.getY() == oldy+1));
    }

    @Test
    public void moveSouthEastTest() {
        Actor actor = Mockito.mock(Actor.class,
                Mockito.withSettings().useConstructor(30, 30, 10).defaultAnswer(Mockito.CALLS_REAL_METHODS));
        int oldx = actor.getX();
        int oldy = actor.getY();
        actor.move(1, -1);
        assertTrue((actor.getX() == oldx +1 && actor.getY() == oldy -1));
    }
    @Test
    public void moveSouthWestTest() {
        Actor actor = Mockito.mock(Actor.class,
                Mockito.withSettings().useConstructor(30, 30, 10).defaultAnswer(Mockito.CALLS_REAL_METHODS));
        int oldx = actor.getX();
        int oldy = actor.getY();
        actor.move(-1, -1);
        assertTrue((actor.getX() == oldx -1 && actor.getY() == oldy -1));
    }
}