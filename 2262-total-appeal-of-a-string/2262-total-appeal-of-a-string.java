class Solution {
    public long appealSum(String s) {
        long totalAppeal = 0;
        long currentAppeal = 0;

        int[] lastSeen = new int[26];
        for (int i = 0; i < 26; i++) {
            lastSeen[i] = -1;
        }  
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';

            currentAppeal += (i - lastSeen[c]);
            totalAppeal += currentAppeal;
            lastSeen[c] = i;
        }
        return totalAppeal;
    }
}