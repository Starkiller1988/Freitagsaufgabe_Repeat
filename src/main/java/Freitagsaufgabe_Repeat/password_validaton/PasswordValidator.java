package Freitagsaufgabe_Repeat.password_validaton;

/*
* ToDos
*
* - Mindestlänge muss erreicht sein (8)
* - Zahlen müssen enthalten sein
* - Groß /- Kleinschreibung muss enthalten sein
* - Möglichkeit mehrerer Passwörter zu validieren
*
*
 */


public class PasswordValidator {

    public static String validatePassword(String passwordToCheck) {
        if (passwordToCheck.length() < 8) {
            return "PASSWORD HAS LESS THAN 8 SYMBOLS!";
        } else if (hasNumbersInPassword(passwordToCheck)) {
            return "PASSWORD SHOULD HAVE NUMBERS!";
        } else if (hasUppercaseInPassword(passwordToCheck)) {
            return "PASSWORD SHOULD HAVE AT LEAST ONE UPPERCASE CHARACTER!";
        } else if (hasLowercaseInPassword(passwordToCheck)) {
            return "PASSWORD SHOULD HAVE AT LEAST ONE LOWERCASE CHARACTER!";
        } else{
            return "PASSWORD IS OK!";
        }

    }

    private static boolean hasNumbersInPassword(String passwordToCheck) {
        for (int i = 0; i < passwordToCheck.length(); i++) {
            if (Character.isDigit(passwordToCheck.charAt(i))) {
                return true;
                }
            }
        return false;
        }

    private static boolean hasUppercaseInPassword(String passwordToCheck) {
        for (int i = 0; i < passwordToCheck.length(); i++) {
            if (Character.isUpperCase(passwordToCheck.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasLowercaseInPassword(String passwordToCheck) {
        for (int i = 0; i < passwordToCheck.length(); i++) {
            if (Character.isLowerCase(passwordToCheck.charAt(i))) {
                return true;
            }
        }
        return false;
    }


}

