class Solution {
    public String interpret(String s) {
        s = s.replace("()", "o");
        s = s.replace("(al)", "al");
        return s;
    }
}