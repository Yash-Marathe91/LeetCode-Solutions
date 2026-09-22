class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int start = 0;
        
        for (int end = 0; end <= n; end++) {

            if (end == n || arr[end] == ' ') {
                int left = start;
                int right = end - 1;

                while (left < right) {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
                start = end + 1;
            }
        }   
        return new String(arr);
    }
}