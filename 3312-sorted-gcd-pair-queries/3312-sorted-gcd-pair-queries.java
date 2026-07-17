class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {

        int maxVal = 0;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }

        int[] freq = new int[maxVal + 1];
        for (int num : nums) {
            freq[num]++;
        }

        long[] countDivisible = new long[maxVal + 1];
        for (int i = 1; i <= maxVal; i++) {
            for (int j = i; j <= maxVal; j += i) {
                countDivisible[i] += freq[j];
            }
        }

        long[] gcdCount = new long[maxVal + 1];
        for (int i = maxVal; i >= 1; i--) {
            long totalPairs = (countDivisible[i] * (countDivisible[i] - 1)) / 2;
  
            for (int j = 2 * i; j <= maxVal; j += i) {
                totalPairs -= gcdCount[j];
            }
            gcdCount[i] = totalPairs;
        }

        long[] prefixSum = new long[maxVal + 1];
        for (int i = 1; i <= maxVal; i++) {
            prefixSum[i] = prefixSum[i - 1] + gcdCount[i];
        }

        // 6. Process each query using binary search
        int[] answer = new int[queries.length];
        for (int q = 0; q < queries.length; q++) {
            long target = queries[q];

            int low = 1, high = maxVal, res = maxVal;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (prefixSum[mid] > target) {
                    res = mid;   
                    high = mid - 1;
                } else {
                    low = mid + 1;  
                }
            }
            answer[q] = res;
        }
        return answer;
    }
}