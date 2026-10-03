class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();//stores the integers in stack
        int j=0;//its tells what element need to be popped from pushed array
        for(int i=0;i<pushed.length;i++)//array of pushed 
        {
            st.push(pushed[i]);
            while(!st.isEmpty() &&  st.peek() == popped[j])
            {
                st.pop();
                j++;
            }
        }
        if(j ==  popped.length)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

