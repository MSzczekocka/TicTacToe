package stringAnalyzer;

public class ImpossibleState {
    int X, O = 0;

    public boolean isPossible(String result, String winStatement) {
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == 'X') {
                X++;
            } else if (result.charAt(i) == 'O') {
                O++;
            }
        }
        if (!winStatement.equals("") && !winStatement.equals("X wins") && !winStatement.equals("O wins")) {
            return false;
        }
        return X - O <= 1 && X - O >= -1;
    }
}
