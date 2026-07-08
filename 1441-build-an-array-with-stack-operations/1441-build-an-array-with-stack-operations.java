class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> operations = new ArrayList<>();
        int targetIdx = 0; 
        for (int i = 1; i <= n; i++) {

            if (targetIdx >= target.length) {
                break;
            }

            operations.add("Push");

            if (i == target[targetIdx]) {
                targetIdx++;
            } else {

                operations.add("Pop");
            }
        } 
        return operations;
    }
}