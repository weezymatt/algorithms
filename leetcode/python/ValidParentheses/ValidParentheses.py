"""
Source          : https://leetcode.com/problems/valid-parentheses/
Name            : Matthew Hernandez
Date            : 2025-06-09
Data Structure  : Stack
Algorithm       : Open-closed brackets, no initial closed, stack empty at the end
Time            : O(n) — only loop through the len(s) once
Space           : O(n) - worst case only appends all strings
"""

class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []
        brackets = {
            "(" : ")",
            "[" : "]",
            "{" : "}",
        }

        if len(s) == 1:
            return False
        
        for bracket in s:
            if bracket in brackets:
                stack.append(bracket)
            elif stack and bracket == brackets[stack[-1]]:
                stack.pop()
            else:
                # test cases: [), )
                return False

        return len(stack) == 0