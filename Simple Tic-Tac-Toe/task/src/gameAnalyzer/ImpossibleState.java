package gameAnalyzer;

import string.StringSetter;

import java.util.List;

public class ImpossibleState {
    StringSetter stringSetter = new StringSetter();
    WinningState winningState = new WinningState();
    int X, O = 0;

    public boolean isPossible() {
        List<String> results = stringSetter.getResults();
        results.forEach(result -> {
            for (int i = 0; i < 6; i++) {
                if (result.charAt(i) == 'X') {
                    X++;
                } else if (result.charAt(i) == 'O') {
                    O++;
                }
            }
        });

        String win = winningState.sbWon();
        if (!win.equals("") && !win.equals("X wins") && !win.equals("O wins")) {
            return false;
        }
        return X - O <= 1 && X - O >= -1;
    }
}
