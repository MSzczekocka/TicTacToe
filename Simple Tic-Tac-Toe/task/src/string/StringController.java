package string;

public class StringController {

    public boolean checkString(String result) {
        if (result.length() != 9) {
            System.out.println("String do not have 9 chars. Put new");
            return false;
        }
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) != 'O' && result.charAt(i) != 'X' && result.charAt(i) != '_') {
                System.out.println("String not correct. Put new");
                return false;
            }
        }
        return true;
    }
}
