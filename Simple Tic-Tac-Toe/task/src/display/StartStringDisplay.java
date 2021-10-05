package display;

public class StartStringDisplay {

    public void displayInitGrid(String resultWithSpaces){
        System.out.println("---------");
        System.out.println("| " + resultWithSpaces.substring(0,6) +"|");
        System.out.println("| " + resultWithSpaces.substring(6,12) +"|");
        System.out.println("| " + resultWithSpaces.substring(12,18) +"|");
        System.out.println("---------");
    }
}
