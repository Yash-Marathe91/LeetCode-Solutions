class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for the next valid element position
        
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not the one to remove
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move it to the front
                k++; // Move the valid element pointer forward
            }
        }
        
        return k; // Return the count of elements not equal to val
    }
}