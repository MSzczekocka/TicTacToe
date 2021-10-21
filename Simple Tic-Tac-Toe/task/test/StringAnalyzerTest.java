import org.junit.Assert;
import org.junit.Test;
import stringAnalyzer.StringAnalyzer;

public class StringAnalyzerTest {
    @Test
    public void getGameState_startStringTest(){
        // given
        String startString = "_________";
        StringAnalyzer stringAnalyzer = new StringAnalyzer();

        // when
        String result = stringAnalyzer.getGameState(startString);

        //then
        Assert.assertEquals("Game not finished",result);
    }

    @Test
    public void getGameState_OWinTest(){
        // given
        String startString = "OOOXX_XX_";
        StringAnalyzer stringAnalyzer = new StringAnalyzer();

        // when
        String result = stringAnalyzer.getGameState(startString);

        //then
        Assert.assertEquals("O wins",result);
    }

    @Test
    public void getGameState_XWinTest(){
        // given
        String startString = "XXXO_O___";
        StringAnalyzer stringAnalyzer = new StringAnalyzer();

        // when
        String result = stringAnalyzer.getGameState(startString);

        //then
        Assert.assertEquals("X wins",result);
    }

    @Test
    public void getGameState_DrawTest(){
        // given
        String startString = "XOXOOXXXO)";
        StringAnalyzer stringAnalyzer = new StringAnalyzer();

        // when
        String result = stringAnalyzer.getGameState(startString);

        //then
        Assert.assertEquals("Draw",result);
    }

    @Test
    public void getGameState_GameNotFinishedTest(){
        // given
        String startString = "X__O_____)";
        StringAnalyzer stringAnalyzer = new StringAnalyzer();

        // when
        String result = stringAnalyzer.getGameState(startString);

        //then
        Assert.assertEquals("Game not finished",result);
    }
}
