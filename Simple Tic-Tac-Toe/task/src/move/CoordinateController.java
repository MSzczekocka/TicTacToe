package move;

public class CoordinateController {

    public String withoutSpaces(String moveCoor) {
        return moveCoor.replace(" ", "");
    }

    public int getCoor1(String moveCoor) {
        return Character.getNumericValue(moveCoor.charAt(0));
    }

    public int getCoor2(String moveCoor) {
        return Character.getNumericValue(withoutSpaces(moveCoor).charAt(1));
    }

    public int gridPosition(int coor1, int coor2) {
        return (coor1 - 1) * 3 + coor2 - 1;
    }
}
