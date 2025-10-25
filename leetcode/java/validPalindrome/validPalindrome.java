// Source		: https://leetcode.com/problems/valid-palindrome-ii/
// Date			: 10/25/2025
// Data Structure	: Two Pointers; inner & outer loop
// Time			: O(n)
// Space		: O(1)

class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return check(i+1,j, s) || check(i,j-1, s);
            }
            i = i + 1;
            j = j - 1;
        }
        return true;
       
    }

    public boolean check(int start, int end, String str) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start = start + 1;
            end = end - 1;
        }
        return true;
    }
}
