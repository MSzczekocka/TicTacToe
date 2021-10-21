import move.OpponentAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class OpponentAnalyzerTest {

    @Test
    public void pickOpponent_startTest(){
        // given
        String startString = "_________";
        OpponentAnalyzer opponentAnalyzer = new OpponentAnalyzer();

        // when
        String result = opponentAnalyzer.pickOpponent(startString);

        //then
        Assert.assertEquals("X",result);
    }

    @Test
    public void pickOpponent_OPlayerTest(){
        // given
        String startString = "_X_______";
        OpponentAnalyzer opponentAnalyzer = new OpponentAnalyzer();

        // when
        String result = opponentAnalyzer.pickOpponent(startString);

        //then
        Assert.assertEquals("O",result);
    }

    @Test
    public void pickOpponent_XPlayerTest(){
        // given
        String startString = "_X___O___";
        OpponentAnalyzer opponentAnalyzer = new OpponentAnalyzer();

        // when
        String result = opponentAnalyzer.pickOpponent(startString);

        //then
        Assert.assertEquals("X",result);
    }

}
