package tictactoe;

import string.StringSetter;

import java.util.List;

public class Main {
    private static final StringSetter stringSetter = new StringSetter();

    public static void main(String[] args) {
        List<String> results = stringSetter.setString();

        System.out.println("---------");
        results.forEach(result -> System.out.println("| "+ result+ "|"));
        System.out.println("---------");
    }

}


