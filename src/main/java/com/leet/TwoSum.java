package com.leet;

import java.util.HashMap;
import java.util.Map;

/*
 * 1. Two Sum - https://leetcode.com/problems/two-sum
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum {

    /*
     * Brute Force
     * Run 2 nested loops
     * Iterate and compare each element with every other element in the array, which would be O(n^2)
     *
     * Optimum Solution
     * We keep track of elements in the map which will be used to find the required value = (target - current value)
     * Iterate over the nums array and maintain a map with key as (target - current value) with value as index
     * until we find the required value in the map
     *
     * */
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> numberToIndex = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];
            if (numberToIndex.containsKey(required)) {
                return new int[]{i, numberToIndex.get(required)};
            } else {
                numberToIndex.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
