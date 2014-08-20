package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Test;
import src.Anagrams;
public class AnagramsTest {
/**
 * "a" 1!/1!

"aa" 2!/2!

"ab" 2!/(1!*1!)

"abc" 3!/(1!*1!*1!)

"aab" 3!/(2!*1!)

"abcd" 4!/(1!*1!*1!*1!) 

"aacd" 12 = 4!/(2!*1!*1!)

"aaad" 4 = 4!/(3!*1!)

"aacc" 6 = 4!/(2!*2!)

 */
    @Test
    public void shouldReturn1WordWithStringA() {
        String word = "a";
        Anagrams anagramWord = new Anagrams();
        anagramWord.findAllAnagrams("", word);
        String[] expectedContentOfAnagrams = {"a"};
        int expectedLengthOfAnagrams = 1;
        ArrayList<String> uniqueAnagramsList = anagramWord.removeIdenticalStrings(anagramWord.getAnagrams());
        for (int i = 0; i < expectedContentOfAnagrams.length; i++) {
            assertTrue(anagramWord.isExist(expectedContentOfAnagrams[i], uniqueAnagramsList));
        }
        assertEquals(expectedLengthOfAnagrams, uniqueAnagramsList.size());
    }

    @Test
    public void shouldReturn1WordWithStringAA() {
        String word = "aa";
        Anagrams anagramWord = new Anagrams();
        anagramWord.findAllAnagrams("", word);
        String[] expectedContentOfAnagrams = {"aa"};
        int expectedLengthOfAnagrams = 1;
        ArrayList<String> uniqueAnagramsList = anagramWord.removeIdenticalStrings(anagramWord.getAnagrams());
        for (int i = 0; i < expectedContentOfAnagrams.length; i++) {
            assertTrue(anagramWord.isExist(expectedContentOfAnagrams[i], uniqueAnagramsList));
        }
        assertEquals(expectedLengthOfAnagrams, uniqueAnagramsList.size());
    }

    @Test
    public void shouldReturn2WordsWithStringAB() {
        String word = "ab";
        Anagrams anagramWord = new Anagrams();
        anagramWord.findAllAnagrams("", word);
        String[] expectedContentOfAnagrams = {"ab", "ba"};
        int expectedLengthOfAnagrams = 2;
        ArrayList<String> uniqueAnagramsList = anagramWord.removeIdenticalStrings(anagramWord.getAnagrams());
        for (int i = 0; i < expectedContentOfAnagrams.length; i++) {
            assertTrue(anagramWord.isExist(expectedContentOfAnagrams[i], uniqueAnagramsList));
        }
        assertEquals(expectedLengthOfAnagrams, uniqueAnagramsList.size());
    }

    @Test
    public void shouldReturn6WordsWithStringABC() {
        String word = "abc";
        Anagrams anagramWord = new Anagrams();
        anagramWord.findAllAnagrams("", word);
        String[] expectedContentOfAnagrams = {"abc", "acb", "bac", "bca", "cab", "cba"};
        int expectedLengthOfAnagrams = 6;
        ArrayList<String> uniqueAnagramsList = anagramWord.removeIdenticalStrings(anagramWord.getAnagrams());
        for (int i = 0; i < expectedContentOfAnagrams.length; i++) {
            assertTrue(anagramWord.isExist(expectedContentOfAnagrams[i], uniqueAnagramsList));
        }
        assertEquals(expectedLengthOfAnagrams, uniqueAnagramsList.size());
    }

    @Test
    public void shouldReturn3WordsWithStringAAB() {
        String word = "aab";
        Anagrams anagramWord = new Anagrams();
        anagramWord.findAllAnagrams("", word);
        String[] expectedContentOfAnagrams = {"aab", "aba", "baa"};
        int expectedLengthOfAnagrams = 3;
        ArrayList<String> uniqueAnagramsList = anagramWord.removeIdenticalStrings(anagramWord.getAnagrams());
        for (int i = 0; i < expectedContentOfAnagrams.length; i++) {
            assertTrue(anagramWord.isExist(expectedContentOfAnagrams[i], uniqueAnagramsList));
        }
        assertEquals(expectedLengthOfAnagrams, uniqueAnagramsList.size());
    }

    @Test
    public void shouldReturn24WordsWithStringABCD() {
        String word = "abcd";
        Anagrams anagramWord = new Anagrams();
        anagramWord.findAllAnagrams("", word);
        String[] expectedContentOfAnagrams = {
                "abcd", "abdc", "acbd", "acdb", "adbc", "adcb",
                "bacd", "badc", "bcad", "bcda", "bdac", "bdca",
                "cabd", "cadb", "cbad", "cbda", "cdab", "cdba",
                "dabc", "dacb", "dbac", "dbca", "dcab", "dcba"};
        int expectedLengthOfAnagrams = 24;
        ArrayList<String> uniqueAnagramsList = anagramWord.removeIdenticalStrings(anagramWord.getAnagrams());
        for (int i = 0; i < expectedContentOfAnagrams.length; i++) {
            assertTrue(anagramWord.isExist(expectedContentOfAnagrams[i], uniqueAnagramsList));
        }
        assertEquals(expectedLengthOfAnagrams, uniqueAnagramsList.size());
    }

    @Test
    public void shouldReturn12WordsWithStringAACD() {
        String word = "aacd";
        Anagrams anagramWord = new Anagrams();
        anagramWord.findAllAnagrams("", word);
        String[] expectedContentOfAnagrams = {
                "aacd", "aadc", "acad", "acda", "adac", "adca",
                "caad", "cada", "cdaa", "daac", "daca", "dcaa"};
        int expectedLengthOfAnagrams = 12;
        ArrayList<String> uniqueAnagramsList = anagramWord.removeIdenticalStrings(anagramWord.getAnagrams());
        for (int i = 0; i < expectedContentOfAnagrams.length; i++) {
            assertTrue(anagramWord.isExist(expectedContentOfAnagrams[i], uniqueAnagramsList));
        }
        assertEquals(expectedLengthOfAnagrams, uniqueAnagramsList.size());
    }

    @Test
    public void shouldReturn4WordsWithStringAAAD() {
        String word = "aaad";
        Anagrams anagramWord = new Anagrams();
        anagramWord.findAllAnagrams("", word);
        String[] expectedContentOfAnagrams = {"aaad", "aada", "adaa", "daaa"};
        int expectedLengthOfAnagrams = 4;
        ArrayList<String> uniqueAnagramsList = anagramWord.removeIdenticalStrings(anagramWord.getAnagrams());
        for (int i = 0; i < expectedContentOfAnagrams.length; i++) {
            assertTrue(anagramWord.isExist(expectedContentOfAnagrams[i], uniqueAnagramsList));
        }
        assertEquals(expectedLengthOfAnagrams, uniqueAnagramsList.size());
    }

    @Test
    public void shouldReturn6WordsWithStringAACC() {
        String word = "aacc";
        Anagrams anagramWord = new Anagrams();
        anagramWord.findAllAnagrams("", word);
        String[] expectedContentOfAnagrams = {"aacc", "acac", "acca", "caac", "caca", "ccaa"};
        int expectedLengthOfAnagrams = 6;
        ArrayList<String> uniqueAnagramsList = anagramWord.removeIdenticalStrings(anagramWord.getAnagrams());
        for (int i = 0; i < expectedContentOfAnagrams.length; i++) {
            assertTrue(anagramWord.isExist(expectedContentOfAnagrams[i], uniqueAnagramsList));
        }
        assertEquals(expectedLengthOfAnagrams, uniqueAnagramsList.size());
    }
}
