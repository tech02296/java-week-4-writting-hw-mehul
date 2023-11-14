package Programme;

import java.util.Locale;
import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

public class Programme_3_FindVowelOrConsonant {
    public static void FindVowelOrConsonant(String letter) {
        //check length of string
        //if user enter more than one character an error message is printed
        if (letter.length() > 1) {
            System.out.println("Error.Not a single character: ");
            //if user enter a symbol
        } else if (!(isItALetter(letter))) {
            System.out.println("Error.Not a letter.Enter upper case or Lower case letter:");
        } else if (letter.equals("a") || (letter.equals("e") || letter.equals("i")
                || letter.equals("0") || letter.equals("u"))) {
            System.out.println(" Input letter is a Vowel");
        } else {
            System.out.println("Input letter is Consonant");

        }
    }

    //This method will check is it a letter or not?
    public static boolean isItALetter(String l) {
        return l.charAt(0) > 96 && l.charAt(0) < 123;
    }

    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character: ");
        String str = scanner.next().toLowerCase(Locale.ROOT);
        //calling static metod
        FindVowelOrConsonant(str);
        //closing scanner
        scanner.close();
    }

}

