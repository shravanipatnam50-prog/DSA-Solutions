class Solution {
    public String addBinary(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int sum=a1+b1;
        if(sum==0) return "0";
        String binary="";
        while(sum>0)
        {
            binary=(sum%2)+binary;
            sum=sum/2;
        }
        return binary;
    }
}