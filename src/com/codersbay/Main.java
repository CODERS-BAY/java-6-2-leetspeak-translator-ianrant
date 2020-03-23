package com.codersbay;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        String input = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word, a phrase or a sentence:");
        input = scanner.nextLine();

        System.out.println(input);

        /*
        TODO: next up, the string from the input is processed via a switch-case
        TODO: every character is compared to the cases or the default and a new String is built

         */
        System.out.println("Your input contains "+input.length()+" characters.");
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++){
            char character = input.charAt(i);

            // ! ! ! ! !
            // ! m p 0 r 7 @ n 7
            // char = ' '
            // String = " "
            // ! ! ! ! !

            switch (character) {
                case 'A':
                case 'a':
                    output.append("@");
                    break;

                case 'B':
                case 'b':
                    output.append("8");
                    break;

                case 'C':
                case 'c':
                    output.append("(");
                    break;

                case 'E':
                case 'e':
                    output.append("3");
                    break;
                // also, I just learned that... pretty neat
                case 'G':
                case 'g':
                    output.append("6");
                    break;

                case 'H':
                case 'h':
                    output.append("#");
                    break;

                case 'I':
                case 'i':
                    output.append("!");
                    break;

                case 'L':
                case 'l':
                    output.append("1");
                    break;

                case 'O':
                case 'o':
                    output.append("0");
                    break;

                case 'S':
                case 's':
                    output.append("$");
                    break;

                case 'T':
                case 't':
                    output.append("7");
                    break;

                case 'Z':
                case 'z':
                    output.append("2");
                    break;

                default:
                    output.append(character);
            }
        }
        String result = output.toString();
        System.out.println();
        System.out.println("The leetspeak version of your input is:");
        System.out.println(result);
    }

}
