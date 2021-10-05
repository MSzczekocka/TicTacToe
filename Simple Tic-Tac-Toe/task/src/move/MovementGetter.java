package move;

import java.util.Scanner;

public class MovementGetter {
    /* get string result
    prompt
    scan string
    MoveAnalyzer
    if all ok -> MovementDisplay
     */
    public String getMove(String result){
        System.out.println("Make a move");
        Scanner scanner = new Scanner(System.in);
        String moveCoor = scanner.nextLine();
        String analysisResult = MoveAnalyzer.analyzeMove(moveCoor, result);
        while (analysisResult.length()>9){
            System.out.println(analysisResult);
            System.out.println("Put new string");
            moveCoor = scanner.nextLine();
        };
        return moveCoor;
    }


}
