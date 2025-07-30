"""
Source          : https://leetcode.com/problems/longest-common-prefix/description/
Name            : Matthew Hernandez
Date            : 2025-07-30
Data Structure  : String Array
Algorithm       : Iterate through all strings/characters while checking for equivalence
Time            : O(n) — only loop through the len(s) once
Space           : O(1) - one result string is needed
"""

class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        res = ""

        for i in range(len(strs[0])):
            for s in strs:
                if i == len(s) or s[i] != strs[0][i]:
                    return res
            res += strs[0][i]
        
        return res