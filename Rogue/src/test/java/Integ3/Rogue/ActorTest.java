package Integ3.Rogue;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

public class ActorTest {

    @Test
    public void moveNorthTest(){
        Actor actor = Mockito.mock(Actor.class,
                Mockito.withSettings().useConstructor(30,30,10).defaultAnswer(Mockito.CALLS_REAL_METHODS));
        int oldx = actor.getX();
        int oldy = actor.getY();
        actor.move(0,1);
        assertTrue((actor.getX() == oldx+1 && actor.getY() == oldy+1));
    }
}