package tictactoe;

import display.MovementDisplay;
import display.StartStringDisplay;
import move.MovementGetter;
import stringAnalyzer.StringAnalyzer;
import string.StringScanner;

public class Main {
    // konstruktor dla new xxx
    private static final StringScanner stringScanner = new StringScanner();
    private static final StringAnalyzer stringAnalyzer = new StringAnalyzer();
    private static final StartStringDisplay startStringDisplay = new StartStringDisplay();
    private static final MovementGetter movementGetter = new MovementGetter();
    private static final MovementDisplay movementDisplay = new MovementDisplay();

    public static void main(String[] args) {
        String result = stringScanner.getString();
        String resultWithSpaces = result.replaceAll(".","$0 ");

        startStringDisplay.displayInitGrid(resultWithSpaces);
//        stringAnalyzer.getGameState(result);
        movementDisplay.displayMovement(movementGetter.getMove(result));
    }

}


