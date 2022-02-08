package Freitagsaufgabe_Repeat.password_validaton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 * ToDos: TEST
 *
 * - Mindestlänge muss erreicht sein (8)
 * - Zahlen müssen enthalten sein
 * - Groß /- Kleinschreibung muss enthalten sein
 * - Möglichkeit mehrerer Passwörter zu validieren
 *
 *
 */


class PasswordValidatorTest {

    @Test
    void shouldHaveAMinLengthOfEightSymbols(){
        //given (gegeben)
        String testPassword = "justic3m4n";

        //when (Wenn....)
        String actual = PasswordValidator.validatePassword(testPassword);

        //then (Dann....!)
        assertEquals("PASSWORD IS OK!", actual);
    }

    @Test
    void shouldBeAtLessThanEightSymbols(){
        //given (gegeben)
        String testPassword = "justic3";

        //when (Wenn....)
        String actual = PasswordValidator.validatePassword(testPassword);

        //then (Dann....!)
        assertEquals("PASSWORD HAS LESS THAN 8 SYMBOLS!", actual);
    }
}