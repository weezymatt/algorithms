"""
Source			: https://leetcode.com/problems/valid-palindrome-ii/
Date			: 10/25/2025
Data Structure		: Two Pointers; inner & outer loop
Time			: O(n)
Space			: O(1)
"""

class Solution:
    def validPalindrome(self, s: str) -> bool:
        # Base case
        if len(s) == 1:
            return True
        
        # Helper Function
        def check(start: int, end: int) -> bool:
            # Return True if equal, iterates, or False
            while start < end:
                if s[start] != s[end]:
                    return False
                start, end = start + 1, end - 1
            return True
        
        i, j = 0, len(s) - 1

        while i < j:
            if s[i] != s[j]:
                # Skip == Delete
                return check(i+1,j) or check(i, j-1)
            i, j = i + 1, j - 1
        
        return True
