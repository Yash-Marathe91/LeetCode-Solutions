class Solution {
    public String countAndSay(int n) {
        // Base case
        String current = "1";
        
        // Build the sequence iteratively up to n
        for (int i = 2; i <= n; i++) {
            StringBuilder nextString = new StringBuilder();
            int len = current.length();
            int j = 0;
            
            while (j < len) {
                char ch = current.charAt(j);
                int count = 0;
                
                // Count consecutive occurrences of the same character
                while (j < len && current.charAt(j) == ch) {
                    count++;
                    j++;
                }
                
                // Append the frequency followed by the character
                nextString.append(count).append(ch);
            }
            
            current = nextString.toString();
        }
        
        return current;
    }
}