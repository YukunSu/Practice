package src;

import java.util.ArrayList;
import java.util.Scanner;

public class RunAnagrams {


    public static void printDashes(int howMany) {
        for (int i = 0; i < howMany; i++) {
            System.out.print("-");
        }
    }

    /**
     * size check
     * identical string check
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Anagram Maker ...");
        System.out.println("\t... a program which uses recursion to list "
                + "the anagrams of a word.\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word > ");
        String word = scanner.next();
        scanner.close();

        System.out.println("The anagrams of " + word + " are:");
        System.out.print("----------------");
        printDashes(word.length());
        System.out.println("-----");
        Anagrams a = new Anagrams();
        a.findAllAnagrams("", word);
        ArrayList<String> anagrams = a.getAnagrams();
        for (int i = 0; i < anagrams.size(); i++) {
            System.out.print(anagrams.get(i)+" ");
        }
        System.out
                .println("\n\nThanks for using \"Anagram Maker\" -- where words "
                        + "come to life.\n\n");

    }

}
