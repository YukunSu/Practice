package src;

import java.util.ArrayList;

public class Anagrams {
    private ArrayList<String> anagrams = new ArrayList<String>();

    public ArrayList<String> getAnagrams() {
        return anagrams;
    }

    public void findAllAnagrams(String prefix, String word) {
        if (word.length() <= 1) {
            anagrams.add((prefix + word));
        } else {
            for (int i = 0, l = word.length(); i < l; i++) {
                String middle = word.substring(i, i + 1);
                String before = word.substring(0, i);
                String after = word.substring(i + 1);
                findAllAnagrams(prefix + middle, before + after);
            }
        }
    }

    private void addToAnagramsList(String word) {
        anagrams.add(word);
    }

    // verify size
    // verify identical strings
}
