"""
Source          : https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
Name            : Matthew Hernandez
Date            : 2025-06-18
Data Structure  : Array
Algorithm       : two pointers (left & right) or (current & scan)
Time            : O(n) — only loop through the len(array) once
Space           : O(1) - modify in-place
"""

class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        left = 1

        for right in range(1, len(nums)):
            if (nums[right-1] != nums[right]):
                nums[left] = nums[right]
                left += 1

        return left