package withoutextraspace;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/
 * Runtime: 6 ms, faster than 89.98% of Java online submissions for Find All Duplicates in an Array.
 * Memory Usage: 48.7 MB, less than 36.11% of Java online submissions for Find All Duplicates in an Array.
 */


public class Solution {

    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> duplicates = new ArrayList<>();

        int n = nums.length;  // number of elements in array nums[]

        for(int i=0; i<n; i++){

            int number = Math.abs(nums[i]);   // number stores the integer at index i

            if(nums[number - 1] > 0)                  // if visiting first time mark negative
                nums[number - 1] = -nums[number - 1];
            else if(nums[number - 1] < 0)             // if already negative add to  duplicate
                duplicates.add(number);


        }

        return duplicates;

    }

}
