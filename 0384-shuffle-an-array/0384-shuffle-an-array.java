class Solution {
    private int[] original;
    private int[] array;
    private Random rand;

    public Solution(int[] nums) {
        this.original = nums.clone();
        this.array = nums.clone();
        this.rand = new Random();
    }

    public int[] reset() {
        array = original.clone();
        return original;
    }

    public int[] shuffle() {
        for (int i = 0; i < array.length; i++) {
            int randomIndex = i + rand.nextInt(array.length - i);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
        return array;
    }
}