
class Solution {
    public boolean isPalindromic(String s) {
        String binary = "";

        for (int i = 0; i < s.length(); i++) {
            int ascii = s.charAt(i);

            String b = Integer.toBinaryString(ascii);

            while (b.length() < 8) {
                b = "0" + b;
            }

            binary = binary + b;
        }

        String rev = "";

        for (int i = binary.length() - 1; i >= 0; i--) {
            rev = rev + binary.charAt(i);
        }

        return binary.equals(rev);
    }
}
