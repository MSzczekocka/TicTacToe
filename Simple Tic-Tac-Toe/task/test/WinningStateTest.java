import org.junit.Assert;
import org.junit.Test;
import stringAnalyzer.StringAnalyzer;

public class WinningStateTest {

    @Test
    public void sbWon_XWon_Horizontal_Test(){
        // given
        String gameplayString = "XXXO____O)";
        StringAnalyzer stringAnalyzer = new StringAnalyzer();

        // when
        String result = stringAnalyzer.getGameState(gameplayString);

        //then
        Assert.assertEquals("X wins",result);
    }

    @Test
    public void sbWon_OWonTest_Diagonal_Test(){
        // given
        String gameplayString = "OXXXO___O)";
        StringAnalyzer stringAnalyzer = new StringAnalyzer();

        // when
        String result = stringAnalyzer.getGameState(gameplayString);

        //then
        Assert.assertEquals("O wins",result);
    }

    @Test
    public void sbWon_Vertical_Test(){
        // given
        String gameplayString = "OXXOXXO__)";
        StringAnalyzer stringAnalyzer = new StringAnalyzer();

        // when
        String result = stringAnalyzer.getGameState(gameplayString);

        //then
        Assert.assertEquals("O wins",result);
    }
}
