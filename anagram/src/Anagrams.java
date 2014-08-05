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

    /**
     * Remove identical strings in the list and return it.
     * @param InputAnagrams
     * @return
     */
    public ArrayList<String> removeIdenticalStrings(ArrayList<String> inputAnagrams) {
        ArrayList<String> uniqueAnagrams = new ArrayList<String>();

        for (int i = 0; i < inputAnagrams.size(); i++) {
            if (!isExist(inputAnagrams.get(i), uniqueAnagrams)) {
                uniqueAnagrams.add(inputAnagrams.get(i));
            }
        }
        return uniqueAnagrams;
    }
    
    public int sizeOfUniqueAnagrams(String s) {
        return 0;
    }

    public boolean isExist(String word, ArrayList<String> anagramList) {
        for (int i = 0; i < anagramList.size(); i++) {
            if (word.equals(anagramList.get(i))) {
                return true;
            }
        }
        return false;
    }

    // verify size
}
