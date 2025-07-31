// Source          : https://leetcode.com/problems/remove-element
// Name            : Matthew Hernandez
// Date            : 2025-07-30
// Data Structure  : Array
// Algorithm       : Partition using two pointers (k & i). Similar to quick-sort
// Time            : O(n) — only loop through the len(s) once
// Space           : O(1) - removes all occurrences of val in nums in-place

class Solution {
	public int removeElement(int[] nums, int val) {
		int k = 0;

		for (int i=0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[k] = nums[i];
				k += 1;
			}
		}
		return k;
	}
}