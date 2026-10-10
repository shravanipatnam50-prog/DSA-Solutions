class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> friends = new ArrayList<>();
        for (int i = 1; i <= n; i++) 
        {
            friends.add(i);
        }
        int i= 0;
        while (friends.size() > 1) 
        {
            i=(i + k - 1) % friends.size();
            friends.remove(i);
        }
        return friends.get(0);
    }
}