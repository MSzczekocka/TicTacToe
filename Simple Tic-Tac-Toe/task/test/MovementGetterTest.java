import move.MovementGetter;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class MovementGetterTest {

    @Test
    public void getMove_startString_coordinatesOk_Test(){
        // given
        String startString = "_________";
        String moveCoor = "2 1";
        MovementGetter movementGetter = new MovementGetter();

        // when
        InputStream in = new ByteArrayInputStream(moveCoor.getBytes());
        System.setIn(in);
        String result = movementGetter.getMove(startString);

        // then
        Assert.assertEquals("___X_____",result);
    }

    @Test
    public void getMove_gameplayString_coordinatesOk_Test(){
        // given
        String startString = "X________";
        String moveCoor = "2 1";
        MovementGetter movementGetter = new MovementGetter();

        // when
        InputStream in = new ByteArrayInputStream(moveCoor.getBytes());
        System.setIn(in);
        String result = movementGetter.getMove(startString);

        // then
        Assert.assertEquals("X__O_____",result);
    }

}
