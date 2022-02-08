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
        } else {
            return "PASSWORD IS OK!";
        }

    }

}
