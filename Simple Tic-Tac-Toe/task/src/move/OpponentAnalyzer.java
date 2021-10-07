package move;

public class OpponentAnalyzer {

    public String pickOpponent(String result) {
        int x = 0, o = 0;
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == 'X') x++;
            if (result.charAt(i) == 'O') o++;
        }

        if (x == o && x == 0) {
            return "X";
        } else if (x > o) {
            return "O";
        } else {
            return "X";
        }
    }
}
