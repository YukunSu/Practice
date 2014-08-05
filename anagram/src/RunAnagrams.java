package src;

import java.util.ArrayList;
import java.util.Scanner;

public class RunAnagrams {
    public static void main(String[] args) {
        System.out.println("---=== Anagram Maker ===---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String input = scanner.next();
        scanner.close();

        String displayMessage = "\nThe anagrams of " + input + " are:";
        System.out.println(displayMessage);
        printDashes(displayMessage.length());

        Anagrams anagramWord = new Anagrams();
        anagramWord.findAllAnagrams("", input);
        ArrayList<String> uniqueAnagramsList = anagramWord.removeIdenticalStrings(anagramWord.getAnagrams());
        printAnagrams(uniqueAnagramsList);
    }

    public static void printAnagrams(ArrayList<String> anagrams) {
        for (int i = 0; i < anagrams.size(); i++) {
            System.out.print(anagrams.get(i)+" ");
        }
    }

    public static void printDashes(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
