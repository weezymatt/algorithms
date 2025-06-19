"""
Source          : https://leetcode.com/problems/longest-consecutive-sequence/description/
Name            : Matthew Hernandez
Date            : 2025-06-11
Data Structure  : Set
Algorithm       : Single pass (find starting and continuous sequence)
Time            : O(n)
Space           : O(n) — conversion in set
"""

class Solution(object):
    def longestConsecutive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        num_set = set(nums)
        longest = 0 # default longest sequence

        for n in num_set:
            # check if n is the start of the sequence
            if (n - 1) not in num_set:
                # initialize length to iteratively find length
                length = 0
                while (n + length) in num_set:
                    length += 1
                longest = max(length, longest)
        
        return longest