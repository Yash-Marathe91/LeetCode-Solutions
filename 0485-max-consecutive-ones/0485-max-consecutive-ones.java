class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxconsecutive = 0;
        int currentconsecutive = 0;
        for (int num : nums){
            if (num == 1){
                currentconsecutive++;
                if (currentconsecutive > maxconsecutive){
                    maxconsecutive = currentconsecutive;
                }
            }
            else {
                currentconsecutive = 0;
            }
        }
        return maxconsecutive;
    }
}