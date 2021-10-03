package tictactoe;

import gameAnalyzer.StringAnalyzer;
import string.StringSetter;

import java.util.List;

public class Main {
    private static final StringSetter stringSetter = new StringSetter();
    private static final StringAnalyzer stringAnalyzer = new StringAnalyzer();

    public static void main(String[] args) {
        List<String> results = stringSetter.setStringList();

        System.out.println("---------");
        results.forEach(result -> System.out.println("| "+ result+ "|"));
        System.out.println("---------");

        System.out.println(stringAnalyzer.getGameState());
    }

}


