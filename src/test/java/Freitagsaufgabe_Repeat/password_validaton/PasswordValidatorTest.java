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
        String testPassword = "Justic3m4n";

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

    @Test
    void shouldHaveNumbersInPassword(){
        //given (gegeben)
        String testPassword = "justice_man";

        //when (Wenn....)
        String actual = PasswordValidator.validatePassword(testPassword);

        //then (Dann....!)
        assertEquals("PASSWORD SHOULD HAVE NUMBERS!", actual);
    }

    @Test
    void shouldHaveUppercaseInPassword(){
        //given (gegeben)
        String testPassword = "justice3_man";

        //when (Wenn....)
        String actual = PasswordValidator.validatePassword(testPassword);

        //then (Dann....!)
        assertEquals("PASSWORD SHOULD HAVE AT LEAST ONE UPPERCASE CHARACTER!", actual);
    }

    @Test
    void shouldHaveLowercaseInPassword(){
        //given (gegeben)
        String testPassword = "JUSTIC3_M4N";

        //when (Wenn....)
        String actual = PasswordValidator.validatePassword(testPassword);

        //then (Dann....!)
        assertEquals("PASSWORD SHOULD HAVE AT LEAST ONE UPPERCASE CHARACTER!", actual);
    }

}