package gameAnalyzer;

import java.util.ArrayList;
import java.util.List;

public class WinningState {
    String winStatement="";

    public String sbWon(String result) {
        List<String> results = new ArrayList<>();

        results.add(result.substring(0,3));
        results.add(result.substring(3,6));
        results.add(result.substring(6,9));
        results.add(result.charAt(0) + result.substring(3, 4) + result.charAt(6));
        results.add(result.charAt(1) + result.substring(4, 5) + result.charAt(7));
        results.add(result.charAt(2) + result.substring(5, 6) + result.charAt(8));
        results.add(result.charAt(0) + result.substring(4, 5) + result.charAt(8));
        results.add(result.charAt(2) + result.substring(4, 5) + result.charAt(6));

        results.forEach(r -> {
            if (r.equals("XXX") || r.equals("OOO")) {
                winStatement += r.charAt(0) + " wins";
            }
        });
        return winStatement;
    }
}
