// Source      : https://leetcode.com/problems/product-of-array-except-self/
// Author      : Matthew Hernandez
// Date        : 2025-06-6
// Algorithm   : Prefix, Postfix arrays

import java.util.Arrays;


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        Arrays.fill(prefix, 1);
        int[] postfix = prefix.clone();
        int[] res = new int[n];

        // Fill prefix array
        for (int i=1; i < nums.length;i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        // Fill postfix array
        for (int i=nums.length-2; i > -1;i--){
            postfix[i] = postfix[i+1] * nums[i+1];
        }
        // Fill product array
        for (int i=0; i < nums.length;i++) {
            res[i] = prefix[i] * postfix[i];
        }
        return res;
        // return new int[]{};
        
    }
}