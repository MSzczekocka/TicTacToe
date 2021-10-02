package tictactoe;

import string.StringController;
import string.StringScanner;

import java.util.Scanner;

public class Main {
    private static final StringScanner stringScanner = new StringScanner();
    public static void main(String[] args) {
        String result = stringScanner.getString();

        System.out.println("---------");
        System.out.println("| "+ result.charAt(0)+ " "+ result.charAt(1)+ " "+ result.charAt(2)+ " |");
        System.out.println("| "+ result.charAt(3)+ " "+ result.charAt(4)+ " "+ result.charAt(5)+ " |");
        System.out.println("| "+ result.charAt(6)+ " "+ result.charAt(7)+ " "+ result.charAt(8)+ " |");
        System.out.println("---------");
    }

}


