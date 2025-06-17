// Source          : https://leetcode.com/problems/valid-parentheses/
// Name            : Matthew Hernandez
// Date            : 2025-06-17
// Data Structure  : HashSet
// Algorithm       : Find the start of sequence, iter count while true; similar to prefix/postfix sol.
// Time            : O(n) — only loop through the len(s) once
// Space           : O(n) - worst case when each number is unique

import java.util.HashSet;
import java.lang.Math;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longest = 0;

        for (int num : numSet) {
            // start of a new sequence
            if (!numSet.contains(num-1)) {
                int length = 0;

                while (numSet.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;

    }
}