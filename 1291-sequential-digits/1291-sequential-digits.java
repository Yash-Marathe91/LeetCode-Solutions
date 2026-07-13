class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();

        for (int length = 2; length <= 9; length++) {

            for (int startDigit = 1; startDigit <= 10 - length; startDigit++) {
                int num = 0;
                int currentDigit = startDigit;
                for (int i = 0; i < length; i++) {
                    num = num * 10 + currentDigit;
                    currentDigit++;
                }
                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }
        
        return result;
    }
}