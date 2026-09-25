class Solution {

    int index = 0;

    public List<String> braceExpansionII(String expression) {

        Set<String> result = solve(expression);

        List<String> ans = new ArrayList<>(result);

        Collections.sort(ans);

        return ans;
    }

    Set<String> solve(String s) {

        Set<String> result = new HashSet<>();

        while (index < s.length() && s.charAt(index) != '}') {

            Set<String> current = new HashSet<>();

            // Case 1: {
            if (s.charAt(index) == '{') {

                index++; // skip {

                current = solve(s);

                index++; // skip }

            }

            // Case 2: lowercase letter
            else {

                current.add(String.valueOf(s.charAt(index)));
                index++;
            }

            // Concatenate current with result
            if (result.isEmpty()) {
                result = current;
            }
            else {
                Set<String> temp = new HashSet<>();

                for (String a : result) {
                    for (String b : current) {
                        temp.add(a + b);
                    }
                }

                result = temp;
            }

            // Comma means union
            if (index < s.length() && s.charAt(index) == ',') {
                index++;
                
                result.addAll(solve(s));
                break;
            }
        }

        return result;
    }
}