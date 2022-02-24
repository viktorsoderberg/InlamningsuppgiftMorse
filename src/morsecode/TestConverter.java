package morsecode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConverter {

    @Test
    public void testConvertVToMorse() {

        Converter converter = new Converter();

        //Convert letter V to ***-
        String letter = "V";

        String actual = converter.morseConvert(letter);

        assertEquals("***-", actual);
    }

    @Test
    public void testConvertMorseToV() {

        Converter converter = new Converter();

        //Convert letter ***- to V
        String letter = "***-";

        String actual = converter.morseConvert(letter);

        assertEquals("V", actual);
    }

    @Test
    public void testGetError() {

        Converter converter = new Converter();

        //Get error message
        String letter = "!";

        String actual = converter.morseConvert(letter);

        assertEquals("You wrote something wrong", actual);
    }


}
