package gameAnalyzer;

import string.StringScanner;
import string.StringSetter;

import java.util.ArrayList;
import java.util.List;

public class WinningState {
    StringSetter stringSetter = new StringSetter();
    String winStatement, temp = "";

    public String sbWon() {
        List<String> results = new ArrayList<>();
        String resultString = stringSetter.getResult();

        results.add(resultString.charAt(0) + resultString.substring(1, 2) + resultString.charAt(2));
        results.add(resultString.charAt(3) + resultString.substring(4, 5) + resultString.charAt(5));
        results.add(resultString.charAt(6) + resultString.substring(7, 8) + resultString.charAt(8));
        results.add(resultString.charAt(0) + resultString.substring(3, 4) + resultString.charAt(6));
        results.add(resultString.charAt(1) + resultString.substring(4, 5) + resultString.charAt(7));
        results.add(resultString.charAt(2) + resultString.substring(5, 6) + resultString.charAt(8));
        results.add(resultString.charAt(0) + resultString.substring(4, 5) + resultString.charAt(8));
        results.add(resultString.charAt(2) + resultString.substring(4, 5) + resultString.charAt(6));

        results.forEach(result -> {
            if (result.equals("XXX") || result.equals("OOO")) {
                winStatement += result.charAt(0) + " wins";
            }
        });
        return winStatement;
    }
}
