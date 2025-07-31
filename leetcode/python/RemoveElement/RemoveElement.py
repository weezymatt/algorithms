"""
Source          : https://leetcode.com/problems/remove-element
Name            : Matthew Hernandez
Date            : 2025-07-30
Data Structure  : Array
Algorithm       : Partition using two pointers (k & i). Similar to quick-sort
Time            : O(n) — only loop through the len(s) once
Space           : O(1) - removes all occurrences of val in nums in-place
"""
class Solution:
	def removeElement(self, nums: List[int], val: int) -> int:
		k = 0;

		for i in range(len(nums)):
			if nums[i] != val:
				nums[k] = nums[i]
				k += 1
		return k