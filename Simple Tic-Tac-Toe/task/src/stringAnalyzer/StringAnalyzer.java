package stringAnalyzer;

public class StringAnalyzer {
    private final WinningState winningState = new WinningState();

    public String getGameState(String result) {
        String winStatement = winningState.sbWon(result);
        if (!winStatement.equals("")) {
            return winStatement.substring(0,6);
        } else if (result.indexOf('_') == -1) {
            return "Draw";
        } else {
            System.out.println("Game not finished");
            return "Game not finished";
        }
    }
}
