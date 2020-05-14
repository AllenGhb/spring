package com.allen.circulardependence;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个数组，给定一个数字。返回数组中可以相加得到指定数字的两个索引。
 * 比如：给定nums = [2, 7, 11, 15], target = 9
 * 那么要返回 [0, 1]，因为2 + 7 = 9
 * @author 周何圳 2020/5/13 新建
 * @description
 */
public class twoSum {

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		System.out.println(Arrays.toString(twoSum(nums,9)));
	}

}
