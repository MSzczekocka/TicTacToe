package tictactoe;

import gameAnalyzer.StringAnalyzer;
import string.StringScanner;

import java.util.List;

public class Main {
    private static final StringScanner stringScanner = new StringScanner();
    private static final StringAnalyzer stringAnalyzer = new StringAnalyzer();

    public static void main(String[] args) {
        String result = stringScanner.getString();
        String resultWithSpaces = result.replaceAll(".","$0 ");

        System.out.println("---------");
        System.out.println("| " + resultWithSpaces.substring(0,6) +"|");
        System.out.println("| " + resultWithSpaces.substring(6,12) +"|");
        System.out.println("| " + resultWithSpaces.substring(12,18) +"|");
        System.out.println("---------");

        stringAnalyzer.getGameState(result);
    }

}


