package stringAnalyzer;

public class StringAnalyzer {
    private final ImpossibleState impossibleState = new ImpossibleState();
    private final WinningState winningState = new WinningState();

    public void getGameState( String result){
        String winStatement = winningState.sbWon(result);
        if (!impossibleState.isPossible(result, winStatement)){
            System.out.println("Impossible");
        }else if (!winStatement.equals("")){
            System.out.println(winStatement);
        }else if (result.indexOf('_')==-1){
            System.out.println("Draw");
        }else{
            System.out.println("Game not finished");
        }
    }
}
