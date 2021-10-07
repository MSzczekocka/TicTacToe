package tictactoe;

import display.MovementDisplay;
import move.MovementGetter;
import stringAnalyzer.StringAnalyzer;

public class Main {
    // konstruktor dla new xxx
    // bez spacji też działą
    //pojedyncza liczba wywala
    private static final StringAnalyzer stringAnalyzer = new StringAnalyzer();
    private static final MovementGetter movementGetter = new MovementGetter();
    private static final MovementDisplay movementDisplay = new MovementDisplay();

    public static void main(String[] args) {
        String result = "_________";
        movementDisplay.displayMovement(result);
//        stringAnalyzer.getGameState(result);
        String moveResult = movementGetter.getMove(result);
        do {
            movementDisplay.displayMovement(moveResult);
            moveResult = movementGetter.getMove(moveResult);
        } while (stringAnalyzer.getGameState(moveResult).equals("Game not finished"));

        movementDisplay.displayMovement(moveResult);
        System.out.println(stringAnalyzer.getGameState(moveResult));
    }

}


