package com.leet;

import java.util.ArrayList;
import java.util.List;

/*
* 46. Permutations - https://leetcode.com/problems/permutations/
*
* Algorithm

Initialize an answer array ans and an array curr to build permutations with.
Create a backtrack function that takes curr as an argument:
    If curr.length == nums.length, add a copy of curr to ans and return.
    Iterate over nums. For each num, if num is not in curr, do the following:
        Add num to curr and call backtrack(curr), then remove num from curr.
Call backtrack with an initially empty curr.
Return ans.
 * */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(nums, result, new ArrayList<>());
        return result;
    }

    private void backtrack(int[] nums, List<List<Integer>> result, List<Integer> curr) {
        if(curr.size() == nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }

        for (Integer n: nums) {
            if(!curr.contains(n)){
                curr.add(n);
                backtrack(nums, result, curr);
                curr.remove(curr.size() - 1);
            }
        }
    }
}
