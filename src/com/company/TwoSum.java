package com.company;

import java.util.Arrays;

public class TwoSum {
    int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}

class TwoSumTest {
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
            int[] a = ts.twoSum(new int[]{1, 2, 3, 4}, 3);
            System.out.println(Arrays.toString(a));
        }
    }


