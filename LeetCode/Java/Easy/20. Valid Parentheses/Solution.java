//brute force
/*
class Solution {
    public boolean isValid(String s) {
        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }
        if(s.length() == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}*/


//optimal using Stack


class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{')
            {
                st.push(ch);
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                char top=st.peek();
                if((ch == ')' && top =='(') || (ch == ']' && top =='[') || (ch == '}' && top =='{'))
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        if(st.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
