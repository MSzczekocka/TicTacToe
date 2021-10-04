package string;

import gameAnalyzer.StringController;

import java.util.Scanner;

public class StringScanner {
    private final StringController stringController = new StringController();

    public String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put string");
        String result = scanner.nextLine();
        while (!stringController.checkString(result)) {
            result = scanner.nextLine();
        }
        return result;
    }
}

