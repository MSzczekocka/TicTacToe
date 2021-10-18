package move;

public class MoveAnalyzer {
    CoordinateController controller = new CoordinateController();

    public static String analyzeMove(String moveCoor, String result) {
        OpponentAnalyzer opponentAnalyzer = new OpponentAnalyzer();
        CoordinateController controller = new CoordinateController();
        String moveWoSpaces = controller.withoutSpaces(moveCoor);

        if (moveCoor.length()<3) return "Too short answer. Put new coordinates!";

        try {
            Double.parseDouble(moveWoSpaces);
        } catch (NumberFormatException e) {
            return "You should enter numbers!";
        }

        int coor1 = controller.getCoor1(moveCoor);
        int coor2 = controller.getCoor2(moveCoor);
        if (coor1 > 3 || coor1 < 0) return "Coordinates should be from 1 to 3!";
        if (coor2 > 3 || coor2 < 0) return "Coordinates should be from 1 to 3!";

        int positionInGrid = controller.gridPosition(coor1, coor2);
        if (result.charAt(positionInGrid) != '_') return "This cell is occupied! Choose another one!";

        return result.substring(0, positionInGrid) + opponentAnalyzer.pickOpponent(result) + result.substring(positionInGrid + 1);
    }
}

