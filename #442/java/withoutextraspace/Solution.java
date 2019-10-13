package withoutextraspace;

import java.util.ArrayList;
import java.util.List;


/**
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 *
 * Find all the elements that appear twice in this array.
 *
 * Could you do it without extra space and in O(n) runtime?
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
