package string;

import java.util.ArrayList;
import java.util.List;

public class StringSetter {
    private static final StringScanner stringScanner = new StringScanner();
    private static final StringSetter stringSetter = new StringSetter();
    String result;

    public String getResult() {
        return result;
    }

    public List<String> getResults() {
        return results;
    }

    List<String> results;
    public String setSting(){
        result = stringScanner.getString();
        return result;
    }

    public List<String> setStringList() {
        List<String> results = new ArrayList<>();
        String result = StringSetter.stringSetter.setSting();

        results.add(result.substring(0, 3).replaceAll(".", "$0 "));
        results.add(result.substring(3, 6).replaceAll(".", "$0 "));
        results.add(result.substring(6, 9).replaceAll(".", "$0 "));
        return results;
    }
}

