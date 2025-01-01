class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;

        // Try each x from 0 to n
        for (int x = 0; x <= n; x++) {
            int count = 0;
            // Count how many numbers are >= x
            for (int num : nums) {
                if (num >= x) {
                    count++;
                }
            }
            // If the count is exactly x, then we have found the special number
            if (count == x) {
                return x;
            }
        }
        // No special value found
        return -1;
    }
}
