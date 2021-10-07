package move;

import java.util.Scanner;

public class MovementGetter {
    public String getMove(String result){
        System.out.println("Enter the coordinates");
        Scanner scanner = new Scanner(System.in);
        String moveCoor = scanner.nextLine();
        String analysisResult = MoveAnalyzer.analyzeMove(moveCoor, result);
        while (analysisResult.length()>9){
            System.out.println(analysisResult);
            System.out.println("Enter the coordinates");
            moveCoor = scanner.nextLine();
            analysisResult = MoveAnalyzer.analyzeMove(moveCoor, result);
        };
        return analysisResult;
    }
}
