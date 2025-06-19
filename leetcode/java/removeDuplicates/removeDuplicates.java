// Source          : https://leetcode.com/problems/valid-parentheses/
// Name            : Matthew Hernandez
// Date            : 2025-06-18
// Data Structure  : Array
// Algorithm       : two pointers (left & right) or (current & scan)
// Time            : O(n) — only loop through the len(s) once
// Space           : O(1) - modify array in-place

class Solution {
    public int removeDuplicates(int[] nums) {
        Integer left = 1;

        for (int right=1; right < nums.length; right++) {
            if (nums[right - 1] != nums[right]) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
        
    }
}