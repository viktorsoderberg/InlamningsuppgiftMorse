package morsecode;

import java.util.Scanner;

public class MorseConverter {

    public static void main(String[] args) {

        Converter converter = new Converter();

        Scanner scan = new Scanner(System.in);

        System.out.println("Try out my morseconverter. If you write stop, it will end.");

        while (true) {
            //Felhantering - göra om små bokstäver till stora
            String input = scan.nextLine().toUpperCase();

            if (input.equals("STOP")) {
                break;
            }

            System.out.println(converter.morseConvert(input));

        }


    }

}
