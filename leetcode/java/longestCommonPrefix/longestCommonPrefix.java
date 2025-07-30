// Source          : https://leetcode.com/problems/longest-common-prefix/description/
// Name            : Matthew Hernandez
// Date            : 2025-07-30
// Data Structure  : String Array
// Algorithm       : Iterate through all strings/characters while checking for equivalence
// Time            : O(n) — only loop through the len(s) once
// Space           : O(1) - one result string is needed

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";

        for (int i=0; i < strs[0].length(); i++) {
            for (String s : strs) {
                if (i == s.length() || s.charAt(i) != strs[0].charAt(i) ) {
                    return result;
                }
            }
            result = result + strs[0].charAt(i);
        }
        return result;        
    }
}