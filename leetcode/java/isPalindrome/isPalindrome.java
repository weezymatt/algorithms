// Source          : https://leetcode.com/problems/valid-palindrome/description/
// Name            : Matthew Hernandez
// Date            : 2025-06-25
// Data Structure  : Character Array
// Algorithm       : Two pointers (left & right) until finished/not equal
// Time            : O(n) — only loop through the len(s) once
// Space           : O(1) - no extra space is used; the array is enough

import java.lang.Character;

class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        int left=0; int right=s.length()-1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (right > left && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)) ) {
                return false;
            }
            left++;right--;
        }

        return true;
    }
}