import move.MoveAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoveAnalyzerTest {

    @Test
    public void analyzeMove_coordinatesTooShort() {
        //given
        String startString = "__X______";
        String moveCoor = "1";
        MoveAnalyzer moveAnalyzer = new MoveAnalyzer();

        //when
        String result = moveAnalyzer.analyzeMove(moveCoor, startString);

        //then
        Assert.assertEquals("Too short answer. Put new coordinates!", result);
    }

    @Test
    public void analyzeMove_coordinatesNotANumber(){
        //given
        String startString = "________X";
        String moveCoor = "xyz";
        MoveAnalyzer moveAnalyzer = new MoveAnalyzer();

        //when
        String result = moveAnalyzer.analyzeMove(moveCoor, startString);

        //then
        Assert.assertEquals("You should enter numbers!", result);
    }

    @Test
    public void analyzeMove_coordinate1TooBig(){
        //given
        String startString = "________X";
        String moveCoor = "4 3";
        MoveAnalyzer moveAnalyzer = new MoveAnalyzer();

        //when
        String result = moveAnalyzer.analyzeMove(moveCoor, startString);

        //then
        Assert.assertEquals("Coordinates should be from 1 to 3!", result);
    }

    @Test
    public void analyzeMove_coordinate2TooBig(){
        //given
        String startString = "________X";
        String moveCoor = "1 9";
        MoveAnalyzer moveAnalyzer = new MoveAnalyzer();

        //when
        String result = moveAnalyzer.analyzeMove(moveCoor, startString);

        //then
        Assert.assertEquals("Coordinates should be from 1 to 3!", result);
    }

    @Test
    public void analyzeMove_occupiedCellPicked(){
        //given
        String startString = "XO______X";
        String moveCoor = "1 1";
        MoveAnalyzer moveAnalyzer = new MoveAnalyzer();

        //when
        String result = moveAnalyzer.analyzeMove(moveCoor, startString);

        //then
        Assert.assertEquals("This cell is occupied! Choose another one!", result);
    }

    @Test
    public void analyzeMove_resultOk(){
        //given
        String startString = "XO______X";
        String moveCoor = "1 3";
        MoveAnalyzer moveAnalyzer = new MoveAnalyzer();

        //when
        String result = moveAnalyzer.analyzeMove(moveCoor, startString);

        //then
        Assert.assertEquals("XOO_____X", result);
    }
}
