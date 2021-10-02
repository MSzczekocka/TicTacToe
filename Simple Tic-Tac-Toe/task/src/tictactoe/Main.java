package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put string");
        String result = scanner.nextLine();

        if (result.length()!=9){
            System.out.println("String do not have 9 chars. Put new");
            result = scanner.nextLine();
        }

        if (!checkString(result)){
            System.out.println("Not valid String. Put new.");
            result = scanner.nextLine();
        }

        System.out.println("---------");
        System.out.println("| "+ result.charAt(0)+ " "+ result.charAt(1)+ " "+ result.charAt(2)+ " |");
        System.out.println("                                                                                                      | "+ result.charAt(3)+ " "+ result.charAt(4)+ " "+ result.charAt(5)+ " |");
        System.out.println("| "+ result.charAt(6)+ " "+ result.charAt(7)+ " "+ result.charAt(8)+ " |");
        System.out.println("---------");
    }

    public static boolean checkString(String result){
        for(int i=0; i<result.length();i++){
            if (result.charAt(i)!='O'&&result.charAt(i)!='X'&&result.charAt(i)!='_'){
                return false;
            }
        }
        return true;
    }
}


