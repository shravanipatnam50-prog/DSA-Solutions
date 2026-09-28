import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverse = new HashMap<>();

        int i = 0;

        while (i < pattern.length()) {

            char ch = pattern.charAt(i);
            String word = words[i];

            // Check character -> word
            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(word)) {
                    return false;
                }
            } else {
                map.put(ch, word);
            }

            // Check word -> character
            if (reverse.containsKey(word)) {
                if (reverse.get(word) != ch) {
                    return false;
                }
            } else {
                reverse.put(word, ch);
            }

            i++;
        }

        return true;
    }
}