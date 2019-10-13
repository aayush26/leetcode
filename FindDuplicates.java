package com.jagjit.Hactoberfest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicates {

	// function that return the value
	private static List<Integer> findDuplicates(int[] nums) {

		List<Integer> result = new ArrayList<Integer>();

		// initialising the hashmap
		int count = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		//iterates through every element 
		for (int i = 0; i < nums.length; i++) {
			
			//if map contains duplicate value then add to result list
			if (map.containsKey(nums[i])) {
				result.add(nums[i]);
			}
			//putting the value in the map
			map.put(nums[i], count++);
		}
		
		//return the final list
		return result;

	}

	public static void main(String[] args) {

		// allocating memory for 5 integers.
		int[] nums = new int[8];

		// initialize the first elements of the array
		nums[0] = 4;
		nums[1] = 3;
		nums[2] = 2;
		nums[3] = 7;
		nums[4] = 8;
		nums[5] = 2;
		nums[6] = 3;
		nums[7] = 1;

		List<Integer> result = findDuplicates(nums);

		for (Integer i : result) {
			
			//print the value of duplicates value
			System.out.print(i + " ");

		}

	}

}
