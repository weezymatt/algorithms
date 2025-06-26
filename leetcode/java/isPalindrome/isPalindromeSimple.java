// Source          : https://leetcode.com/problems/valid-palindrome/description/
// Name            : Matthew Hernandez
// Date            : 2025-06-25
// Data Structure  : Character Array
// Algorithm       : For loop & reverse string
// Time            : O(n) — only loop through the len(s) once
// Space           : O(n) - worst case appends all characters; exists O(1) solution

import java.lang.Character;

class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        return sb.toString().equals(sb.reverse().toString());
    }
}