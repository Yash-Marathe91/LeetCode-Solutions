class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> currentList, int[] nums, int start) {

        result.add(new ArrayList<>(currentList));

        for (int i = start; i < nums.length; i++) {
            currentList.add(nums[i]);
            backtrack(result, currentList, nums, i + 1);
            currentList.remove(currentList.size() - 1);
        }
    }
}