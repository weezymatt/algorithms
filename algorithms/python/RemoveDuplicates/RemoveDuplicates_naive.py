"""
Source          : https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
Name            : Matthew Hernandez
Date            : 2025-06-18
Data Structure  : Array
Algorithm       : iterate and pop
Time            : O(n) — only loop through the len(array) once
Space           : O(1) - modify in-place
"""

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        i = 1

        while i < len(nums):
            if (nums[i] == nums[i - 1]):
                del nums[i] # slightly more efficient than .pop() method
            else:
                i += 1

        return len(nums)