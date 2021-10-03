package gameAnalyzer;

import string.StringSetter;

public class StringAnalyzer {
    private final ImpossibleState impossibleState = new ImpossibleState();
    private  final StringSetter stringSetter = new StringSetter();
    private final WinningState winningState = new WinningState();

    public String getGameState(){
        if (!impossibleState.isPossible()){
            return "Impossible";
        }else if (!winningState.sbWon().equals("")){
            return winningState.sbWon();
        }else if (stringSetter.getResult().indexOf('_')==-1){
            return "Draw";
        } else {
            return "Game not finished";
        }
    }
}
