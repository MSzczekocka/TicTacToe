package string;

import java.util.ArrayList;
import java.util.List;

public class StringSetter {
    private static final StringScanner stringScanner = new StringScanner();

    public List<String> setString() {
        List<String> results = new ArrayList<>();
        String result = stringScanner.getString();

        results.add(result.substring(0, 3).replaceAll(".", "$0 "));
        results.add(result.substring(3, 6).replaceAll(".", "$0 "));
        results.add(result.substring(6, 9).replaceAll(".", "$0 "));
        return results;
    }
}
