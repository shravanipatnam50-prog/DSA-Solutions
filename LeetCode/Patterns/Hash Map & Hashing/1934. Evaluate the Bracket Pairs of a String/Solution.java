class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        HashMap<String, String> map = new HashMap<>();

        int i = 0;

        while (i < knowledge.size()) {
            String key = knowledge.get(i).get(0);
            String value = knowledge.get(i).get(1);

            map.put(key, value);
            i++;
        }

        String ans = "";
        i = 0;

        while (i < s.length()) {

            if (s.charAt(i) == '(') {

                int j = i + 1;

                while (s.charAt(j) != ')') {
                    j++;
                }

                String key = s.substring(i + 1, j);

                if (map.containsKey(key)) {
                    ans = ans + map.get(key);
                } else {
                    ans = ans + "?";
                }

                i = j + 1;

            } else {
                ans = ans + s.charAt(i);
                i++;
            }
        }

        return ans;
    }
}