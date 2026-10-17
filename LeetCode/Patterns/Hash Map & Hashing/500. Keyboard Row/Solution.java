class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            String row;

            char ch = word.charAt(0);

            if (row1.indexOf(ch) != -1) {
                row = row1;
            } else if (row2.indexOf(ch) != -1) {
                row = row2;
            } else {
                row = row3;
            }

            boolean valid = true;

            for (int j = 0; j < word.length(); j++) {
                if (row.indexOf(word.charAt(j)) == -1) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                ans.add(words[i]);
            }
        }

        return ans.toArray(new String[0]);
    }
}