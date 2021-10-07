package display;

public class MovementDisplay {
    public void displayMovement(String moveString){
        String moveWithSpaces = moveString.replaceAll(".","$0 ");

        System.out.println("---------");
        System.out.println("| " + moveWithSpaces.substring(0,6) +"|");
        System.out.println("| " + moveWithSpaces.substring(6,12) +"|");
        System.out.println("| " + moveWithSpaces.substring(12,18) +"|");
        System.out.println("---------");
    }
}
