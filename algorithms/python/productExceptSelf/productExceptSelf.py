"""
Source	: https://leetcode.com/problems/product-of-array-except-self/
Name	: Matthew Hernandez
Date	: 2025-06-04

Prefix & Suffix solution with space complexity O(n)
– Not the most optimal solution but intuitive (besides brute-force)
"""

class Solution(object):
	def productExceptSelf(self, nums):
		"""
		:type nums: List[int]
		:rtype: List[int]
		"""
		n = len(nums)
		prefix = [1] * n
		suffix = [1] * n
		result = [1] * n

		# Fill prefix array
		for i in range(1, n):
			prefix[i] = prefix[i - 1] * nums[i - 1]

		# Fill suffix array
		for i in range(n - 2, -1, -1):
			suffix[i] = suffix[i + 1] * nums[i + 1]

		# Fill product array
		for i in range(0, n):
			result[i] = prefix[i] * suffix[i]

		return result













