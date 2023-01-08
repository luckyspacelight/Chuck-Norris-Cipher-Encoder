package chucknorris;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean isActive = true;

        while (isActive) {

            System.out.println("\nPlease input operation (encode/decode/exit):");

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            switch (input) {
                case "encode":
                    encodeString();
                    System.out.println();
                    break;
                case "decode":
                    decodeString();
                    System.out.println();
                    break;
                case "exit":
                    System.out.println("Bye!");
                    isActive = false;
                    break;
                default:
                    System.out.printf("There is no '%s' operation \n\n", input);
                    break;
            }
        }


    }

    private static boolean checkContainOnlyZeros(String inputString){
        for (int i = 0; i < inputString.length(); i++) {
            return inputString.matches("^[0]+$");
        }
        return false;
    }

    private static void decodeString() {

        System.out.println("Input encoded string:");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = 2;

        String[] tmpSubStrings = input.split(" ");

        final int newArrLength = tmpSubStrings.length / n;

        // 3° check not valid encoded messages
        if (tmpSubStrings.length % n != 0) {
            System.out.print("Encoded string is not valid.");
            return;Last update
        }

        String[] subStrings = new String[newArrLength];

        boolean isZeros = false;
        boolean isContainingOnlyZeros = false;

        for (int i = 0; i < tmpSubStrings.length; i++) {

            // 1° check not valid encoded messages
            isContainingOnlyZeros = checkContainOnlyZeros(tmpSubStrings[i]);
            if (!isContainingOnlyZeros) {
                System.out.print("Encoded string is not valid.");
                return;
            }

            if (i % n == 0) {

                // 2° check not valid encoded messages
                if (!tmpSubStrings[i].equals("00") && !tmpSubStrings[i].equals("0")) {
                    System.out.print("Encoded string is not valid.");
                    return;
                }

                if (tmpSubStrings[i].equals("00")) {
                    isZeros = true;
                } else {
                    isZeros = false;
                }


            } else {
                if (isZeros){
                    subStrings[i/n] = tmpSubStrings[i];
                } else {
                    subStrings[i/n] = tmpSubStrings[i].replaceAll("0", "1");
                }
            }


        }

        String strBinaryDigit = "";
        for (String substring : subStrings) {
            strBinaryDigit += substring;
        }

        // 4° check not valid encoded messages
        if (strBinaryDigit.length() % 7 != 0) {
            System.out.print("Encoded string is not valid.");
            return;
        }

        String[] binaryDigits = strBinaryDigit.split("(?<=\\G.{" + 7 + "})");

        System.out.println("Decoded string:");
        int decimalValue = 0;
        for (String binaryDigit : binaryDigits) {
            decimalValue = Integer.parseInt(binaryDigit,2);
            char character = (char) decimalValue;
            System.out.print(character);
        }
    }

    private static void encodeString(){
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String output = "";
        char tmpDigit = ' ';
        String space = "";

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            int decimalValue = (int) character;
            String binaryValue = Integer.toBinaryString(decimalValue);
            String binaryValueFormatted = String.format("%7s", binaryValue).replaceAll(" ", "0");

            for (int j = 0; j < binaryValueFormatted.length(); j++) {
                char binaryDigit = binaryValueFormatted.charAt(j);

                if (tmpDigit != binaryDigit) {
                    space = (j == 0 && i == 0) ? "" : " ";
                    if (binaryDigit == '1'){
                        output = output + space + "0 0";
                        tmpDigit = '1';
                    } else if (binaryDigit == '0') {
                        output = output + space + "00 0";
                        tmpDigit = '0';
                    }
                } else {
                    output = output + "0";
                }
            }
        }
        System.out.println("Encoded string:");
        System.out.println(output);
    }

}