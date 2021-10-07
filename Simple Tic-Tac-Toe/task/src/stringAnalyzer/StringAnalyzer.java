package stringAnalyzer;

public class StringAnalyzer {
    private final WinningState winningState = new WinningState();

    public String getGameState(String result) {
        String winStatement = winningState.sbWon(result);
//        if (!impossibleState.isPossible(result, winStatement)){
//            System.out.println("Impossible");
        if (!winStatement.equals("")) {
            System.out.println(winStatement);
            return winStatement;
        } else if (result.indexOf('_') == -1) {
            System.out.println("Draw");
            return "Draw";
        } else {
            System.out.println("Game not finished");
            return "Game not finished";
        }
    }
}
