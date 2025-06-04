// Source	: https://leetcode.com/problems/top-k-frequent-elements/
// Author	: Matthew Hernandez
// Date		: 2025-06-4
/*
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
*/

// Algorithm: bucket sort
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }   
        }

        // trick here... can instead use something more explicit. i.e., List<List<Integer>> 
        // but requires initialization and more costly.
        @SuppressWarnings("unchecked")
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (bucket[freq] == null) bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
        }

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = nums.length; i > 0 && res.size() < k; i--) {
            if (bucket[i] != null) res.addAll(bucket[i]);
        }

        int[] topK = new int[k];

        for (int i = 0; i < k; i++) {
            topK[i] = res.get(i);
        }

        return topK;
    }
}