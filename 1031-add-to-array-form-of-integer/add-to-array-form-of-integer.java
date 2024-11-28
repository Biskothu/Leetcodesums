import java.util.*;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        
        // Start from the last element of the 'num' array.
        int i = num.length - 1;
        int carry = k;

        // Traverse the array from right to left
        while (i >= 0 || carry > 0) {
            // Add the current digit and carry (if any)
            if (i >= 0) {
                carry += num[i]; // Add the current digit to carry
            }

            // The new digit is the result of carry % 10
            ans.add(carry % 10);
            
            // Update the carry (carry // 10)
            carry /= 10;

            i--;
        }

        // Reverse the list since we added digits starting from the least significant digit
        Collections.reverse(ans);

        return ans;
    }
}
