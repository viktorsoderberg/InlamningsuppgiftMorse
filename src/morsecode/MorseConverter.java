package morsecode;

import java.util.Scanner;

public class MorseConverter {

    public static void main(String[] args) {

        Converter converter = new Converter();

        Scanner scan = new Scanner(System.in);

        System.out.println("Try out the morseconverter:");

        while (true) {
            System.out.println(converter.morseConvert(scan.nextLine()));

        }

    }

}
