package morsecode;

import java.util.HashMap;

public class Converter {

    private HashMap<String, String> morseCode;

    public Converter() {

        morseCode = new HashMap<>();

        morseCode.put("A", "*-");
        morseCode.put("*-", "A");

        morseCode.put("B", "-***");
        morseCode.put("-***", "B");

        morseCode.put("C", "-*-*");
        morseCode.put("-*-*", "C");

        morseCode.put("D", "-**");
        morseCode.put("-**", "D");

        morseCode.put("E", "*");
        morseCode.put("*", "E");

        morseCode.put("F", "**-*");
        morseCode.put("**-*", "F");

        morseCode.put("G", "--*");
        morseCode.put("--*", "G");

        morseCode.put("H", "****");
        morseCode.put("****", "H");

        morseCode.put("I", "**");
        morseCode.put("**", "I");

        morseCode.put("J", "*---");
        morseCode.put("*---", "J");

        morseCode.put("K", "-*-");
        morseCode.put("-*-", "K");

        morseCode.put("L", "*-**");
        morseCode.put("*-**", "L");

        morseCode.put("M", "--");
        morseCode.put("--", "M");

        morseCode.put("N", "-*");
        morseCode.put("-*", "N");

        morseCode.put("O", "---");
        morseCode.put("---", "O");

        morseCode.put("P", "*--*");
        morseCode.put("*--*", "P");

        morseCode.put("Q", "--*-");
        morseCode.put("--*-", "Q");

        morseCode.put("R", "*-*");
        morseCode.put("*-*", "R");

        morseCode.put("S", "***");
        morseCode.put("***", "S");

        morseCode.put("T", "-");
        morseCode.put("-", "T");

        morseCode.put("U", "**-");
        morseCode.put("**-", "U");

        morseCode.put("V", "***-");
        morseCode.put("***-", "V");

        morseCode.put("W", "*--");
        morseCode.put("*--", "W");

        morseCode.put("X", "-**-");
        morseCode.put("-**-", "X");

        morseCode.put("Y", "-*--");
        morseCode.put("-*--", "Y");

        morseCode.put("Z", "--**");
        morseCode.put("--**", "Z");

        morseCode.put("1", "*----");
        morseCode.put("*----", "1");

        morseCode.put("2", "**---");
        morseCode.put("**---", "2");

        morseCode.put("3", "***--");
        morseCode.put("***--", "3");

        morseCode.put("4", "****-");
        morseCode.put("****-", "4");

        morseCode.put("5", "*****");
        morseCode.put("*****", "5");

        morseCode.put("6", "-****");
        morseCode.put("-****", "6");

        morseCode.put("7", "--***");
        morseCode.put("--***", "7");

        morseCode.put("8", "---**");
        morseCode.put("---**", "8");

        morseCode.put("9", "----*");
        morseCode.put("----*", "9");

        morseCode.put("0", "-----");
        morseCode.put("-----", "0");

        morseCode.put(".", "*-*-*-");
        morseCode.put("*-*-*-", ".");

        morseCode.put(",", "--**--");
        morseCode.put("--**--", ",");

        morseCode.put("?", "**--**");
        morseCode.put("**--**", "?");

    }

    public String morseConvert(String letter) {

        //Felhantering - göra om små bokstäver till stora
        letter = letter.toUpperCase();

        String userInput = morseCode.get(letter);

        //Felhantering - något skrivs in som inte kan översättas
        if (userInput == null) {
            userInput = "You wrote something wrong";
        }

        return userInput;


    }

}

