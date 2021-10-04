package gameAnalyzer;

import string.StringSetter;

public class StringAnalyzer {
    private final ImpossibleState impossibleState = new ImpossibleState();
    private  final StringSetter stringSetter = new StringSetter();
    private final WinningState winningState = new WinningState();

    public void getGameState(){
        if (!impossibleState.isPossible()){
            System.out.println("Impossible");
        }else if (!winningState.sbWon().equals("")){
            System.out.println(winningState.sbWon());
        }else if (stringSetter.getResult().indexOf('_')==-1){
            System.out.println("Draw");
        } else {
            System.out.println("Game not finished");
        }
    }
}
